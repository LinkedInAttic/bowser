/*
 * Copyright 2010-2011 LinkedIn Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.linkedin.bowser.core.eval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import jsr166y.ForkJoinPool;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.linkedin.bowser.core.exceptions.AttributeError;
import com.linkedin.bowser.core.exceptions.NameError;
import com.linkedin.bowser.core.exceptions.TypeError;
import com.linkedin.bowser.core.expn.ArithmeticExpn;
import com.linkedin.bowser.core.expn.AttrExpn;
import com.linkedin.bowser.core.expn.CallableExpn;
import com.linkedin.bowser.core.expn.ConditionalExpn;
import com.linkedin.bowser.core.expn.Expn;
import com.linkedin.bowser.core.expn.ExpnVisitor;
import com.linkedin.bowser.core.expn.InExpn;
import com.linkedin.bowser.core.expn.ListComprehensionExpn;
import com.linkedin.bowser.core.expn.ListExpn;
import com.linkedin.bowser.core.expn.LiteralExpn;
import com.linkedin.bowser.core.expn.LogicalExpn;
import com.linkedin.bowser.core.expn.MapExpn;
import com.linkedin.bowser.core.expn.Operator;
import com.linkedin.bowser.core.expn.RelationalExpn;
import com.linkedin.bowser.core.expn.SetExpn;
import com.linkedin.bowser.core.expn.SliceExpn;
import com.linkedin.bowser.core.expn.SubscriptExpn;
import com.linkedin.bowser.core.expn.SymbolExpn;
import com.linkedin.bowser.core.expn.TupleExpn;
import com.linkedin.bowser.core.expn.Type;
import com.linkedin.bowser.core.expn.UnaryMinusExpn;
import com.linkedin.bowser.core.expn.UnaryNotExpn;
import com.linkedin.bowser.core.objects.Attributable;
import com.linkedin.bowser.core.objects.Collection;
import com.linkedin.bowser.core.objects.ListObject;
import com.linkedin.bowser.core.objects.MapObject;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Numeric;
import com.linkedin.bowser.core.objects.Objects;
import com.linkedin.bowser.core.objects.Sequence;
import com.linkedin.bowser.core.objects.SetObject;
import com.linkedin.bowser.core.objects.Subscriptable;
import com.linkedin.bowser.core.objects.TupleObject;

/**
 * This class should not be reused, and is not thread safe
 * 
 * @author sdawson
 */
public class EvalVisitor implements ExpnVisitor<NQLObject>
{
  private final static String                   MODULE = EvalVisitor.class.getName();
  private final static Log                      log    = LogFactory.getLog(MODULE);

  private final ForkJoinPool                    _pool;
  private final ImmutableMap<String, NQLObject> _symbolMap;
  private final StringBuilder                   _evalStack;

  public EvalVisitor(ForkJoinPool pool, ImmutableMap<String, NQLObject> symbolMap)
  {
    super();
    _pool = pool;
    _symbolMap = symbolMap;
    _evalStack = new StringBuilder();
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nus.query.impl.expn.visitors.ExpnVisitor#visit(com.linkedin.nus.query
   * .impl.expn.ConditionalExpn)
   */
  @Override
  public NQLObject visit(ConditionalExpn e)
  {
    onOpening(e);

    NQLObject ifcond = e.getCondition().accept(this);

    NQLObject result;
    if (EvalHandler.isTrue(ifcond))
      result = e.getIfTrueExpn().accept(this);
    else
      result = e.getIfFalseExpn().accept(this);

    onClosing(result);

    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nus.query.impl.expn.visitors.ExpnVisitor#visit(com.linkedin.nus.query
   * .impl.expn.InExpn)
   */
  @Override
  public NQLObject visit(InExpn e)
  {
    onOpening(e);

    NQLObject result;

    NQLObject right = e.getRight().accept(this);
    NQLObject left = e.getLeft().accept(this);

    if (EvalHandler.in(left, right))
      result = Objects.create(true);
    else
      result = Objects.create(false);

    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.ListExpn)
   */
  @Override
  public NQLObject visit(ListExpn e)
  {
    onOpening(e);

    List<NQLObject> expressions = new ArrayList<NQLObject>();
    for (Expn expn : e.getExpressions())
      expressions.add(expn.accept(this));

    NQLObject result = new ListObject(expressions);
    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.MapExpn)
   */
  public NQLObject visit(MapExpn e)
  {
    onOpening(e);

    Map<NQLObject, NQLObject> mapResult = Maps.newHashMap();
    for (Entry<Expn, Expn> entry : e.getExpressions().entrySet())
    {
      NQLObject left = entry.getKey().accept(this);
      NQLObject right = entry.getValue().accept(this);
      mapResult.put(left, right);
    }

    NQLObject result = new MapObject(mapResult);
    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.ListExpn)
   */
  @Override
  public NQLObject visit(TupleExpn e)
  {
    onOpening(e);

    List<NQLObject> expressions = new ArrayList<NQLObject>();
    for (Expn expn : e.getExpressions())
      expressions.add(expn.accept(this));

    NQLObject result = new TupleObject(expressions.toArray(new NQLObject[0]));

    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.SetExpn)
   */
  @Override
  public NQLObject visit(SetExpn e)
  {
    onOpening(e);

    Set<NQLObject> expressions = new HashSet<NQLObject>();
    for (Expn expn : e.getExpressions())
      expressions.add(expn.accept(this));

    NQLObject result = new SetObject(expressions);
    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nus.query.impl.expn.visitors.ExpnVisitor#visit(com.linkedin.nus.query
   * .impl.expn.LogicalExpn)
   */
  @Override
  public NQLObject visit(final LogicalExpn e)
  {
    onOpening(e);

    NQLObject left = e.getLeft().accept(this);

    NQLObject result;
    if (!EvalHandler.isTrue(left) || e.getOperator() == Operator.OR)
      result = left;
    else
      result = e.getRight().accept(this);

    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nus.query.impl.expn.visitors.ExpnVisitor#visit(com.linkedin.nus.query
   * .impl.expn.RelationalExpn)
   */
  @Override
  public NQLObject visit(RelationalExpn e)
  {
    onOpening(e);

    NQLObject left = e.getLeft().accept(this);
    NQLObject right = e.getRight().accept(this);

    boolean eval;

    switch (e.getOperator())
    {
    case LT:
      eval = EvalHandler.lt(left, right);
      break;
    case LTE:
      eval = EvalHandler.lte(left, right);
      break;
    case GT:
      eval = EvalHandler.gt(left, right);
      break;
    case GTE:
      eval = EvalHandler.gte(left, right);
      break;
    case EQ:
      eval = EvalHandler.eq(left, right);
      break;
    case NEQ:
      eval = EvalHandler.neq(left, right);
      break;
    default:
      throw new UnsupportedOperationException("operand not supported for RelationalExpn: "
          + e.getOperator());
    }

    NQLObject result = Objects.create(eval);

    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nus.query.impl.expn.visitors.ExpnVisitor#visit(com.linkedin.nus.query
   * .impl.expn.NQLObject)
   */
  @Override
  public NQLObject visit(LiteralExpn e)
  {
    onOpening(e);
    NQLObject result = e.getLiteral();
    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nus.query.impl.expn.visitors.ExpnVisitor#visit(com.linkedin.nus.query
   * .impl.expn.UnaryMinusExpn)
   */
  @Override
  public NQLObject visit(UnaryMinusExpn e)
  {
    onOpening(e);

    NQLObject result = e.getExpn().accept(this);
    NQLObject minusResult = EvalHandler.minus(result);

    onClosing(minusResult);
    return minusResult;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nus.query.impl.expn.visitors.ExpnVisitor#visit(com.linkedin.nus.query
   * .impl.expn.UnaryNotExpn)
   */
  @Override
  public NQLObject visit(UnaryNotExpn e)
  {
    onOpening(e);

    NQLObject result = e.getExpn().accept(this);
    NQLObject notResult;
    if (EvalHandler.isTrue(result))
      notResult = Objects.create(false);
    else
      notResult = Objects.create(true);

    onClosing(notResult);
    return notResult;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.SymbolExpn)
   */
  @Override
  public NQLObject visit(SymbolExpn e)
  {
    onOpening(e);
    if (!_symbolMap.containsKey(e.getSymbol()))
      throw new NameError(e.getSymbol());

    NQLObject result = _symbolMap.get(e.getSymbol());
    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.PlusExpn)
   */
  @Override
  public NQLObject visit(ArithmeticExpn e)
  {
    onOpening(e);

    NQLObject left = e.getLeft().accept(this);
    NQLObject right = e.getRight().accept(this);

    NQLObject result;
    switch (e.getOperator())
    {
    case PLUS:
      result = EvalHandler.plus(left, right);
      break;
    case MINUS:
      result = EvalHandler.minus(left, right);
      break;
    case TIMES:
      result = EvalHandler.times(left, right);
      break;
    case DIVIDE:
      result = EvalHandler.divide(left, right);
      break;
    case MOD:
      result = EvalHandler.mod(left, right);
      break;
    default:
      throw new UnsupportedOperationException("unexpected operand: " + e.getOperator());
    }

    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.
   * ListComprehensionExpn)
   */
  @Override
  public NQLObject visit(ListComprehensionExpn e)
  {
    onOpening(e);

    // Partially evaluate output/where to ensure that the only needed symbol is the
    // iterating symbol
    PartialEvalVisitor partialEvalVisitor =
        new PartialEvalVisitor(this, Sets.newHashSet(e.getSymbol()));

    Expn preresolved = e.accept(partialEvalVisitor);
    if (preresolved.isLiteral())
      return onClosing(preresolved.as(LiteralExpn.class).getLiteral());

    e = preresolved.as(ListComprehensionExpn.class);

    NQLObject input = e.getInput().accept(this);

    if (!(input instanceof Collection))
      throw new TypeError(input, "is not iterable");

    NQLObject result;
    if (alwaysFalse(e))
    {
      result = new ListObject(Collections.<NQLObject> emptyList());
    }
    else
    {
      Collection c = (Collection) input;
      NQLObject[] args = new NQLObject[c.len()];

      int i = 0;
      for (NQLObject o : c)
        args[i++] = o;

      ListComprehensionProcessor processor = new ListComprehensionProcessor(_pool, e);
      List<NQLObject> processed = processor.process(args);
      result = new ListObject(processed);
    }

    onClosing(result);
    return result;
  }

  public NQLObject visit(SubscriptExpn e)
  {
    onOpening(e);

    NQLObject subscriptable = e.getValue().accept(this);
    if (!(subscriptable instanceof Subscriptable))
      throw new TypeError(subscriptable, "%s is not subscriptable");

    NQLObject index = e.getIndex().accept(this);
    NQLObject result = EvalHandler.subscript(subscriptable, index);

    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.CallableExpn)
   */
  @Override
  public NQLObject visit(CallableExpn e)
  {
    onOpening(e);

    NQLObject func = e.getCallable().accept(this);
    List<NQLObject> args = new ArrayList<NQLObject>();
    for (Expn arg : e.getArgs())
      args.add(arg.accept(this));

    NQLObject result =
        EvalHandler.call(Collections.unmodifiableMap(_symbolMap), func, args);
    onClosing(result);
    return result;
  }

  public NQLObject visit(SliceExpn e)
  {
    onOpening(e);

    NQLObject value = e.getSequence().accept(this);
    if (!(value instanceof Sequence))
      throw new TypeError(value, "'%s' is not a sequence");

    NQLObject left = e.getStart() == null ? null : e.getStart().accept(this);
    NQLObject right = e.getEnd() == null ? null : e.getEnd().accept(this);

    if (left != null && !(left instanceof Numeric))
      throw new TypeError(left, "start index '%s' is not numeric");
    if (right != null && !(right instanceof Numeric))
      throw new TypeError(right, "end index '%s' is not numeric");

    Sequence sequence = (Sequence) value;

    int start = left == null ? 0 : ((Numeric) left).getAsInt();
    int end = right == null ? sequence.len() : ((Numeric) right).getAsInt();

    NQLObject result = ((Sequence) sequence).range(start, end);
    onClosing(result);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.AttrExpn)
   */
  @Override
  public NQLObject visit(AttrExpn e)
  {
    onOpening(e);

    NQLObject value = e.getExpn().accept(this);

    if (!(value instanceof Attributable))
      throw new TypeError(value, "'%s' object is not attributable");

    Attributable attributable = (Attributable) value;
    if (!attributable.getAttributes().contains(e.getAttr()))
      throw new AttributeError(value, e.getAttr());

    String attr = e.getAttr();
    NQLObject result = attributable.getAttribute(attr);

    onClosing(result);
    return result;
  }

  protected void onOpening(Expn expn)
  {
    if (log.isDebugEnabled())
    {
      _evalStack.append(" (");
      _evalStack.append(expn.getTreeNode().getText());
    }
  }

  protected NQLObject onClosing(NQLObject result)
  {
    if (log.isDebugEnabled())
    {
      _evalStack.append(" => ");
      _evalStack.append(toTypeString(result));
      _evalStack.append(")");
    }

    return result;
  }

  protected String toTypeString(NQLObject e)
  {
    return e.getType() + (e.getType() != Type.NONE ? ":" + e.toString() : "");
  }

  public String getEvalStack()
  {
    return _evalStack.toString();
  }

  protected boolean alwaysTrue(ListComprehensionExpn e)
  {
    return (e.hasWhere() && e.getWhere().isLiteral() && EvalHandler.isTrue(e.getWhere()
                                                                            .as(LiteralExpn.class)
                                                                            .getLiteral()));
  }

  protected boolean alwaysFalse(ListComprehensionExpn e)
  {
    return (e.hasWhere() && e.getWhere().isLiteral() && !EvalHandler.isTrue(e.getWhere()
                                                                             .as(LiteralExpn.class)
                                                                             .getLiteral()));
  }
}

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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
import com.linkedin.bowser.core.expn.RelationalExpn;
import com.linkedin.bowser.core.expn.SetExpn;
import com.linkedin.bowser.core.expn.SliceExpn;
import com.linkedin.bowser.core.expn.SubscriptExpn;
import com.linkedin.bowser.core.expn.SymbolExpn;
import com.linkedin.bowser.core.expn.TupleExpn;
import com.linkedin.bowser.core.expn.UnaryMinusExpn;
import com.linkedin.bowser.core.expn.UnaryNotExpn;
import com.linkedin.bowser.core.objects.NQLObject;

/**
 * @author sdawson
 */
public class PartialEvalVisitor implements ExpnVisitor<Expn>
{
  private final EvalVisitor _visitor;
  private final Set<String> _pending;

  public PartialEvalVisitor(EvalVisitor visitor, Set<String> pending)
  {
    super();
    _pending = pending;
    _visitor = visitor;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.ConditionalExpn
   * )
   */
  @Override
  public Expn visit(ConditionalExpn e)
  {
    Expn condition = e.getCondition().accept(this);
    Expn ifTrue = e.getIfTrueExpn().accept(this);
    Expn ifFalse = e.getIfFalseExpn().accept(this);

    if (isLiteral(condition, ifTrue, ifFalse))
    {
      return new LiteralExpn(e.getTreeNode(),
                             new ConditionalExpn(e.getTreeNode(),
                                                 condition,
                                                 ifTrue,
                                                 ifFalse).accept(_visitor));
    }
    else
    {
      return e;
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.InExpn)
   */
  @Override
  public Expn visit(InExpn e)
  {
    Expn left = e.getLeft().accept(this);
    Expn right = e.getRight().accept(this);

    e = new InExpn(e.getTreeNode(), left, right);

    if (isLiteral(left, right))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.LogicalExpn)
   */
  @Override
  public Expn visit(LogicalExpn e)
  {
    Expn left = e.getLeft().accept(this);
    Expn right = e.getRight().accept(this);

    e = new LogicalExpn(e.getTreeNode(), left, right, e.getOperator());

    if (isLiteral(left, right))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.RelationalExpn
   * )
   */
  @Override
  public Expn visit(RelationalExpn e)
  {
    Expn left = e.getLeft().accept(this);
    Expn right = e.getRight().accept(this);

    e = new RelationalExpn(e.getTreeNode(), left, right, e.getOperator());

    if (isLiteral(left, right))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.LiteralExpn)
   */
  @Override
  public Expn visit(LiteralExpn e)
  {
    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.UnaryMinusExpn
   * )
   */
  @Override
  public Expn visit(UnaryMinusExpn e)
  {
    Expn left = e.getExpn().accept(this);

    e = new UnaryMinusExpn(e.getTreeNode(), left);

    if (isLiteral(left))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.UnaryNotExpn)
   */
  @Override
  public Expn visit(UnaryNotExpn e)
  {
    Expn left = e.getExpn().accept(this);
    e = new UnaryNotExpn(e.getTreeNode(), left);

    if (isLiteral(left))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.ListExpn)
   */
  @Override
  public Expn visit(ListExpn e)
  {
    boolean isLiteral = true;
    for (int i = 0; i < e.getExpressions().size(); i++)
    {
      Expn arg = e.getExpressions().get(i).accept(this);
      e.getExpressions().set(i, arg);
      isLiteral &= isLiteral(arg);
    }

    if (isLiteral)
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.TupleExpn)
   */
  @Override
  public Expn visit(TupleExpn e)
  {
    boolean isLiteral = true;
    for (int i = 0; i < e.getExpressions().length; i++)
    {
      Expn arg = e.getExpressions()[i].accept(this);
      e.getExpressions()[i] = arg;
      isLiteral &= isLiteral(arg);
    }

    if (isLiteral)
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.SetExpn)
   */
  @Override
  public Expn visit(SetExpn e)
  {
    boolean isLiteral = true;
    Set<Expn> args = new HashSet<Expn>();
    for (Expn arg : e.getExpressions())
    {
      Expn r = arg.accept(this);
      args.add(r);
      isLiteral &= isLiteral(r);
    }

    e = new SetExpn(e.getTreeNode(), args);

    if (isLiteral)
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.MapExpn)
   */
  @Override
  public Expn visit(MapExpn e)
  {
    boolean isLiteral = true;
    Map<Expn, Expn> map = new HashMap<Expn, Expn>(e.getExpressions().size());
    for (Entry<Expn, Expn> entry : e.getExpressions().entrySet())
    {
      Expn key = entry.getKey().accept(this);
      Expn value = entry.getValue().accept(this);

      map.put(key, value);

      isLiteral &= isLiteral(key, value);
    }

    e = new MapExpn(e.getTreeNode(), map);

    if (isLiteral)
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.ArithmeticExpn
   * )
   */
  @Override
  public Expn visit(ArithmeticExpn e)
  {
    Expn left = e.getLeft().accept(this);
    Expn right = e.getRight().accept(this);

    e = new ArithmeticExpn(e.getTreeNode(), left, right, e.getOperator());

    if (isLiteral(left, right))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.
   * ListComprehensionExpn)
   */
  @Override
  public Expn visit(ListComprehensionExpn e)
  {
    Expn input = e.getInput().accept(this);

    if (!_pending.contains(e.getSymbol()))
      _pending.add(e.getSymbol());

    Expn output = e.getOutput().accept(this);
    Expn where = e.hasWhere() ? e.getWhere().accept(this) : null;
    List<Expn> groupBy = null;
    if (e.hasGroupBy())
    {
      groupBy = new ArrayList<Expn>(e.getGroupBy().size());
      for (Expn group : e.getGroupBy())
        groupBy.add(group.accept(this));
    }

    List<Expn> sorting = null;
    boolean ascending = e.getAscending();
    if (e.hasSort())
    {
      sorting = new ArrayList<Expn>(e.getSorting().size());
      for (Expn sort : e.getSorting())
        sorting.add(sort.accept(this));
    }

    _pending.remove(e.getSymbol());

    Expn limit = null;
    if (e.hasLimit())
      limit = e.getLimit().accept(this);

    e =
        ListComprehensionExpn.builder(e.getTreeNode())
                             .setSymbol(e.getSymbol())
                             .setInput(input)
                             .setOutput(output)
                             .setGroupBy(groupBy)
                             .setWhere(where)
                             .setSorting(sorting)
                             .setAscending(ascending)
                             .setLimit(limit)
                             .build();

    if (isLiteral(input, output, where, limit) && isLiteral(sorting))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.SliceExpn)
   */
  @Override
  public Expn visit(SliceExpn e)
  {
    Expn sequence = e.getSequence().accept(this);
    Expn left = e.getStart() == null ? null : e.getStart().accept(this);
    Expn right = e.getEnd() == null ? null : e.getEnd().accept(this);

    e = new SliceExpn(e.getTreeNode(), sequence, left, right);

    if (isLiteral(sequence, left, right))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.CallableExpn)
   */
  @Override
  public Expn visit(CallableExpn e)
  {
    boolean isLiteral = true;

    Expn callable = e.getCallable().accept(this);
    isLiteral &= isLiteral(callable);

    List<Expn> args = new ArrayList<Expn>();
    for (Expn arg : e.getArgs())
    {
      Expn r = arg.accept(this);
      isLiteral &= isLiteral(r);
      args.add(r);
    }

    e = new CallableExpn(e.getTreeNode(), callable, args);

    if (isLiteral)
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.SubscriptExpn
   * )
   */
  @Override
  public Expn visit(SubscriptExpn e)
  {
    Expn value = e.getValue().accept(this);
    Expn index = e.getIndex().accept(this);

    e = new SubscriptExpn(e.getTreeNode(), value, index);

    if (isLiteral(value, index))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.AttrExpn)
   */
  @Override
  public Expn visit(AttrExpn e)
  {
    Expn value = e.getExpn().accept(this);

    e = new AttrExpn(e.getTreeNode(), value, e.getAttr());

    if (isLiteral(value))
      return new LiteralExpn(e.getTreeNode(), e.accept(_visitor));

    return e;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nql.core.expn.ExpnVisitor#visit(com.linkedin.nql.core.expn.SymbolExpn)
   */
  @Override
  public Expn visit(SymbolExpn e)
  {
    // Cannot access symbol, need to delay
    if (_pending.contains(e.getSymbol()))
    {
      return e;
    }
    else
    {
      NQLObject o = e.accept(_visitor);
      return new LiteralExpn(e.getTreeNode(), o);
    }
  }

  protected boolean isLiteral(Iterable<Expn> expressions)
  {
    if (expressions != null)
    {
      for (Expn e : expressions)
        if (e != null && !(e instanceof LiteralExpn))
          return false;
    }

    return true;
  }

  protected boolean isLiteral(Expn... expressions)
  {
    if (expressions != null)
      return isLiteral(Arrays.asList(expressions));

    return true;
  }
}

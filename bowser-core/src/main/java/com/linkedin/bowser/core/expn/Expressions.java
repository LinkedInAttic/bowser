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

package com.linkedin.bowser.core.expn;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * @author sdawson
 */
public final class Expressions
{
  private Expressions()
  {
    // Empty Constructor
  }

  public static LogicalExpn and(CommonTree treeNode, Expn e1, Expn e2)
  {
    return LogicalExpn.and(treeNode, e1, e2);
  }

  public static LogicalExpn or(CommonTree treeNode, Expn e1, Expn e2)
  {
    return LogicalExpn.or(treeNode, e1, e2);
  }

  public static RelationalExpn eq(CommonTree treeNode, Expn e1, Expn e2)
  {
    return RelationalExpn.eq(treeNode, e1, e2);
  }

  public static RelationalExpn neq(CommonTree treeNode, Expn e1, Expn e2)
  {
    return RelationalExpn.neq(treeNode, e1, e2);
  }

  public static RelationalExpn lt(CommonTree treeNode, Expn e1, Expn e2)
  {
    return RelationalExpn.lt(treeNode, e1, e2);
  }

  public static RelationalExpn lte(CommonTree treeNode, Expn e1, Expn e2)
  {
    return RelationalExpn.lte(treeNode, e1, e2);
  }

  public static RelationalExpn gt(CommonTree treeNode, Expn e1, Expn e2)
  {
    return RelationalExpn.gt(treeNode, e1, e2);
  }

  public static RelationalExpn gte(CommonTree treeNode, Expn e1, Expn e2)
  {
    return RelationalExpn.gte(treeNode, e1, e2);
  }

  public static UnaryMinusExpn minus(CommonTree treeNode, Expn e1)
  {
    return new UnaryMinusExpn(treeNode, e1);
  }

  public static ArithmeticExpn plus(CommonTree treeNode, Expn e1, Expn e2)
  {
    return new ArithmeticExpn(treeNode, e1, e2, Operator.PLUS);
  }

  public static ArithmeticExpn minus(CommonTree treeNode, Expn e1, Expn e2)
  {
    return new ArithmeticExpn(treeNode, e1, e2, Operator.MINUS);
  }

  public static ArithmeticExpn times(CommonTree treeNode, Expn e1, Expn e2)
  {
    return new ArithmeticExpn(treeNode, e1, e2, Operator.TIMES);
  }

  public static ArithmeticExpn divide(CommonTree treeNode, Expn e1, Expn e2)
  {
    return new ArithmeticExpn(treeNode, e1, e2, Operator.DIVIDE);
  }

  public static ArithmeticExpn mod(CommonTree treeNode, Expn e1, Expn e2)
  {
    return new ArithmeticExpn(treeNode, e1, e2, Operator.MOD);
  }

  public static ConditionalExpn cond(CommonTree treeNode, Expn e1, Expn e2, Expn e3)
  {
    return new ConditionalExpn(treeNode, e1, e2, e3);
  }

  public static InExpn in(CommonTree treeNode, Expn e1, Expn e2)
  {
    return new InExpn(treeNode, e1, e2);
  }

  public static UnaryNotExpn not(CommonTree treeNode, Expn e1)
  {
    return new UnaryNotExpn(treeNode, e1);
  }

  public static ListExpn list(CommonTree treeNode, List<Expn> expressions)
  {
    return new ListExpn(treeNode, expressions == null ? Collections.<Expn> emptyList()
        : expressions);
  }

  public static TupleExpn tuple(CommonTree treeNode, Expn[] expressions)
  {
    return new TupleExpn(treeNode, expressions == null ? new Expn[0] : expressions);
  }

  public static SetExpn set(CommonTree treeNode, List<Expn> expressions)
  {
    return new SetExpn(treeNode, expressions == null ? Collections.<Expn> emptySet()
        : Sets.newHashSet(expressions));
  }

  public static MapExpn map(CommonTree treeNode, Map<Expn, Expn> expressions)
  {
    return new MapExpn(treeNode, expressions == null
        ? Collections.<Expn, Expn> emptyMap() : expressions);
  }

  public static MapExpn map(CommonTree treeNode, List<Expn> expressions)
  {
    if (expressions == null)
      return new MapExpn(treeNode, Collections.<Expn, Expn> emptyMap());

    if (expressions.size() % 2 != 0)
      throw new IllegalArgumentException("expected an even number of expressions: "
          + expressions.size());

    Map<Expn, Expn> expnMap = Maps.newHashMap();
    for (List<Expn> part : Iterables.partition(expressions, 2))
    {
      expnMap.put(part.get(0), part.get(1));
    }

    return new MapExpn(treeNode, expnMap);
  }

  public static SymbolExpn symbol(CommonTree treeNode, String symbol)
  {
    return new SymbolExpn(treeNode, symbol);
  }

  public static ListComprehensionExpn listComprehension(CommonTree treeNode,
                                                        String symbol,
                                                        Expn input,
                                                        Expn out,
                                                        Expn where,
                                                        List<Expn> groupBy,
                                                        List<Expn> sorting,
                                                        boolean ascending,
                                                        Expn limit)
  {
    return ListComprehensionExpn.builder(treeNode)
                                .setSymbol(symbol)
                                .setInput(input)
                                .setOutput(out)
                                .setGroupBy(groupBy)
                                .setWhere(where)
                                .setSorting(sorting)
                                .setAscending(ascending)
                                .setLimit(limit)
                                .build();
  }

  public static SubscriptExpn subscript(CommonTree treeNode,
                                        Expn subscriptable,
                                        Expn index)
  {
    return new SubscriptExpn(treeNode, subscriptable, index);
  }

  public static SliceExpn slice(CommonTree treeNode, Expn sequence, Expn start, Expn end)
  {
    return new SliceExpn(treeNode, sequence, start, end);
  }

  public static CallableExpn function(CommonTree treeNode, Expn callable, List<Expn> args)
  {
    return new CallableExpn(treeNode, callable, args);
  }

  public static AttrExpn attr(CommonTree treeNode, Expn value, String attribute)
  {
    return new AttrExpn(treeNode, value, attribute);
  }
}

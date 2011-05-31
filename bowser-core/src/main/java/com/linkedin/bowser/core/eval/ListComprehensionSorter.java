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

/**
 * 
 */
package com.linkedin.bowser.core.eval;

import java.util.Comparator;
import java.util.List;

import jsr166y.ForkJoinPool;

import com.google.common.collect.ImmutableMap;
import com.linkedin.bowser.core.expn.Expn;
import com.linkedin.bowser.core.objects.NQLObject;

/**
 * @author sdawson
 * 
 */
public class ListComprehensionSorter implements Comparator<NQLObject>
{
  private final ForkJoinPool _pool;
  private final String       _symbol;
  private final List<Expn>   _sorting;
  private final boolean      _isAscending;

  public ListComprehensionSorter(ForkJoinPool pool,
                                 String symbol,
                                 List<Expn> sorting,
                                 boolean isAscending)
  {
    super();
    _pool = pool;
    _symbol = symbol;
    _sorting = sorting;
    _isAscending = isAscending;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
   */
  @Override
  public int compare(NQLObject o1, NQLObject o2)
  {
    if (o2.isNone())
      return -1;
    if (o1.isNone())
      return 1;

    for (Expn e : _sorting)
    {
      EvalVisitor visitor;
      NQLObject left;
      NQLObject right;

      visitor = new EvalVisitor(_pool, ImmutableMap.of(_symbol, o1));
      left = e.accept(visitor);

      visitor = new EvalVisitor(_pool, ImmutableMap.of(_symbol, o2));
      right = e.accept(visitor);

      if (EvalHandler.lt(left, right))
        return _isAscending ? -1 : 1;
      else if (EvalHandler.gt(left, right))
        return _isAscending ? 1 : -1;
    }

    // If no expressions match, then sort uses natural ordering
    if (EvalHandler.lt(o1, o2))
      return _isAscending ? -1 : 1;
    else if (EvalHandler.gt(o1, o2))
      return _isAscending ? 1 : -1;
    else
      return 0;
  }
}

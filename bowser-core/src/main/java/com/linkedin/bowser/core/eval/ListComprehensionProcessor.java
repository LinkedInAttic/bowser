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

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jsr166y.ForkJoinPool;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.linkedin.bowser.core.expn.CallableExpn;
import com.linkedin.bowser.core.expn.Expn;
import com.linkedin.bowser.core.expn.ListComprehensionExpn;
import com.linkedin.bowser.core.expn.LiteralExpn;
import com.linkedin.bowser.core.functions.Max;
import com.linkedin.bowser.core.functions.Min;
import com.linkedin.bowser.core.objects.FunctionObject;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Numeric;
import com.linkedin.bowser.core.objects.TupleObject;

import extra166y.Ops.Op;
import extra166y.Ops.Predicate;
import extra166y.Ops.Reducer;
import extra166y.ParallelArray;
import extra166y.ParallelArrayWithMapping;

public class ListComprehensionProcessor
{
  private final ForkJoinPool          _pool;
  private final ListComprehensionExpn _expn;

  public ListComprehensionProcessor(ForkJoinPool pool, ListComprehensionExpn expn)
  {
    super();
    _pool = pool;
    _expn = expn;
  }

  protected Predicate<NQLObject> where()
  {
    return new Predicate<NQLObject>()
    {
      /**
       * @param arg0
       * @return
       */
      @Override
      public boolean op(NQLObject input)
      {
        EvalVisitor visitor =
            new EvalVisitor(_pool, ImmutableMap.of(_expn.getSymbol(), input));
        if (!EvalHandler.isTrue(_expn.getWhere().accept(visitor)))
          return false;

        return true;
      }
    };
  }

  protected Op<NQLObject, NQLObjectHolder> groupBy()
  {
    return new Op<NQLObject, NQLObjectHolder>()
    {
      @Override
      public NQLObjectHolder op(NQLObject output)
      {
        EvalVisitor visitor =
            new EvalVisitor(_pool, ImmutableMap.of(_expn.getSymbol(), output));

        NQLObject key;
        if (_expn.getGroupBy().size() == 1)
          key = _expn.getGroupBy().get(0).accept(visitor);
        else
        {
          NQLObject[] keys = new NQLObject[_expn.getGroupBy().size()];
          for (int i = 0; i < _expn.getGroupBy().size(); i++)
            keys[i] = _expn.getGroupBy().get(i).accept(visitor);
          key = new TupleObject(keys);
        }

        return new NQLObjectHolder(key, output);
      }
    };
  }

  /**
   * @return
   */
  protected Op<NQLObject, NQLObject> output()
  {
    return new Op<NQLObject, NQLObject>()
    {
      @Override
      public NQLObject op(NQLObject value)
      {
        EvalVisitor visitor =
            new EvalVisitor(_pool, ImmutableMap.of(_expn.getSymbol(), value));

        return _expn.getOutput().accept(visitor);
      }
    };
  }

  /**
   * @param input
   * @return
   */
  public List<NQLObject> process(NQLObject[] input)
  {
    ParallelArray<NQLObject> array = ParallelArray.createFromCopy(input, _pool);
    if (_expn.hasWhere())
    {
      ParallelArrayWithMapping<NQLObject, NQLObject> withFilter =
          array.withFilter(where()).withMapping(output());

      array = withFilter.all();
    }
    else
    {
      array = array.withMapping(output()).all();
    }

    if (_expn.hasGroupBy())
    {
      ParallelArray<NQLObjectHolder> mapped = array.withMapping(groupBy()).all();
      ParallelArray<NQLObjectHolder> uniqueElements = mapped.allUniqueElements();

      NQLObject[] reduced = new NQLObject[uniqueElements.size()];

      for (int i = 0; i < uniqueElements.size(); i++)
      {
        final NQLObjectHolder uniqueElement = uniqueElements.get(i);
        reduced[i] = reduce(mapped, uniqueElement);
      }

      array = ParallelArray.createUsingHandoff(reduced, _pool);
    }

    if (_expn.hasSort())
    {
      ListComprehensionSorter sorter =
          new ListComprehensionSorter(_pool,
                                      _expn.getSymbol(),
                                      _expn.getSorting(),
                                      _expn.getAscending());
      array.sort(sorter);
    }

    if (_expn.hasLimit())
    {
      int limit =
          ((Numeric) _expn.getLimit().as(LiteralExpn.class).getLiteral()).getAsInt();
      if (limit < array.size())
        array = array.withBounds(0, limit).all();
    }

    return array.asList();
  }

  protected NQLObject reduce(final ParallelArray<NQLObjectHolder> mapped,
                             final NQLObjectHolder uniqueElement)
  {
    final CallableExpn callable = _expn.getOutput().as(CallableExpn.class);
    final FunctionObject func =
        (FunctionObject) callable.getCallable().as(LiteralExpn.class).getLiteral();
    final List<Expn> args = callable.getArgs();

    ParallelArrayWithMapping<NQLObjectHolder, NQLObject> filterSet =
        mapped.withFilter(new Predicate<NQLObjectHolder>()
        {
          @Override
          public boolean op(NQLObjectHolder holder)
          {
            return holder.equals(uniqueElement);
          }
        }).withMapping(new Op<NQLObjectHolder, NQLObject>()
        {
          @Override
          public NQLObject op(NQLObjectHolder holder)
          {
            return holder._value;
          }
        });

    Comparator<NQLObject> comparator = new Comparator<NQLObject>()
    {
      @Override
      public int compare(NQLObject o1, NQLObject o2)
      {
        if (EvalHandler.lt(o1, o2))
          return -1;
        else if (EvalHandler.gt(o1, o2))
          return 1;
        return 0;
      }
    };

    if (func.getCallable() instanceof Min)
      return filterSet.min(comparator);
    else if (func.getCallable() instanceof Max)
      return filterSet.max(comparator);
    else
    {
      // TODO HIGH SD: Add globals
      final NQLObject base =
          EvalHandler.call(ImmutableMap.<String, NQLObject> of(),
                           func,
                           Collections.<NQLObject> emptyList());

      return filterSet.reduce(new Reducer<NQLObject>()
      {
        /**
         * @param left
         * @param right
         * @return
         */
        @Override
        public NQLObject op(NQLObject left, NQLObject right)
        {
          EvalVisitor visitor =
              new EvalVisitor(_pool, ImmutableMap.of(_expn.getSymbol(), left));
          NQLObject e1 = args.get(0).accept(visitor);

          visitor = new EvalVisitor(_pool, ImmutableMap.of(_expn.getSymbol(), right));
          NQLObject e2 = args.get(0).accept(visitor);

          // TODO HIGH SD: Pass in globals...
          NQLObject combined =
              EvalHandler.call(ImmutableMap.<String, NQLObject> of(),
                               func,
                               ImmutableList.of(e1, e2));

          return combined;
        }
      },
                              base);
    }
  }

  protected static class NQLObjectHolder
  {
    protected final NQLObject _key;
    protected final NQLObject _value;

    public NQLObjectHolder(NQLObject key, NQLObject value)
    {
      super();
      _key = key;
      _value = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((_key == null) ? 0 : _key.hashCode());
      return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      NQLObjectHolder other = (NQLObjectHolder) obj;
      if (_key == null)
      {
        if (other._key != null)
          return false;
      }
      else if (!_key.equals(other._key))
        return false;
      return true;
    }
  }
}

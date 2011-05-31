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

package com.linkedin.bowser.core.grammar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jsr166y.ForkJoinPool;

import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.linkedin.bowser.core.eval.EvalVisitor;
import com.linkedin.bowser.core.eval.EvalVisitorErrorProxy;
import com.linkedin.bowser.core.expn.Expn;
import com.linkedin.bowser.core.expn.ExpnVisitor;
import com.linkedin.bowser.core.objects.NQLObject;

public abstract class AbstractNQLQueryBuilder extends TreeParser
{
  private final static String    MODULE        = AbstractNQLQueryBuilder.class.getName();
  private final static Log       log           = LogFactory.getLog(MODULE);

  private ForkJoinPool           _pool;
  private Map<String, NQLObject> _symbolMap    = new HashMap<String, NQLObject>();
  private Set<String>            _localSymbols = new HashSet<String>();

  public AbstractNQLQueryBuilder(TreeNodeStream input)
  {
    super(input);
    _symbolMap = Maps.newHashMap();
  }

  public AbstractNQLQueryBuilder(TreeNodeStream input, RecognizerSharedState state)
  {
    super(input, state);
    _symbolMap = Maps.newHashMap();
  }

  public ForkJoinPool getPool()
  {
    return _pool;
  }

  public void setPool(ForkJoinPool pool)
  {
    _pool = pool;
  }

  public Map<String, NQLObject> getSymbolMap()
  {
    return _symbolMap;
  }

  public void setSymbolMap(Map<String, NQLObject> symbolMap)
  {
    _symbolMap = symbolMap;
  }

  /**
   * @param e
   * @return
   */
  public NQLObject eval(Expn e)
  {
    EvalVisitor eval = new EvalVisitor(_pool, ImmutableMap.copyOf(getSymbolMap()));
    ExpnVisitor<NQLObject> proxied = EvalVisitorErrorProxy.createProxiedEvalVisitor(eval);

    NQLObject result = e.accept(proxied);

    if (log.isDebugEnabled())
      log.debug("eval:" + eval.getEvalStack());

    return result;
  }

  protected void assign(String identifier, NQLObject e)
  {
    _symbolMap.put(identifier, e);
    _localSymbols.add(identifier);
  }

  public Map<String, NQLObject> getLocalSymbolMap()
  {
    return Maps.newHashMap(Maps.filterKeys(_symbolMap, new Predicate<String>()
    {
      @Override
      public boolean apply(String key)
      {
        return _localSymbols.contains(key);
      }
    }));
  }
}

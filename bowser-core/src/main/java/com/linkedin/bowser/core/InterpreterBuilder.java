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
package com.linkedin.bowser.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jsr166y.ForkJoinPool;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.linkedin.bowser.core.functions.Bool;
import com.linkedin.bowser.core.functions.Dir;
import com.linkedin.bowser.core.functions.Float;
import com.linkedin.bowser.core.functions.Int;
import com.linkedin.bowser.core.functions.Length;
import com.linkedin.bowser.core.functions.Long;
import com.linkedin.bowser.core.functions.Max;
import com.linkedin.bowser.core.functions.Min;
import com.linkedin.bowser.core.functions.NQLFunction;
import com.linkedin.bowser.core.functions.Range;
import com.linkedin.bowser.core.functions.Shuffle;
import com.linkedin.bowser.core.functions.Str;
import com.linkedin.bowser.core.functions.Sum;
import com.linkedin.bowser.core.functions.Tuple;
import com.linkedin.bowser.core.objects.FunctionObject;
import com.linkedin.bowser.core.objects.NQLObject;

/**
 * @author sdawson
 * 
 */
public class InterpreterBuilder
{
  private final static String          MODULE     = Interpreter.class.getName();
  private final static Log             log        = LogFactory.getLog(MODULE);

  private final Map<String, NQLObject> _symbolMap = new HashMap<String, NQLObject>();

  private final List<NQLFunction>      _builtins;
  private ForkJoinPool                 _pool;

  public InterpreterBuilder()
  {
    _builtins = new ArrayList<NQLFunction>();
    _builtins.add(new Dir());
    _builtins.add(new Length());
    _builtins.add(new Shuffle());
    _builtins.add(new Range());
    _builtins.add(new Tuple());
    _builtins.add(new Int());
    _builtins.add(new Bool());
    _builtins.add(new Float());
    _builtins.add(new Str());
    _builtins.add(new Long());
    _builtins.add(new Sum());
    _builtins.add(new Max());
    _builtins.add(new Min());
    _builtins.add(new com.linkedin.bowser.core.functions.List());
  }

  public InterpreterBuilder addBuiltins()
  {
    for (NQLFunction function : _builtins)
      addSymbol(function.getName(), new FunctionObject(function));

    return this;
  }

  /**
   * @param symbol
   * @return
   */
  public InterpreterBuilder removeSymbol(String symbol)
  {
    _symbolMap.remove(symbol);
    return this;
  }

  public InterpreterBuilder setPool(ForkJoinPool pool)
  {
    _pool = pool;
    return this;
  }

  /**
   * @param symbol
   * @param object
   * @return
   */
  public InterpreterBuilder addSymbol(String symbol, NQLObject object)
  {
    if (_symbolMap.containsKey(symbol))
      log.warn("overriding symbol '" + symbol + "' with object '" + object.toString()
          + "'");

    _symbolMap.put(symbol, object);
    return this;
  }

  public Map<String, NQLObject> getSymbolMap()
  {
    return _symbolMap;
  }

  /**
   * @return
   */
  public Interpreter build()
  {
    return new Interpreter(new HashMap<String, NQLObject>(_symbolMap), _pool);
  }
}

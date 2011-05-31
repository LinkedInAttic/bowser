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
package com.linkedin.bowser.core.objects;

import org.apache.commons.lang.ObjectUtils;

import com.linkedin.bowser.core.expn.Type;
import com.linkedin.bowser.core.functions.NQLFunction;

/**
 * @author sdawson
 */
public class FunctionObject extends NQLObject implements Callable
{
  private final NQLFunction _function;

  public FunctionObject(NQLFunction function)
  {
    super();
    _function = function;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Printable#str()
   */
  @Override
  public String str()
  {
    return "<function " + _function.getName() + " at "
        + ObjectUtils.identityToString(_function) + ">";
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.NQLObject#getType()
   */
  @Override
  public Type getType()
  {
    return Type.FUNCTION;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Callable#getCallable()
   */
  public NQLFunction getCallable()
  {
    return _function;
  }
}

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

package com.linkedin.bowser.core.exceptions;

/**
 * Represents the 'base' exception for all runtime eval errors (i.e., type error,
 * subscript error). This exception contains no information about the Expn which invoked
 * the eval in question
 * 
 * @author sdawson
 */
public abstract class EvalError extends RuntimeException
{
  private static final long serialVersionUID = 1L;

  public EvalError()
  {
    super();
  }

  public EvalError(String message, Throwable cause)
  {
    super(message, cause);
  }

  public EvalError(String message)
  {
    super(message);
  }

  public EvalError(Throwable cause)
  {
    super(cause);
  }
}

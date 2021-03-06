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

import com.linkedin.bowser.core.objects.NQLObject;

public class AttributeError extends EvalError
{
  private static final long serialVersionUID = 1L;

  public AttributeError(NQLObject object, String attribute)
  {
    super(String.format("'%s' object has no attribute '%s'",
                        object.getType().name().toLowerCase(),
                        attribute));
  }
}

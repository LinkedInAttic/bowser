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

import org.antlr.runtime.tree.CommonTree;

public abstract class UnaryExpn extends Expn
{
  private final Expn     _expn;
  private final Operator _operator;

  public UnaryExpn(CommonTree tree, Expn expn, Operator operator)
  {
    super(tree);
    _expn = expn;
    _operator = operator;
  }

  public Expn getExpn()
  {
    return _expn;
  }

  public Operator getOperator()
  {
    return _operator;
  }
}

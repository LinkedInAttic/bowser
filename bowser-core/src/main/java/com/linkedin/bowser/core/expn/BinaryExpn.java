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

public abstract class BinaryExpn extends Expn
{
  private final Expn     _left, _right;
  private final Operator _operator;

  public BinaryExpn(CommonTree treeNode, Expn left, Expn right, Operator operator)
  {
    super(treeNode);
    _left = left;
    _right = right;
    _operator = operator;
  }

  public Expn getLeft()
  {
    return _left;
  }

  public Expn getRight()
  {
    return _right;
  }

  public Operator getOperator()
  {
    return _operator;
  }
}

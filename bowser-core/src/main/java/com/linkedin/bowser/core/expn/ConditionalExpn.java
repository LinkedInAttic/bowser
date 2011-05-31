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

public class ConditionalExpn extends Expn
{
  private final Expn _condition;
  private final Expn _ifTrueExpn;
  private final Expn _ifFalseExpn;

  public ConditionalExpn(CommonTree treeNode,
                         Expn condition,
                         Expn ifTrueExpn,
                         Expn ifFalseExpn)
  {
    super(treeNode);

    _condition = condition;
    _ifTrueExpn = ifTrueExpn;
    _ifFalseExpn = ifFalseExpn;

    if (condition.getType() != Type.BOOLEAN)
      throw new IllegalArgumentException("type must be boolean!");

    if (ifTrueExpn.getType() != ifFalseExpn.getType())
      throw new IllegalArgumentException("type of left (" + ifTrueExpn.getType()
          + ") must equal type of right (" + ifFalseExpn.getType() + ")");
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nus.query.impl.expn.Expn#getType()
   */
  @Override
  public Type getType()
  {
    return _ifTrueExpn.getType();
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nus.query.impl.expn.Expn#accept(com.linkedin.nus.query.impl.expn.ExpnVisitor)
   */
  @Override
  public <T> T accept(ExpnVisitor<T> visitor)
  {
    return visitor.visit(this);
  }

  /**
   * @return
   */
  public Expn getCondition()
  {
    return _condition;
  }

  /**
   * @return
   */
  public Expn getIfTrueExpn()
  {
    return _ifTrueExpn;
  }

  /**
   * @return
   */
  public Expn getIfFalseExpn()
  {
    return _ifFalseExpn;
  }
}

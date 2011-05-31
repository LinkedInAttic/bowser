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

public class RelationalExpn extends BinaryExpn
{
  public RelationalExpn(CommonTree tree, Expn left, Expn right, Operator operator)
  {
    super(tree, left, right, operator);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nus.query.impl.expn.Expn#getType()
   */
  @Override
  public Type getType()
  {
    return Type.BOOLEAN;
  }

  public static RelationalExpn eq(CommonTree tree, Expn left, Expn right)
  {
    return new RelationalExpn(tree, left, right, Operator.EQ);
  }

  public static RelationalExpn neq(CommonTree tree, Expn left, Expn right)
  {
    return new RelationalExpn(tree, left, right, Operator.NEQ);
  }

  public static RelationalExpn lt(CommonTree tree, Expn left, Expn right)
  {
    return new RelationalExpn(tree, left, right, Operator.LT);
  }

  public static RelationalExpn lte(CommonTree tree, Expn left, Expn right)
  {
    return new RelationalExpn(tree, left, right, Operator.LTE);
  }

  public static RelationalExpn gt(CommonTree tree, Expn left, Expn right)
  {
    return new RelationalExpn(tree, left, right, Operator.GT);
  }

  public static RelationalExpn gte(CommonTree tree, Expn left, Expn right)
  {
    return new RelationalExpn(tree, left, right, Operator.GTE);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.linkedin.nus.query.impl.expn.Expn#accept(com.linkedin.nus.query.impl.expn.ExpnVisitor
   * )
   */
  @Override
  public <T> T accept(ExpnVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
}

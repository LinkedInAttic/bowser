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

/**
 * @author sdawson
 */
public abstract class Expn
{
  private final CommonTree _treeNode;

  public Expn(CommonTree treeNode)
  {
    super();
    _treeNode = treeNode;
  }

  /**
   * @return
   */
  public abstract Type getType();

  /**
   * @param visitor
   */
  public abstract <T> T accept(ExpnVisitor<T> visitor);

  /**
   * @param <T>
   * @param clazz
   * @return
   */
  @SuppressWarnings("unchecked")
  public <T> T as(Class<T> clazz)
  {
    return (T) this;
  }

  /**
   * @return true iff this condition is a literal (no further evaluation necessary)
   */
  public boolean isLiteral()
  {
    return this instanceof LiteralExpn;
  }

  /**
   * @return
   */
  public CommonTree getTreeNode()
  {
    return _treeNode;
  }
}

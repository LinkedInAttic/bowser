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

public interface ExpnVisitor<T>
{
  /**
   * @param e
   */
  T visit(ConditionalExpn e);

  /**
   * @param e
   */
  T visit(InExpn e);

  /**
   * @param e
   */
  T visit(LogicalExpn e);

  /**
   * @param e
   */
  T visit(RelationalExpn e);

  /**
   * @param e
   */
  T visit(LiteralExpn e);

  /**
   * @param e
   */
  T visit(UnaryMinusExpn e);

  /**
   * @param e
   */
  T visit(UnaryNotExpn e);

  /**
   * @param e
   * @return
   */
  T visit(ListExpn e);

  /**
   * @param e
   * @return
   */
  T visit(TupleExpn e);

  /**
   * @param e
   * @return
   */
  T visit(SetExpn e);

  /**
   * @param e
   * @return
   */
  T visit(MapExpn e);

  /**
   * @param e
   * @return
   */
  T visit(ArithmeticExpn e);

  /**
   * @param e
   * @return
   */
  T visit(ListComprehensionExpn e);
  
  /**
   * @param e
   * @return
   */
  T visit(CallableExpn e);
  
  /**
   * @param e
   * @return
   */
  T visit(SubscriptExpn e);
  
  /**
   * @param e
   * @return
   */
  T visit(AttrExpn e);

  /**
   * @param e
   * @return
   */
  T visit(SymbolExpn e);
  
  /**
   * @param e
   * @return
   */
  T visit(SliceExpn e);
}

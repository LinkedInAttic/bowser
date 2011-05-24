package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public class ArithmeticExpn extends BinaryExpn
{
  public ArithmeticExpn(CommonTree treeNode, Expn left, Expn right, Operator operator)
  {
    super(treeNode, left, right, operator);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.Expn#getType()
   */
  @Override
  public Type getType()
  {
    return getLeft().getType();
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.Expn#accept(com.linkedin.nql.core.expn.ExpnVisitor)
   */
  @Override
  public <T> T accept(ExpnVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
}

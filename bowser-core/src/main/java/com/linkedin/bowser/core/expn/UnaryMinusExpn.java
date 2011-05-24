package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public class UnaryMinusExpn extends UnaryExpn
{
  public UnaryMinusExpn(CommonTree tree, Expn expn)
  {
    super(tree, expn, Operator.MINUS);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nus.query.impl.expn.Expn#getType()
   */
  public Type getType()
  {
    return getExpn().getType();
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
}

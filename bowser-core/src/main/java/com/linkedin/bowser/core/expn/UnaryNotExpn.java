package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public class UnaryNotExpn extends UnaryExpn
{
  public UnaryNotExpn(CommonTree tree, Expn expn)
  {
    super(tree, expn, Operator.NOT);

    if (expn.getType() != Type.BOOLEAN)
      throw new IllegalArgumentException("type must be boolean!");
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

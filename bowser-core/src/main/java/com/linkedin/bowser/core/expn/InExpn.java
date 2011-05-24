package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public class InExpn extends BinaryExpn
{
  public InExpn(CommonTree tree, Expn left, Expn right)
  {
    super(tree, left, right, Operator.IN);
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

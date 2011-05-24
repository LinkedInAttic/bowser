package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public class LogicalExpn extends BinaryExpn
{
  public LogicalExpn(CommonTree tree, Expn left, Expn right, Operator operator)
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

  public static LogicalExpn and(CommonTree tree, Expn left, Expn right)
  {
    return new LogicalExpn(tree, left, right, Operator.AND);
  }

  public static LogicalExpn or(CommonTree tree, Expn left, Expn right)
  {
    return new LogicalExpn(tree, left, right, Operator.OR);
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

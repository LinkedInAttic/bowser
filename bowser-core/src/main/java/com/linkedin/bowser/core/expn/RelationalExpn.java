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

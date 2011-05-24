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

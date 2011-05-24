package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public class SubscriptExpn extends Expn
{
  private final Expn _value;
  private final Expn _index;

  public SubscriptExpn(CommonTree treeNode, Expn value, Expn index)
  {
    super(treeNode);
    _value = value;
    _index = index;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.Expn#getType()
   */
  @Override
  public Type getType()
  {
    return Type.NONE;
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

  /**
   * @return
   */
  public Expn getValue()
  {
    return _value;
  }

  /**
   * @return
   */
  public Expn getIndex()
  {
    return _index;
  }
}

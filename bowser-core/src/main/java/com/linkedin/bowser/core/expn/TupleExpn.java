package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public class TupleExpn extends Expn
{
  private final Expn[] _expressions;

  public TupleExpn(CommonTree treeNode, Expn[] expressions)
  {
    super(treeNode);
    _expressions = expressions;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.Expn#getType()
   */
  @Override
  public Type getType()
  {
    return Type.TUPLE;
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
  public Expn[] getExpressions()
  {
    return _expressions;
  }
}

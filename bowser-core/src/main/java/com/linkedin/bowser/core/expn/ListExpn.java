package com.linkedin.bowser.core.expn;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

public class ListExpn extends Expn
{
  private final List<Expn> _expressions;

  public ListExpn(CommonTree treeNode, List<Expn> expressions)
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
    return Type.LIST;
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
  public List<Expn> getExpressions()
  {
    return _expressions;
  }
}

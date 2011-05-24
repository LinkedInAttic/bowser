package com.linkedin.bowser.core.expn;

import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

public class SetExpn extends Expn
{
  private final Set<Expn> _expressions;

  public SetExpn(CommonTree treeNode, Set<Expn> expressions)
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
    return Type.SET;
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
  public Set<Expn> getExpressions()
  {
    return _expressions;
  }
}

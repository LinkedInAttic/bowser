package com.linkedin.bowser.core.expn;

import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

public class MapExpn extends Expn
{
  private final Map<Expn, Expn> _expressions;

  public MapExpn(CommonTree treeNode, Map<Expn, Expn> expressions)
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
    return Type.MAP;
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
  public Map<Expn, Expn> getExpressions()
  {
    return _expressions;
  }
}

/**
 * 
 */
package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author sdawson
 * 
 */
public class AttrExpn extends Expn
{
  private final Expn   _expn;
  private final String _attr;

  public AttrExpn(CommonTree treeNode, Expn expn, String attr)
  {
    super(treeNode);
    _expn = expn;
    _attr = attr;
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

  public Expn getExpn()
  {
    return _expn;
  }

  public String getAttr()
  {
    return _attr;
  }
}

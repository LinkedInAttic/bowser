package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

import com.linkedin.bowser.core.objects.NQLObject;

public class LiteralExpn extends Expn
{
  private final NQLObject _literal;

  public LiteralExpn(CommonTree tree, NQLObject literal)
  {
    super(tree);
    _literal = literal;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nus.query.impl.expn.Expn#getType()
   */
  @Override
  public Type getType()
  {
    return _literal.getType();
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

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_literal == null) ? 0 : _literal.hashCode());
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    LiteralExpn other = (LiteralExpn) obj;
    if (_literal == null)
    {
      if (other._literal != null)
        return false;
    }
    else if (!_literal.equals(other._literal))
      return false;
    return true;
  }

  public NQLObject getLiteral()
  {
    return _literal;
  }

}

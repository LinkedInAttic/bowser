package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public class SymbolExpn extends Expn
{
  private final String _symbol;

  public SymbolExpn(CommonTree tree, String symbol)
  {
    super(tree);
    _symbol = symbol;
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
  public String getSymbol()
  {
    return _symbol;
  }
}

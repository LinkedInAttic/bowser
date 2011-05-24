package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public abstract class UnaryExpn extends Expn
{
  private final Expn     _expn;
  private final Operator _operator;

  public UnaryExpn(CommonTree tree, Expn expn, Operator operator)
  {
    super(tree);
    _expn = expn;
    _operator = operator;
  }

  public Expn getExpn()
  {
    return _expn;
  }

  public Operator getOperator()
  {
    return _operator;
  }
}

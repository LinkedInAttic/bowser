package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public abstract class BinaryExpn extends Expn
{
  private final Expn     _left, _right;
  private final Operator _operator;

  public BinaryExpn(CommonTree treeNode, Expn left, Expn right, Operator operator)
  {
    super(treeNode);
    _left = left;
    _right = right;
    _operator = operator;
  }

  public Expn getLeft()
  {
    return _left;
  }

  public Expn getRight()
  {
    return _right;
  }

  public Operator getOperator()
  {
    return _operator;
  }
}

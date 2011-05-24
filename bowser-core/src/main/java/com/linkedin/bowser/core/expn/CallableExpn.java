package com.linkedin.bowser.core.expn;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

public class CallableExpn extends Expn
{
  private final Expn       _callable;
  private final List<Expn> _args;

  public CallableExpn(CommonTree treeNode, Expn callable, List<Expn> args)
  {
    super(treeNode);
    _callable = callable;
    _args = args;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.expn.Expn#getType()
   */
  @Override
  public Type getType()
  {
    return Type.FUNCTION;
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

  public Expn getCallable()
  {
    return _callable;
  }

  public List<Expn> getArgs()
  {
    return _args;
  }
}

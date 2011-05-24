package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

public class SliceExpn extends Expn
{
  private final Expn _sequence;
  private final Expn _start;
  private final Expn _end;

  public SliceExpn(CommonTree treeNode, Expn sequence, Expn start, Expn end)
  {
    super(treeNode);
    _sequence = sequence;
    _start = start;
    _end = end;
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

  public Expn getStart()
  {
    return _start;
  }

  public Expn getEnd()
  {
    return _end;
  }
  
  public Expn getSequence()
  {
    return _sequence;
  }
}

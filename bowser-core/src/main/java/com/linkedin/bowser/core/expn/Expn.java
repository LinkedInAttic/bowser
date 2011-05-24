package com.linkedin.bowser.core.expn;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author sdawson
 */
public abstract class Expn
{
  private final CommonTree _treeNode;

  public Expn(CommonTree treeNode)
  {
    super();
    _treeNode = treeNode;
  }

  /**
   * @return
   */
  public abstract Type getType();

  /**
   * @param visitor
   */
  public abstract <T> T accept(ExpnVisitor<T> visitor);

  /**
   * @param <T>
   * @param clazz
   * @return
   */
  @SuppressWarnings("unchecked")
  public <T> T as(Class<T> clazz)
  {
    return (T) this;
  }

  /**
   * @return true iff this condition is a literal (no further evaluation necessary)
   */
  public boolean isLiteral()
  {
    return this instanceof LiteralExpn;
  }

  /**
   * @return
   */
  public CommonTree getTreeNode()
  {
    return _treeNode;
  }
}

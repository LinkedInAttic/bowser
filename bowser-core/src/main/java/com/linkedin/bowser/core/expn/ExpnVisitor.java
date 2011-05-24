package com.linkedin.bowser.core.expn;

public interface ExpnVisitor<T>
{
  /**
   * @param e
   */
  T visit(ConditionalExpn e);

  /**
   * @param e
   */
  T visit(InExpn e);

  /**
   * @param e
   */
  T visit(LogicalExpn e);

  /**
   * @param e
   */
  T visit(RelationalExpn e);

  /**
   * @param e
   */
  T visit(LiteralExpn e);

  /**
   * @param e
   */
  T visit(UnaryMinusExpn e);

  /**
   * @param e
   */
  T visit(UnaryNotExpn e);

  /**
   * @param e
   * @return
   */
  T visit(ListExpn e);

  /**
   * @param e
   * @return
   */
  T visit(TupleExpn e);

  /**
   * @param e
   * @return
   */
  T visit(SetExpn e);

  /**
   * @param e
   * @return
   */
  T visit(MapExpn e);

  /**
   * @param e
   * @return
   */
  T visit(ArithmeticExpn e);

  /**
   * @param e
   * @return
   */
  T visit(ListComprehensionExpn e);
  
  /**
   * @param e
   * @return
   */
  T visit(CallableExpn e);
  
  /**
   * @param e
   * @return
   */
  T visit(SubscriptExpn e);
  
  /**
   * @param e
   * @return
   */
  T visit(AttrExpn e);

  /**
   * @param e
   * @return
   */
  T visit(SymbolExpn e);
  
  /**
   * @param e
   * @return
   */
  T visit(SliceExpn e);
}

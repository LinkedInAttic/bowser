package com.linkedin.bowser.core.exceptions;

public class ZeroDivisionError extends EvalError
{
  private static final long serialVersionUID = 1L;

  public ZeroDivisionError(String message)
  {
    super(message);
  }
}

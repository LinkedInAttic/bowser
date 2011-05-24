package com.linkedin.bowser.core.exceptions;

/**
 * Represents the 'base' exception for all runtime eval errors (i.e., type error,
 * subscript error). This exception contains no information about the Expn which invoked
 * the eval in question
 * 
 * @author sdawson
 */
public abstract class EvalError extends RuntimeException
{
  private static final long serialVersionUID = 1L;

  public EvalError()
  {
    super();
  }

  public EvalError(String message, Throwable cause)
  {
    super(message, cause);
  }

  public EvalError(String message)
  {
    super(message);
  }

  public EvalError(Throwable cause)
  {
    super(cause);
  }
}

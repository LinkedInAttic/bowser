package com.linkedin.bowser.core.exceptions;

public class NameError extends EvalError
{
  private static final long serialVersionUID = 1L;

  public NameError(String name)
  {
    super(" name '" + name + "' is not defined");
  }
}

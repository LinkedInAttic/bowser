package com.linkedin.bowser.core.exceptions;

import com.linkedin.bowser.core.objects.NQLObject;

public class KeyError extends EvalError
{
  private static final long serialVersionUID = 1L;

  public KeyError(NQLObject key)
  {
    super(key.toString());
  }
}

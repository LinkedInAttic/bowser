package com.linkedin.bowser.core.exceptions;

import com.linkedin.bowser.core.objects.NQLObject;

public class TypeError extends EvalError
{
  private static final long serialVersionUID = 1L;

  public TypeError(String message)
  {
    super(message);
  }

  public TypeError(NQLObject object, String formatMessage)
  {
    super(String.format(formatMessage, object.getType().name().toLowerCase()));
  }
}

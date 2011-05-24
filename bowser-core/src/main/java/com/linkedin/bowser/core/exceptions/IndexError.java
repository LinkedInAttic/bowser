package com.linkedin.bowser.core.exceptions;

import com.linkedin.bowser.core.objects.NQLObject;

public class IndexError extends EvalError
{
  private static final long serialVersionUID = 1L;

  public IndexError(NQLObject sequence)
  {
    super(sequence.getType().name().toLowerCase() + " index out of range");
  }
}

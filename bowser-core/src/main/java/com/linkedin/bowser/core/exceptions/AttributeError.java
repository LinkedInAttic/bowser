package com.linkedin.bowser.core.exceptions;

import com.linkedin.bowser.core.objects.NQLObject;

public class AttributeError extends EvalError
{
  private static final long serialVersionUID = 1L;

  public AttributeError(NQLObject object, String attribute)
  {
    super(String.format("'%s' object has no attribute '%s'",
                        object.getType().name().toLowerCase(),
                        attribute));
  }
}

package com.linkedin.bowser.core.exceptions;

import com.linkedin.bowser.core.objects.NQLObject;

public class SubscriptError extends EvalError
{
  private static final long serialVersionUID = 1L;

  public SubscriptError(NQLObject object)
  {
    super(String.format("'%s' object is not subscriptable", object.getType()
                                                                  .name()
                                                                  .toLowerCase()));
  }
}

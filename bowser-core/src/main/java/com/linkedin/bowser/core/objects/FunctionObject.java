/**
 * 
 */
package com.linkedin.bowser.core.objects;

import org.apache.commons.lang.ObjectUtils;

import com.linkedin.bowser.core.expn.Type;
import com.linkedin.bowser.core.functions.NQLFunction;

/**
 * @author sdawson
 */
public class FunctionObject extends NQLObject implements Callable
{
  private final NQLFunction _function;

  public FunctionObject(NQLFunction function)
  {
    super();
    _function = function;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Printable#str()
   */
  @Override
  public String str()
  {
    return "<function " + _function.getName() + " at "
        + ObjectUtils.identityToString(_function) + ">";
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.NQLObject#getType()
   */
  @Override
  public Type getType()
  {
    return Type.FUNCTION;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Callable#getCallable()
   */
  public NQLFunction getCallable()
  {
    return _function;
  }
}

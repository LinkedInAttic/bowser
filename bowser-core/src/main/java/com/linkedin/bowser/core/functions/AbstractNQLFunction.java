/**
 * 
 */
package com.linkedin.bowser.core.functions;

import java.util.List;

import com.linkedin.bowser.core.eval.EvalHandler;
import com.linkedin.bowser.core.exceptions.TypeError;
import com.linkedin.bowser.core.objects.Collection;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Numeric;

/**
 * @author sdawson
 * 
 */
public abstract class AbstractNQLFunction implements NQLFunction
{
  protected void assertNumberOfArguments(List<NQLObject> arguments, int args)
  {
    assertNumberOfArguments(arguments, args, args);
  }

  /**
   * @param arguments
   * @param min
   * @param max
   */
  protected void assertNumberOfArguments(List<NQLObject> arguments, int min, int max)
  {
    if (arguments == null || arguments.size() < min || arguments.size() > max)
    {
      if (min == max)
        throw new TypeError(getName() + " requires " + min + " arguments");
      else
        throw new TypeError(getName() + " requires at least " + min + " arguments, max "
            + max);
    }
  }

  /**
   * @param argument
   * @return
   */
  protected int getAsInt(NQLObject argument)
  {
    if (!(argument instanceof Numeric))
      throw new TypeError(argument, "expected a number, not '%s'");

    return ((Numeric) argument).getAsInt();
  }

  /**
   * @param argument
   * @return
   */
  protected Collection getAsCollection(NQLObject argument)
  {
    if (!(argument instanceof Collection))
      throw new TypeError(argument, "'%s' is not iterable");

    return ((Collection) argument);
  }

  /**
   * @param argument
   * @return
   */
  protected boolean getAsBoolean(NQLObject argument)
  {
    return EvalHandler.isTrue(argument);
  }

  /**
   * @param argument
   * @return
   */
  protected float getAsFloat(NQLObject argument)
  {
    if (!(argument instanceof Numeric))
      throw new TypeError(argument, "expected a number, not '%s'");

    return ((Numeric) argument).getAsFloat();
  }

  /**
   * @param argument
   * @return
   */
  protected long getAsLong(NQLObject argument)
  {
    if (!(argument instanceof Numeric))
      throw new TypeError(argument, "expected a number, not '%s'");

    return ((Numeric) argument).getAsLong();
  }

  /**
   * @param argument
   * @return
   */
  protected String getAsString(NQLObject argument)
  {
    return argument.str();
  }
}

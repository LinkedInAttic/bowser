/**
 * 
 */
package com.linkedin.bowser.core.functions;

import java.util.List;
import java.util.Map;

import com.linkedin.bowser.core.exceptions.TypeError;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Objects;
import com.linkedin.bowser.core.objects.Sizable;

/**
 * @author sdawson
 * 
 */
public class Length implements NQLFunction
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#getName()
   */
  @Override
  public String getName()
  {
    return "len";
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#apply(java.util.List)
   */
  @Override
  public NQLObject apply(Map<String, NQLObject> globals, List<NQLObject> arguments)
  {
    if (arguments == null || arguments.size() != 1)
      throw new TypeError("length takes exactly 1 argument");

    NQLObject argument = arguments.get(0);
    if (!(argument instanceof Sizable))
      throw new TypeError(argument, "'%s' object is not sizable");

    return Objects.create(((Sizable) argument).len());
  }
}

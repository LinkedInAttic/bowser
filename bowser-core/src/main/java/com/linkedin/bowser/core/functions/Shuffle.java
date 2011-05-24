/**
 * 
 */
package com.linkedin.bowser.core.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.linkedin.bowser.core.exceptions.TypeError;
import com.linkedin.bowser.core.objects.Collection;
import com.linkedin.bowser.core.objects.ListObject;
import com.linkedin.bowser.core.objects.NQLObject;

/**
 * @author sdawson
 * 
 */
public class Shuffle implements NQLFunction
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#getName()
   */
  @Override
  public String getName()
  {
    return "shuffle";
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
      throw new TypeError("shuffle takes exactly 1 argument");

    List<NQLObject> objects = new ArrayList<NQLObject>();
    NQLObject argument = arguments.get(0);
    if (!(argument instanceof Collection))
      throw new TypeError(argument, "'%s' object is not sizable");

    for (NQLObject o : ((Collection) argument))
      objects.add(o);

    Collections.shuffle(objects);
    return new ListObject(objects);
  }
}

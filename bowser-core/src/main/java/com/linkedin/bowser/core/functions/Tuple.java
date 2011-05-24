/**
 * 
 */
package com.linkedin.bowser.core.functions;

import java.util.List;
import java.util.Map;

import com.linkedin.bowser.core.objects.Collection;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.TupleObject;

/**
 * @author sdawson
 * 
 */
public class Tuple extends AbstractNQLFunction implements NQLFunction
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#getName()
   */
  @Override
  public String getName()
  {
    return "tuple";
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#apply(java.util.List)
   */
  @Override
  public NQLObject apply(Map<String, NQLObject> globals, List<NQLObject> arguments)
  {
    assertNumberOfArguments(arguments, 1);
    Collection c = getAsCollection(arguments.get(0));

    NQLObject[] array = new NQLObject[c.len()];
    int i = 0;
    for (NQLObject o : c)
      array[i++] = o;

    return new TupleObject(array);
  }
}

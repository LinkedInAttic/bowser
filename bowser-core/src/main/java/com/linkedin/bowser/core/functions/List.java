/**
 * 
 */
package com.linkedin.bowser.core.functions;

import java.util.ArrayList;
import java.util.Map;

import com.google.common.collect.Iterables;
import com.linkedin.bowser.core.objects.Collection;
import com.linkedin.bowser.core.objects.ListObject;
import com.linkedin.bowser.core.objects.NQLObject;

/**
 * @author sdawson
 * 
 */
public class List extends AbstractNQLFunction implements NQLFunction
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#getName()
   */
  @Override
  public String getName()
  {
    return "list";
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#apply(java.util.List)
   */
  @Override
  public NQLObject apply(Map<String, NQLObject> globals,
                         java.util.List<NQLObject> arguments)
  {
    assertNumberOfArguments(arguments, 1);
    Collection c = getAsCollection(arguments.get(0));

    java.util.List<NQLObject> list = new ArrayList<NQLObject>();
    Iterables.addAll(list, c);

    return new ListObject(list);
  }
}

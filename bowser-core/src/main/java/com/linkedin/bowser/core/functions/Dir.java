/**
 * 
 */
package com.linkedin.bowser.core.functions;

import java.util.Collections;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.linkedin.bowser.core.objects.Attributable;
import com.linkedin.bowser.core.objects.ListObject;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Objects;

/**
 * @author sdawson
 */
public class Dir extends AbstractNQLFunction implements NQLFunction
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#getName()
   */
  @Override
  public String getName()
  {
    return "dir";
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
    assertNumberOfArguments(arguments, 0, 1);
    java.util.List<String> attributes = Lists.newArrayList();
    if (arguments.isEmpty())
      attributes.addAll(globals.keySet());
    else
    {
      NQLObject arg = arguments.get(0);
      if (arg instanceof Attributable)
      {
        Attributable attributable = (Attributable) arg;
        attributes.addAll(attributable.getAttributes());
      }
    }

    Collections.sort(attributes);
    return new ListObject(Lists.newArrayList(Iterables.transform(attributes,
                                                                 new Function<String, NQLObject>()
                                                                 {
                                                                   @Override
                                                                   public NQLObject apply(String attribute)
                                                                   {
                                                                     return Objects.create(attribute);
                                                                   }
                                                                 })));
  }
}

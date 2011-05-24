/**
 * 
 */
package com.linkedin.bowser.core.functions;

import java.util.Map;

import com.linkedin.bowser.core.eval.EvalHandler;
import com.linkedin.bowser.core.objects.NQLObject;
import com.linkedin.bowser.core.objects.Objects;

/**
 * @author sdawson
 * 
 */
public class Sum extends AbstractNQLFunction implements NQLFunction
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#getName()
   */
  @Override
  public String getName()
  {
    return "sum";
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
    if (arguments.isEmpty())
      return Objects.create(0);

    NQLObject car = arguments.get(0);
    for (NQLObject cdr : arguments.subList(1, arguments.size()))
      car = EvalHandler.plus(car, cdr);

    return car;
  }
}

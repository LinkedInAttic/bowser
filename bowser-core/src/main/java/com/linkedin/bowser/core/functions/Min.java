/**
 * 
 */
package com.linkedin.bowser.core.functions;

import java.util.Map;

import com.linkedin.bowser.core.eval.EvalHandler;
import com.linkedin.bowser.core.objects.NQLObject;

/**
 * @author sdawson
 * 
 */
public class Min extends AbstractNQLFunction implements NQLFunction
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.functions.Function#getName()
   */
  @Override
  public String getName()
  {
    return "min";
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
    NQLObject car = arguments.get(0);
    for (NQLObject cdr : arguments.subList(1, arguments.size()))
    {
      if (EvalHandler.lt(cdr, car))
        car = cdr;
    }

    return car;
  }
}

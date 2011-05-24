package com.linkedin.bowser.core.functions;

import java.util.List;
import java.util.Map;

import com.linkedin.bowser.core.objects.NQLObject;

/**
 * @author sdawson
 */
public interface NQLFunction
{
  /**
   * @return the name of this function
   */
  public String getName();

  /**
   * @param globals
   * @param arguments
   * @return
   */
  public NQLObject apply(Map<String, NQLObject> globals, List<NQLObject> arguments);
}

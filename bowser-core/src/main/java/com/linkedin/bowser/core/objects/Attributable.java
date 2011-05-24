/**
 * 
 */
package com.linkedin.bowser.core.objects;

import java.util.Set;

/**
 * @author sdawson
 * 
 */
public interface Attributable
{
  /**
   * @param attribute
   * @return
   */
  public NQLObject getAttribute(String attribute);

  /**
   * @return
   */
  public Set<String> getAttributes();
}

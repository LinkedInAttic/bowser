/**
 * 
 */
package com.linkedin.bowser.core.objects;

/**
 * @author sdawson
 * 
 */
public interface Relational
{
  /**
   * @param o
   * @return -1 if this object is less than o; 0 if this object is equal to o; 1 if this
   *         object is greater than o;
   */
  public int compareTo(NQLObject o);
}

/**
 * 
 */
package com.linkedin.bowser.core.objects;

import com.linkedin.bowser.core.expn.Type;

/**
 * @author sdawson
 * 
 */
public class NoneObject extends NQLObject
{
  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.Printable#str()
   */
  @Override
  public String str()
  {
    return "None";
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.linkedin.nql.core.objects.NQLObject#getType()
   */
  @Override
  public Type getType()
  {
    return Type.NONE;
  }
}

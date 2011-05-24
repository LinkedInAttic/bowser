package com.linkedin.bowser.core.eval;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.linkedin.bowser.core.exceptions.EvalError;
import com.linkedin.bowser.core.exceptions.QueryRuntimeException;
import com.linkedin.bowser.core.expn.Expn;
import com.linkedin.bowser.core.expn.ExpnVisitor;
import com.linkedin.bowser.core.objects.NQLObject;

/**
 * Error proxy that intercepts runtime errors and adds the Expn context to the exception
 * for more useful debugging
 * 
 * @author sdawson
 */
public class EvalVisitorErrorProxy implements InvocationHandler
{
  private final EvalVisitor _proxiedObject;

  public EvalVisitorErrorProxy(EvalVisitor proxiedObject)
  {
    super();
    _proxiedObject = proxiedObject;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
   * java.lang.reflect.Method, java.lang.Object[])
   */
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
  {
    try
    {
      return method.invoke(_proxiedObject, args);
    }
    catch (InvocationTargetException e)
    {
      if ((e.getCause() instanceof EvalError) && args.length > 0)
      {
        EvalError error = (EvalError) e.getCause();
        // Expn should be the first argument!
        Expn expression = (Expn) args[0];
        throw new QueryRuntimeException(error.getClass().getSimpleName(),
                                        expression.getTreeNode().getLine(),
                                        expression.getTreeNode().getCharPositionInLine(),
                                        expression.getTreeNode().getText(),
                                        error.getMessage());
      }
      else
      {
        throw e.getCause();
      }
    }
  }

  /**
   * @param visitor
   * @return a proxied EvalVisitor that catches runtime exceptions and adds additional
   *         context into the exception
   */
  @SuppressWarnings("unchecked")
  public static ExpnVisitor<NQLObject> createProxiedEvalVisitor(EvalVisitor visitor)
  {
    return (ExpnVisitor<NQLObject>) Proxy.newProxyInstance(visitor.getClass()
                                                                  .getClassLoader(),
                                                           new Class[] { ExpnVisitor.class },
                                                           new EvalVisitorErrorProxy(visitor));

  }
}

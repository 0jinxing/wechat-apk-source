package com.tencent.tinker.loader.hotplug.handler;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.tinker.loader.hotplug.IncrementComponentManager;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PMSInterceptHandler
  implements ServiceBinderInterceptor.BinderInvocationHandler
{
  private static Object c(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Class[] arrayOfClass = paramMethod.getExceptionTypes();
    try
    {
      paramObject = paramMethod.invoke(paramObject, paramArrayOfObject);
      if (paramObject != null);
      while (true)
      {
        return paramObject;
        for (int i = 0; ; i++)
        {
          if (i >= paramArrayOfObject.length)
            break label162;
          if ((paramArrayOfObject[i] instanceof ComponentName))
          {
            paramObject = new java/lang/StringBuilder;
            paramObject.<init>("locate componentName field of ");
            paramObject.append(paramMethod.getName()).append(" done at idx: ").append(i);
            paramObject = (ComponentName)paramArrayOfObject[i];
            if (paramObject == null)
              break label96;
            paramObject = IncrementComponentManager.aun(paramObject.getClassName());
            break;
          }
        }
        label96: paramObject = new java/lang/StringBuilder;
        paramObject.<init>("failed to locate componentName field of ");
        paramObject.append(paramMethod.getName()).append(", notice any crashes or mistakes after resolve works.");
        paramObject = null;
      }
    }
    catch (InvocationTargetException paramObject)
    {
      while (true)
      {
        paramMethod = paramObject.getTargetException();
        if ((arrayOfClass != null) && (arrayOfClass.length > 0))
        {
          if (paramMethod != null)
            paramObject = paramMethod;
          while (true)
            throw paramObject;
        }
        paramObject = null;
      }
    }
    catch (Throwable paramObject)
    {
      while (true)
      {
        paramObject = null;
        continue;
        label162: paramObject = null;
      }
    }
  }

  private static Object d(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Class[] arrayOfClass = paramMethod.getExceptionTypes();
    try
    {
      paramObject = paramMethod.invoke(paramObject, paramArrayOfObject);
      if (paramObject != null);
      while (true)
      {
        return paramObject;
        for (int i = 0; ; i++)
        {
          if (i >= paramArrayOfObject.length)
            break label159;
          if ((paramArrayOfObject[i] instanceof Intent))
          {
            paramObject = new java/lang/StringBuilder;
            paramObject.<init>("locate intent field of ");
            paramObject.append(paramMethod.getName()).append(" done at idx: ").append(i);
            paramObject = (Intent)paramArrayOfObject[i];
            if (paramObject == null)
              break label93;
            paramObject = IncrementComponentManager.bc(paramObject);
            break;
          }
        }
        label93: paramObject = new java/lang/StringBuilder;
        paramObject.<init>("failed to locate intent field of ");
        paramObject.append(paramMethod.getName()).append(", notice any crashes or mistakes after resolve works.");
        paramObject = null;
      }
    }
    catch (InvocationTargetException paramMethod)
    {
      while (true)
      {
        paramObject = paramMethod.getTargetException();
        if ((arrayOfClass != null) && (arrayOfClass.length > 0))
        {
          if (paramObject != null);
          while (true)
          {
            throw paramObject;
            paramObject = paramMethod;
          }
        }
        paramObject = null;
      }
    }
    catch (Throwable paramObject)
    {
      while (true)
      {
        paramObject = null;
        continue;
        label159: paramObject = null;
      }
    }
  }

  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    String str = paramMethod.getName();
    if ("getActivityInfo".equals(str))
      paramObject = c(paramObject, paramMethod, paramArrayOfObject);
    while (true)
    {
      return paramObject;
      if ("resolveIntent".equals(str))
        paramObject = d(paramObject, paramMethod, paramArrayOfObject);
      else
        paramObject = paramMethod.invoke(paramObject, paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.hotplug.handler.PMSInterceptHandler
 * JD-Core Version:    0.6.2
 */
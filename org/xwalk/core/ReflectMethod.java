package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.RejectedExecutionException;

public class ReflectMethod
{
  private Object[] mArguments;
  private Class<?> mClass;
  private Object mInstance;
  private Method mMethod;
  private String mName;
  private Class<?>[] mParameterTypes;

  public ReflectMethod()
  {
  }

  public ReflectMethod(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(85517);
    init(null, paramClass, paramString, paramArrayOfClass);
    AppMethodBeat.o(85517);
  }

  public ReflectMethod(Object paramObject, String paramString, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(85516);
    init(paramObject, null, paramString, paramArrayOfClass);
    AppMethodBeat.o(85516);
  }

  public Object[] getArguments()
  {
    return this.mArguments;
  }

  public Object getInstance()
  {
    return this.mInstance;
  }

  public String getName()
  {
    return this.mName;
  }

  public boolean init(Object paramObject, Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(85518);
    this.mInstance = paramObject;
    boolean bool;
    if (paramClass != null)
    {
      this.mClass = paramClass;
      this.mName = paramString;
      this.mParameterTypes = paramArrayOfClass;
      this.mMethod = null;
      if (this.mClass != null)
        break label70;
      AppMethodBeat.o(85518);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramObject != null)
      {
        paramClass = paramObject.getClass();
        break;
      }
      paramClass = null;
      break;
      try
      {
        label70: this.mMethod = this.mClass.getMethod(this.mName, this.mParameterTypes);
        if (this.mMethod != null)
        {
          AppMethodBeat.o(85518);
          bool = true;
        }
      }
      catch (NoSuchMethodException paramObject)
      {
        paramObject = this.mClass;
        while (paramObject != null)
          try
          {
            this.mMethod = paramObject.getDeclaredMethod(this.mName, this.mParameterTypes);
            this.mMethod.setAccessible(true);
          }
          catch (NoSuchMethodException paramClass)
          {
            paramObject = paramObject.getSuperclass();
          }
        AppMethodBeat.o(85518);
        bool = false;
      }
    }
  }

  public Object invoke(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(85519);
    if (this.mMethod == null)
    {
      paramArrayOfObject = new UnsupportedOperationException(toString());
      AppMethodBeat.o(85519);
      throw paramArrayOfObject;
    }
    try
    {
      paramArrayOfObject = this.mMethod.invoke(this.mInstance, paramArrayOfObject);
      AppMethodBeat.o(85519);
      return paramArrayOfObject;
    }
    catch (NullPointerException paramArrayOfObject)
    {
      paramArrayOfObject = new RejectedExecutionException(paramArrayOfObject);
      AppMethodBeat.o(85519);
      throw paramArrayOfObject;
    }
    catch (IllegalArgumentException paramArrayOfObject)
    {
      AppMethodBeat.o(85519);
      throw paramArrayOfObject;
    }
    catch (InvocationTargetException paramArrayOfObject)
    {
      paramArrayOfObject = new RuntimeException(paramArrayOfObject.getCause());
      AppMethodBeat.o(85519);
      throw paramArrayOfObject;
    }
    catch (IllegalAccessException paramArrayOfObject)
    {
      label52: break label52;
    }
  }

  public Object invokeWithArguments()
  {
    AppMethodBeat.i(85521);
    Object localObject = invoke(this.mArguments);
    AppMethodBeat.o(85521);
    return localObject;
  }

  public boolean isNull()
  {
    if (this.mMethod == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void setArguments(Object[] paramArrayOfObject)
  {
    this.mArguments = paramArrayOfObject;
  }

  public String toString()
  {
    AppMethodBeat.i(85520);
    Object localObject;
    if (this.mMethod != null)
    {
      localObject = this.mMethod.toString();
      AppMethodBeat.o(85520);
    }
    while (true)
    {
      return localObject;
      String str = "";
      if (this.mClass != null)
        str = "" + this.mClass.toString() + ".";
      localObject = str;
      if (this.mName != null)
        localObject = str + this.mName;
      AppMethodBeat.o(85520);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.xwalk.core.ReflectMethod
 * JD-Core Version:    0.6.2
 */
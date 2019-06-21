package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.RejectedExecutionException;

class ReflectConstructor
{
  private Class<?> mClass;
  private Constructor<?> mConstructor;
  private Class<?>[] mParameterTypes;

  public ReflectConstructor()
  {
  }

  public ReflectConstructor(Class<?> paramClass, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(85512);
    init(paramClass, paramArrayOfClass);
    AppMethodBeat.o(85512);
  }

  public boolean init(Class<?> paramClass, Class<?>[] paramArrayOfClass)
  {
    boolean bool = false;
    AppMethodBeat.i(85513);
    this.mClass = paramClass;
    this.mParameterTypes = paramArrayOfClass;
    this.mConstructor = null;
    if (this.mClass == null)
      AppMethodBeat.o(85513);
    while (true)
    {
      return bool;
      try
      {
        this.mConstructor = this.mClass.getConstructor(this.mParameterTypes);
        if (this.mConstructor != null)
        {
          AppMethodBeat.o(85513);
          bool = true;
        }
      }
      catch (NoSuchMethodException paramClass)
      {
        while (true)
          try
          {
            this.mConstructor = this.mClass.getDeclaredConstructor(this.mParameterTypes);
            this.mConstructor.setAccessible(true);
          }
          catch (NoSuchMethodException paramClass)
          {
          }
        AppMethodBeat.o(85513);
      }
    }
  }

  public boolean isNull()
  {
    if (this.mConstructor == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public Object newInstance(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(85514);
    if (this.mConstructor == null)
    {
      paramArrayOfObject = new UnsupportedOperationException(toString());
      AppMethodBeat.o(85514);
      throw paramArrayOfObject;
    }
    try
    {
      paramArrayOfObject = this.mConstructor.newInstance(paramArrayOfObject);
      AppMethodBeat.o(85514);
      return paramArrayOfObject;
    }
    catch (IllegalAccessException paramArrayOfObject)
    {
      paramArrayOfObject = new RejectedExecutionException(paramArrayOfObject);
      AppMethodBeat.o(85514);
      throw paramArrayOfObject;
    }
    catch (InstantiationException paramArrayOfObject)
    {
      paramArrayOfObject = new RejectedExecutionException(paramArrayOfObject);
      AppMethodBeat.o(85514);
      throw paramArrayOfObject;
    }
    catch (IllegalArgumentException paramArrayOfObject)
    {
      AppMethodBeat.o(85514);
      throw paramArrayOfObject;
    }
    catch (InvocationTargetException paramArrayOfObject)
    {
      paramArrayOfObject = new RuntimeException(paramArrayOfObject.getCause());
      AppMethodBeat.o(85514);
    }
    throw paramArrayOfObject;
  }

  public String toString()
  {
    AppMethodBeat.i(85515);
    String str;
    if (this.mConstructor != null)
    {
      str = this.mConstructor.toString();
      AppMethodBeat.o(85515);
    }
    while (true)
    {
      return str;
      str = "";
      if (this.mClass != null)
        str = "" + this.mClass.toString();
      AppMethodBeat.o(85515);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.xwalk.core.ReflectConstructor
 * JD-Core Version:    0.6.2
 */
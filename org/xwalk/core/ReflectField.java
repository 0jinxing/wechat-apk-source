package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.util.concurrent.RejectedExecutionException;

public class ReflectField
{
  private Class<?> mClass;
  private Field mField;
  private Object mInstance;
  private String mName;

  public ReflectField()
  {
  }

  public ReflectField(Class<?> paramClass, String paramString)
  {
    AppMethodBeat.i(4195);
    init(null, paramClass, paramString);
    AppMethodBeat.o(4195);
  }

  public ReflectField(Object paramObject, String paramString)
  {
    AppMethodBeat.i(4194);
    init(paramObject, null, paramString);
    AppMethodBeat.o(4194);
  }

  public Object get()
  {
    AppMethodBeat.i(4197);
    Object localObject;
    if (this.mField == null)
    {
      localObject = new UnsupportedOperationException(toString());
      AppMethodBeat.o(4197);
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = this.mField.get(this.mInstance);
      AppMethodBeat.o(4197);
      return localObject;
    }
    catch (NullPointerException localNullPointerException)
    {
      RejectedExecutionException localRejectedExecutionException = new RejectedExecutionException(localNullPointerException);
      AppMethodBeat.o(4197);
      throw localRejectedExecutionException;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      AppMethodBeat.o(4197);
      throw localIllegalArgumentException;
    }
    catch (ExceptionInInitializerError localExceptionInInitializerError)
    {
      RuntimeException localRuntimeException = new RuntimeException(localExceptionInInitializerError);
      AppMethodBeat.o(4197);
      throw localRuntimeException;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label54: break label54;
    }
  }

  public Object getInstance()
  {
    return this.mInstance;
  }

  public String getName()
  {
    return this.mName;
  }

  public boolean init(Object paramObject, Class<?> paramClass, String paramString)
  {
    AppMethodBeat.i(4196);
    this.mInstance = paramObject;
    boolean bool;
    if (paramClass != null)
    {
      this.mClass = paramClass;
      this.mName = paramString;
      this.mField = null;
      if (this.mClass != null)
        break label66;
      AppMethodBeat.o(4196);
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
        label66: this.mField = this.mClass.getField(this.mName);
        if (this.mField != null)
        {
          AppMethodBeat.o(4196);
          bool = true;
        }
      }
      catch (NoSuchFieldException paramObject)
      {
        paramObject = this.mClass;
        while (paramObject != null)
          try
          {
            this.mField = paramObject.getDeclaredField(this.mName);
            this.mField.setAccessible(true);
          }
          catch (NoSuchFieldException paramClass)
          {
            paramObject = paramObject.getSuperclass();
          }
        AppMethodBeat.o(4196);
        bool = false;
      }
    }
  }

  public boolean isNull()
  {
    if (this.mField == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String toString()
  {
    AppMethodBeat.i(4198);
    Object localObject;
    if (this.mField != null)
    {
      localObject = this.mField.toString();
      AppMethodBeat.o(4198);
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
      AppMethodBeat.o(4198);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.xwalk.core.ReflectField
 * JD-Core Version:    0.6.2
 */
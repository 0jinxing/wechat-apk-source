package com.tencent.mm.plugin.normsg.b;

import android.os.IBinder;
import android.os.IInterface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class b$e
  implements InvocationHandler
{
  protected final IInterface oUR;

  b$e(b paramb, IInterface paramIInterface)
  {
    this.oUR = paramIInterface;
  }

  public IBinder asBinder()
  {
    AppMethodBeat.i(10411);
    IBinder localIBinder = this.oUR.asBinder();
    AppMethodBeat.o(10411);
    return localIBinder;
  }

  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10410);
    paramObject = paramMethod.getName();
    try
    {
      if ("asBinder".equals(paramObject))
      {
        paramObject = asBinder();
        AppMethodBeat.o(10410);
      }
      while (true)
      {
        return paramObject;
        paramObject = paramMethod.invoke(this.oUR, paramArrayOfObject);
        AppMethodBeat.o(10410);
      }
    }
    catch (InvocationTargetException paramObject)
    {
      while (true)
      {
        paramObject = paramObject.getTargetException();
        if ((paramObject instanceof RuntimeException))
        {
          AppMethodBeat.o(10410);
          throw paramObject;
        }
        paramArrayOfObject = paramMethod.getExceptionTypes();
        if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
        {
          paramArrayOfObject = paramMethod.getExceptionTypes();
          int i = paramArrayOfObject.length;
          for (int j = 0; j < i; j++)
            if (paramArrayOfObject[j].isAssignableFrom(paramObject.getClass()))
            {
              AppMethodBeat.o(10410);
              throw paramObject;
            }
        }
        b.a(this.oUG, paramObject);
        paramObject = b.c(paramMethod);
        AppMethodBeat.o(10410);
      }
    }
    catch (Throwable paramObject)
    {
      while (true)
      {
        b.a(this.oUG, paramObject);
        paramObject = b.c(paramMethod);
        AppMethodBeat.o(10410);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.e
 * JD-Core Version:    0.6.2
 */
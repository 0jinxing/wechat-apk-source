package com.tencent.mm.kernel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class f
{
  private static volatile boolean eKg = false;

  public static <T> T P(Class<T> paramClass)
  {
    AppMethodBeat.i(123248);
    if (!eKg)
    {
      paramClass = null;
      AppMethodBeat.o(123248);
    }
    while (true)
    {
      return paramClass;
      paramClass = a(paramClass, 0);
      AppMethodBeat.o(123248);
    }
  }

  private static <T> T a(Class<T> paramClass, int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(123249);
    if (!eKg)
    {
      AppMethodBeat.o(123249);
      paramClass = localObject1;
    }
    while (true)
    {
      return paramClass;
      if (paramInt > 3)
      {
        j.e("MMSkeleton.DummyMode", "dummy level > 3, return null.", new Object[0]);
        AppMethodBeat.o(123249);
        paramClass = localObject1;
      }
      else if (!paramClass.isInterface())
      {
        AppMethodBeat.o(123249);
        paramClass = localObject1;
      }
      else
      {
        try
        {
          Object localObject2 = new com/tencent/mm/kernel/f$a;
          ((a)localObject2).<init>((byte)0);
          ((a)localObject2).level = paramInt;
          localObject2 = Proxy.newProxyInstance(paramClass.getClassLoader(), new Class[] { paramClass, b.class }, (InvocationHandler)localObject2);
          j.i("MMSkeleton.DummyMode", "dummy instance(%s) for class(%s), dummy level %s", new Object[] { localObject2, paramClass, Integer.valueOf(paramInt) });
          AppMethodBeat.o(123249);
          paramClass = (Class<T>)localObject2;
        }
        catch (Throwable paramClass)
        {
          j.printErrStackTrace("MMSkeleton.DummyMode", paramClass, "", new Object[0]);
          AppMethodBeat.o(123249);
          paramClass = localObject1;
        }
      }
    }
  }

  public static boolean ay(Object paramObject)
  {
    if ((paramObject instanceof b));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static final class a
    implements InvocationHandler
  {
    public int level = 0;

    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(123247);
      paramObject = paramMethod.getReturnType();
      if (paramObject.equals(Integer.TYPE))
      {
        paramObject = Integer.valueOf(0);
        AppMethodBeat.o(123247);
      }
      while (true)
      {
        return paramObject;
        if (paramObject.equals(Long.TYPE))
        {
          paramObject = Long.valueOf(0L);
          AppMethodBeat.o(123247);
        }
        else if (paramObject.equals(Double.TYPE))
        {
          paramObject = Double.valueOf(0.0D);
          AppMethodBeat.o(123247);
        }
        else if (paramObject.equals(Float.TYPE))
        {
          paramObject = Float.valueOf(0.0F);
          AppMethodBeat.o(123247);
        }
        else if (paramObject.equals(Short.TYPE))
        {
          paramObject = Integer.valueOf(0);
          AppMethodBeat.o(123247);
        }
        else if (paramObject.equals(Byte.TYPE))
        {
          paramObject = Integer.valueOf(0);
          AppMethodBeat.o(123247);
        }
        else if (paramObject.equals(Character.TYPE))
        {
          paramObject = Integer.valueOf(0);
          AppMethodBeat.o(123247);
        }
        else if (paramObject.equals(Boolean.TYPE))
        {
          paramObject = Boolean.FALSE;
          AppMethodBeat.o(123247);
        }
        else if (paramObject.equals(Boolean.class))
        {
          paramObject = Boolean.FALSE;
          AppMethodBeat.o(123247);
        }
        else if (paramObject.isInterface())
        {
          paramObject = f.b(paramObject, this.level + 1);
          AppMethodBeat.o(123247);
        }
        else
        {
          paramObject = null;
          AppMethodBeat.o(123247);
        }
      }
    }
  }

  static abstract interface b
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.f
 * JD-Core Version:    0.6.2
 */
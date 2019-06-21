package com.tencent.d.d.b;

import android.text.TextUtils;
import com.tencent.d.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class e
{
  public static Object a(Class<?> paramClass, String paramString, Object paramObject)
  {
    Object localObject = null;
    AppMethodBeat.i(114528);
    try
    {
      paramClass = c(paramClass, paramString);
      if (paramClass == null)
      {
        AppMethodBeat.o(114528);
        paramClass = localObject;
      }
      while (true)
      {
        return paramClass;
        paramClass = paramClass.get(paramObject);
        AppMethodBeat.o(114528);
      }
    }
    catch (Throwable paramClass)
    {
      while (true)
      {
        h.w(paramClass);
        AppMethodBeat.o(114528);
        paramClass = localObject;
      }
    }
  }

  public static Method a(String paramString1, String paramString2, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(114531);
    try
    {
      paramString1 = b(atT(paramString1), paramString2, paramArrayOfClass);
      AppMethodBeat.o(114531);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        h.w(paramString1);
        paramString1 = null;
        AppMethodBeat.o(114531);
      }
    }
  }

  private static Class<?> atT(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(114527);
    try
    {
      paramString = Class.forName(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(114527);
        paramString = localObject;
        return paramString;
      }
    }
    catch (Throwable paramString)
    {
      while (true)
        try
        {
          h.w(paramString);
          paramString = null;
          continue;
          AppMethodBeat.o(114527);
        }
        catch (Throwable paramString)
        {
          h.w(paramString);
          AppMethodBeat.o(114527);
          paramString = localObject;
        }
    }
  }

  private static Method b(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    Object localObject = null;
    AppMethodBeat.i(114530);
    if (paramClass != null);
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool)
      {
        AppMethodBeat.o(114530);
        paramClass = localObject;
      }
      while (true)
      {
        return paramClass;
        paramClass = paramClass.getDeclaredMethod(paramString, paramArrayOfClass);
        if (paramClass == null)
        {
          AppMethodBeat.o(114530);
          paramClass = localObject;
        }
        else
        {
          paramClass.setAccessible(true);
          AppMethodBeat.o(114530);
        }
      }
    }
    catch (Throwable paramClass)
    {
      while (true)
      {
        h.w(paramClass);
        AppMethodBeat.o(114530);
        paramClass = localObject;
      }
    }
  }

  private static Field c(Class<?> paramClass, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(114526);
    if (paramClass == null)
    {
      AppMethodBeat.o(114526);
      paramClass = localObject;
    }
    while (true)
    {
      return paramClass;
      try
      {
        paramClass = paramClass.getDeclaredField(paramString);
        if (paramClass == null)
        {
          AppMethodBeat.o(114526);
          paramClass = localObject;
        }
        else
        {
          paramClass.setAccessible(true);
          AppMethodBeat.o(114526);
        }
      }
      catch (Throwable paramClass)
      {
        h.w(paramClass);
        AppMethodBeat.o(114526);
        paramClass = localObject;
      }
    }
  }

  public static Object iB(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(114529);
    try
    {
      paramString1 = a(atT(paramString1), paramString2, null);
      AppMethodBeat.o(114529);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        h.w(paramString1);
        AppMethodBeat.o(114529);
        paramString1 = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.b.e
 * JD-Core Version:    0.6.2
 */
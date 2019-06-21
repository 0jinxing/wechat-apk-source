package com.tencent.mm.plugin.normsg.b;

import android.util.LruCache;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class h
{
  private static final LruCache<String, LruCache<String, Field>> oVj;
  private static final LruCache<String, LruCache<String, Method>> oVk;
  private static final LruCache<String, LruCache<String, Constructor<?>>> oVl;

  static
  {
    AppMethodBeat.i(10452);
    oVj = new LruCache(50);
    oVk = new LruCache(50);
    oVl = new LruCache(50);
    AppMethodBeat.o(10452);
  }

  private static <T> T a(Class<?> paramClass, String paramString)
  {
    AppMethodBeat.i(10445);
    try
    {
      paramClass = b(paramClass, paramString).get(null);
      AppMethodBeat.o(10445);
      return paramClass;
    }
    catch (Throwable paramClass)
    {
      paramClass = new h.a(paramClass);
      AppMethodBeat.o(10445);
    }
    throw paramClass;
  }

  public static <T> T a(String paramString1, String paramString2, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10448);
    paramString1 = b(findClass(paramString1), paramString2, paramArrayOfClass, paramArrayOfObject);
    AppMethodBeat.o(10448);
    return paramString1;
  }

  private static Method a(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(10451);
    LruCache localLruCache = (LruCache)oVk.get(paramClass.getName());
    if (localLruCache == null)
    {
      localLruCache = new LruCache(30);
      oVk.put(paramClass.getName(), localLruCache);
    }
    while (true)
    {
      Object localObject1 = new StringBuilder().append(paramString).append("#");
      if (paramArrayOfClass != null);
      for (Object localObject2 = Arrays.toString(paramArrayOfClass); ; localObject2 = "[]")
      {
        localObject1 = (String)localObject2;
        localObject2 = (Method)localLruCache.get(localObject1);
        if (localObject2 == null)
          break;
        AppMethodBeat.o(10451);
        paramClass = (Class<?>)localObject2;
        return paramClass;
      }
      do
        while (true)
        {
          paramClass = paramClass.getSuperclass();
          try
          {
            localObject2 = paramClass.getDeclaredMethod(paramString, paramArrayOfClass);
            if (!((Method)localObject2).isAccessible())
              ((Method)localObject2).setAccessible(true);
            localLruCache.put(localObject1, localObject2);
            AppMethodBeat.o(10451);
            paramClass = (Class<?>)localObject2;
          }
          catch (Throwable localThrowable)
          {
          }
        }
      while ((paramClass.getSuperclass() != null) && (paramClass != Object.class));
      AppMethodBeat.o(10451);
      throw localThrowable;
    }
  }

  public static <T> T b(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10449);
    try
    {
      paramClass = a(paramClass, paramString, paramArrayOfClass).invoke(null, paramArrayOfObject);
      AppMethodBeat.o(10449);
      return paramClass;
    }
    catch (Throwable paramClass)
    {
      paramClass = new h.a(paramClass);
      AppMethodBeat.o(10449);
    }
    throw paramClass;
  }

  public static <T> T b(Object paramObject, String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10447);
    Class localClass = paramObject.getClass();
    try
    {
      paramObject = a(localClass, paramString, paramArrayOfClass).invoke(paramObject, paramArrayOfObject);
      AppMethodBeat.o(10447);
      return paramObject;
    }
    catch (Throwable paramObject)
    {
      paramObject = new h.a(paramObject);
      AppMethodBeat.o(10447);
    }
    throw paramObject;
  }

  private static Field b(Class<?> paramClass, String paramString)
  {
    AppMethodBeat.i(10450);
    LruCache localLruCache = (LruCache)oVj.get(paramClass.getName());
    if (localLruCache == null)
    {
      localLruCache = new LruCache(30);
      oVj.put(paramClass.getName(), localLruCache);
    }
    while (true)
    {
      Field localField = (Field)localLruCache.get(paramString);
      if (localField != null)
      {
        AppMethodBeat.o(10450);
        paramClass = localField;
        return paramClass;
      }
      do
        while (true)
        {
          paramClass = paramClass.getSuperclass();
          try
          {
            localField = paramClass.getDeclaredField(paramString);
            if (!localField.isAccessible())
              localField.setAccessible(true);
            localLruCache.put(paramString, localField);
            AppMethodBeat.o(10450);
            paramClass = localField;
          }
          catch (Throwable localThrowable)
          {
          }
        }
      while ((paramClass.getSuperclass() != null) && (paramClass != Object.class));
      AppMethodBeat.o(10450);
      throw localThrowable;
    }
  }

  public static <T> void b(Object paramObject, String paramString, T paramT)
  {
    AppMethodBeat.i(10446);
    Class localClass = paramObject.getClass();
    try
    {
      b(localClass, paramString).set(paramObject, paramT);
      AppMethodBeat.o(10446);
      return;
    }
    catch (Throwable paramObject)
    {
      paramObject = new h.a(paramObject);
      AppMethodBeat.o(10446);
    }
    throw paramObject;
  }

  public static Class<?>[] b(Class<?>[] paramArrayOfClass)
  {
    return paramArrayOfClass;
  }

  public static <T> T f(Object paramObject, String paramString)
  {
    AppMethodBeat.i(10443);
    Class localClass = paramObject.getClass();
    try
    {
      paramObject = b(localClass, paramString).get(paramObject);
      AppMethodBeat.o(10443);
      return paramObject;
    }
    catch (Throwable paramObject)
    {
      paramObject = new h.a(paramObject);
      AppMethodBeat.o(10443);
    }
    throw paramObject;
  }

  public static Class<?> findClass(String paramString)
  {
    AppMethodBeat.i(10442);
    try
    {
      paramString = Class.forName(paramString);
      AppMethodBeat.o(10442);
      return paramString;
    }
    catch (Throwable paramString)
    {
      paramString = new h.a(paramString);
      AppMethodBeat.o(10442);
    }
    throw paramString;
  }

  public static <T> T fx(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10444);
    paramString1 = a(findClass(paramString1), paramString2);
    AppMethodBeat.o(10444);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.h
 * JD-Core Version:    0.6.2
 */
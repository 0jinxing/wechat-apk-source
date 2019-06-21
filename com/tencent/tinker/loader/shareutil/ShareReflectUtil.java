package com.tencent.tinker.loader.shareutil;

import android.content.Context;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ShareReflectUtil
{
  public static Constructor<?> a(Object paramObject, Class<?>[] paramArrayOfClass)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null)
      try
      {
        Constructor localConstructor = localClass.getDeclaredConstructor(paramArrayOfClass);
        if (!localConstructor.isAccessible())
          localConstructor.setAccessible(true);
        return localConstructor;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localClass = localClass.getSuperclass();
      }
    throw new NoSuchMethodException("Constructor with parameters " + Arrays.asList(paramArrayOfClass) + " not found in " + paramObject.getClass());
  }

  public static void a(Object paramObject, String paramString, int paramInt)
  {
    if (paramInt <= 0);
    while (true)
    {
      return;
      Field localField = b(paramObject, paramString);
      paramString = (Object[])localField.get(paramObject);
      int i = paramString.length - paramInt;
      if (i > 0)
      {
        Object[] arrayOfObject = (Object[])Array.newInstance(paramString.getClass().getComponentType(), i);
        System.arraycopy(paramString, paramInt, arrayOfObject, 0, i);
        localField.set(paramObject, arrayOfObject);
      }
    }
  }

  public static Field b(Object paramObject, String paramString)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null)
      try
      {
        Field localField = localClass.getDeclaredField(paramString);
        if (!localField.isAccessible())
          localField.setAccessible(true);
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localClass = localClass.getSuperclass();
      }
    throw new NoSuchFieldException("Field " + paramString + " not found in " + paramObject.getClass());
  }

  public static Method b(Object paramObject, String paramString, Class<?>[] paramArrayOfClass)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null)
      try
      {
        Method localMethod = localClass.getDeclaredMethod(paramString, paramArrayOfClass);
        if (!localMethod.isAccessible())
          localMethod.setAccessible(true);
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localClass = localClass.getSuperclass();
      }
    throw new NoSuchMethodException("Method " + paramString + " with parameters " + Arrays.asList(paramArrayOfClass) + " not found in " + paramObject.getClass());
  }

  public static void b(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    Field localField = b(paramObject, paramString);
    paramString = (Object[])localField.get(paramObject);
    Object[] arrayOfObject = (Object[])Array.newInstance(paramString.getClass().getComponentType(), paramString.length + paramArrayOfObject.length);
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramArrayOfObject.length);
    System.arraycopy(paramString, 0, arrayOfObject, paramArrayOfObject.length, paramString.length);
    localField.set(paramObject, arrayOfObject);
  }

  public static Method c(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    while (paramClass != null)
      try
      {
        Method localMethod = paramClass.getDeclaredMethod(paramString, paramArrayOfClass);
        if (!localMethod.isAccessible())
          localMethod.setAccessible(true);
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        paramClass = paramClass.getSuperclass();
      }
    throw new NoSuchMethodException("Method " + paramString + " with parameters " + Arrays.asList(paramArrayOfClass) + " not found in " + paramClass);
  }

  public static Object d(Context paramContext, Class<?> paramClass)
  {
    Object localObject = paramClass;
    if (paramClass == null);
    try
    {
      localObject = Class.forName("android.app.ActivityThread");
      paramClass = ((Class)localObject).getMethod("currentActivityThread", new Class[0]);
      paramClass.setAccessible(true);
      localObject = paramClass.invoke(null, new Object[0]);
      paramClass = (Class<?>)localObject;
      if (localObject == null)
      {
        paramClass = (Class<?>)localObject;
        if (paramContext != null)
        {
          paramClass = paramContext.getClass().getField("mLoadedApk");
          paramClass.setAccessible(true);
          paramClass = paramClass.get(paramContext);
          paramContext = paramClass.getClass().getDeclaredField("mActivityThread");
          paramContext.setAccessible(true);
          paramClass = paramContext.get(paramClass);
        }
      }
      return paramClass;
    }
    catch (Throwable paramContext)
    {
      while (true)
        paramClass = null;
    }
  }

  public static Field d(Class<?> paramClass, String paramString)
  {
    Object localObject = paramClass;
    while (localObject != null)
      try
      {
        Field localField = ((Class)localObject).getDeclaredField(paramString);
        if (!localField.isAccessible())
          localField.setAccessible(true);
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localObject = ((Class)localObject).getSuperclass();
      }
    throw new NoSuchFieldException("Field " + paramString + " not found in " + paramClass);
  }

  public static int e(Class<?> paramClass, String paramString)
  {
    try
    {
      i = d(paramClass, paramString).getInt(null);
      return i;
    }
    catch (Throwable paramClass)
    {
      while (true)
        int i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.ShareReflectUtil
 * JD-Core Version:    0.6.2
 */
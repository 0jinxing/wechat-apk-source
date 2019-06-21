package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzzq<MessageType extends zzzq<MessageType, BuilderType>, BuilderType> extends zzyu<MessageType, BuilderType>
{
  private static Map<Object, zzzq<?, ?>> zzbsa = new ConcurrentHashMap();
  protected zzabk zzbry = zzabk.zzuq();
  private int zzbrz = -1;

  static Object zza(Method paramMethod, Object paramObject, Object[] paramArrayOfObject)
  {
    try
    {
      paramMethod = paramMethod.invoke(paramObject, paramArrayOfObject);
      return paramMethod;
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if ((paramMethod instanceof RuntimeException))
        throw ((RuntimeException)paramMethod);
      if ((paramMethod instanceof Error))
        throw ((Error)paramMethod);
    }
    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
  }

  static <T extends zzzq<?, ?>> T zzf(Class<T> paramClass)
  {
    zzzq localzzzq1 = (zzzq)zzbsa.get(paramClass);
    zzzq localzzzq2 = localzzzq1;
    if (localzzzq1 == null);
    while (true)
    {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localzzzq2 = (zzzq)zzbsa.get(paramClass);
        if (localzzzq2 != null)
          break;
        paramClass = String.valueOf(paramClass.getName());
        if (paramClass.length() != 0)
        {
          paramClass = "Unable to get default instance for: ".concat(paramClass);
          throw new IllegalStateException(paramClass);
        }
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
      paramClass = new String("Unable to get default instance for: ");
    }
    return localzzzq2;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject)
      bool = true;
    while (true)
    {
      return bool;
      if (!((zzzq)zza(6, null, null)).getClass().isInstance(paramObject))
        bool = false;
      else
        bool = zzaat.zzud().zzt(this).equals(this, (zzzq)paramObject);
    }
  }

  public int hashCode()
  {
    if (this.zzbqt != 0);
    for (int i = this.zzbqt; ; i = this.zzbqt)
    {
      return i;
      this.zzbqt = zzaat.zzud().zzt(this).hashCode(this);
    }
  }

  public String toString()
  {
    return zzaan.zza(this, super.toString());
  }

  protected abstract Object zza(int paramInt, Object paramObject1, Object paramObject2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzzq
 * JD-Core Version:    0.6.2
 */
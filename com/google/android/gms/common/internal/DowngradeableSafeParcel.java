package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Field;

public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  private static final Object zzsj = new Object();
  private static ClassLoader zzsk = null;
  private static Integer zzsl = null;
  private boolean zzsm = false;

  protected static boolean canUnparcelSafely(String paramString)
  {
    ClassLoader localClassLoader = getUnparcelClassLoader();
    boolean bool;
    if (localClassLoader == null)
      bool = true;
    while (true)
    {
      return bool;
      try
      {
        bool = zza(localClassLoader.loadClass(paramString));
      }
      catch (Exception paramString)
      {
        bool = false;
      }
    }
  }

  static Bundle getExtras(Intent paramIntent, Context paramContext, Integer paramInteger)
  {
    if (paramContext != null);
    while (true)
    {
      try
      {
        zza(paramContext.getClassLoader(), paramInteger);
        if (paramIntent.getExtras() != null)
        {
          paramContext = new android/os/Bundle;
          paramContext.<init>();
          paramContext.putAll(paramIntent.getExtras());
          paramIntent = paramContext;
          return paramIntent;
        }
      }
      finally
      {
        zza(null, null);
      }
      paramIntent = null;
    }
  }

  static <T extends Parcelable> T getParcelable(Intent paramIntent, String paramString, Context paramContext, Integer paramInteger)
  {
    if (paramContext != null);
    while (true)
    {
      try
      {
        zza(paramContext.getClassLoader(), paramInteger);
        paramIntent = paramIntent.getParcelableExtra(paramString);
        return paramIntent;
      }
      finally
      {
        zza(null, null);
      }
      paramIntent = null;
    }
  }

  static <T extends Parcelable> T getParcelable(Bundle paramBundle, String paramString, Context paramContext, Integer paramInteger)
  {
    if (paramContext != null);
    while (true)
    {
      try
      {
        zza(paramContext.getClassLoader(), paramInteger);
        paramBundle = paramBundle.getParcelable(paramString);
        return paramBundle;
      }
      finally
      {
        zza(null, null);
      }
      paramBundle = null;
    }
  }

  protected static ClassLoader getUnparcelClassLoader()
  {
    synchronized (zzsj)
    {
      ClassLoader localClassLoader = zzsk;
      return localClassLoader;
    }
  }

  protected static Integer getUnparcelClientVersion()
  {
    synchronized (zzsj)
    {
      Integer localInteger = zzsl;
      return localInteger;
    }
  }

  static boolean putParcelable(Bundle paramBundle, String paramString, DowngradeableSafeParcel paramDowngradeableSafeParcel, Context paramContext, Integer paramInteger)
  {
    boolean bool = false;
    if ((paramContext == null) && (paramInteger == null));
    while (true)
    {
      return bool;
      if (paramDowngradeableSafeParcel.zza(paramContext, paramInteger))
      {
        paramBundle.putParcelable(paramString, paramDowngradeableSafeParcel);
        bool = true;
      }
    }
  }

  private static void zza(ClassLoader paramClassLoader, Integer paramInteger)
  {
    synchronized (zzsj)
    {
      zzsk = paramClassLoader;
      zzsl = paramInteger;
      return;
    }
  }

  private final boolean zza(Context paramContext, Integer paramInteger)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInteger != null)
    {
      bool2 = prepareForClientVersion(paramInteger.intValue());
      return bool2;
    }
    while (true)
    {
      try
      {
        if (zza(paramContext.getClassLoader().loadClass(getClass().getCanonicalName())))
          break label61;
        bool2 = true;
        setShouldDowngrade(bool2);
        bool2 = bool1;
      }
      catch (Exception paramContext)
      {
        bool2 = false;
      }
      break;
      label61: bool2 = false;
    }
  }

  private static boolean zza(Class<?> paramClass)
  {
    boolean bool1 = false;
    try
    {
      boolean bool2 = "SAFE_PARCELABLE_NULL_STRING".equals(paramClass.getField("NULL").get(null));
      bool1 = bool2;
      label20: return bool1;
    }
    catch (IllegalAccessException paramClass)
    {
      break label20;
    }
    catch (NoSuchFieldException paramClass)
    {
      break label20;
    }
  }

  protected abstract boolean prepareForClientVersion(int paramInt);

  public void setShouldDowngrade(boolean paramBoolean)
  {
    this.zzsm = paramBoolean;
  }

  protected boolean shouldDowngrade()
  {
    return this.zzsm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.DowngradeableSafeParcel
 * JD-Core Version:    0.6.2
 */
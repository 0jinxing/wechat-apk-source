package com.google.android.gms.common.config;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public abstract class GservicesValue<T>
{
  private static final Object sLock = new Object();
  private static GservicesValue.zza zzmu = null;
  private static int zzmv = 0;
  private static Context zzmw;
  private static String zzmx = "com.google.android.providers.gsf.permission.READ_GSERVICES";

  @GuardedBy("sLock")
  private static HashSet<String> zzmy;
  protected final T mDefaultValue;
  protected final String mKey;
  private T zzmz = null;

  protected GservicesValue(String paramString, T paramT)
  {
    this.mKey = paramString;
    this.mDefaultValue = paramT;
  }

  @Deprecated
  @VisibleForTesting
  public static void forceInit(Context paramContext)
  {
    forceInit(paramContext, new HashSet());
  }

  @VisibleForTesting
  public static void forceInit(Context paramContext, HashSet<String> paramHashSet)
  {
    zza(paramContext, new GservicesValue.zzd(paramContext.getContentResolver()), paramHashSet);
  }

  @TargetApi(24)
  public static SharedPreferences getDirectBootCache(Context paramContext)
  {
    return paramContext.getApplicationContext().createDeviceProtectedStorageContext().getSharedPreferences("gservices-direboot-cache", 0);
  }

  public static int getSharedUserId()
  {
    return zzmv;
  }

  @Deprecated
  public static void init(Context paramContext)
  {
    if (zzd(paramContext));
    for (HashSet localHashSet = new HashSet(); ; localHashSet = null)
    {
      init(paramContext, localHashSet);
      return;
    }
  }

  public static void init(Context paramContext, HashSet<String> paramHashSet)
  {
    synchronized (sLock)
    {
      if (zzmu == null)
      {
        GservicesValue.zzd localzzd = new com/google/android/gms/common/config/GservicesValue$zzd;
        localzzd.<init>(paramContext.getContentResolver());
        zza(paramContext, localzzd, paramHashSet);
      }
      int i = zzmv;
      if (i != 0);
    }
    try
    {
      zzmv = paramContext.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
      label56: return;
      paramContext = finally;
      throw paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      break label56;
    }
  }

  @Deprecated
  @VisibleForTesting
  public static void initForTests()
  {
    zza(null, new GservicesValue.zzb(null), new HashSet());
  }

  @VisibleForTesting
  public static void initForTests(Context paramContext, HashSet<String> paramHashSet)
  {
    zza(paramContext, new GservicesValue.zzb(null), paramHashSet);
  }

  @Deprecated
  @VisibleForTesting
  public static void initForTests(String paramString, Object paramObject)
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put(paramString, paramObject);
    initForTests(localHashMap);
  }

  @Deprecated
  @VisibleForTesting
  public static void initForTests(Map<String, ?> paramMap)
  {
    synchronized (sLock)
    {
      GservicesValue.zzc localzzc = new com/google/android/gms/common/config/GservicesValue$zzc;
      localzzc.<init>(paramMap);
      zzmu = localzzc;
      return;
    }
  }

  public static boolean isInitialized()
  {
    synchronized (sLock)
    {
      if (zzmu != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public static GservicesValue<String> partnerSetting(String paramString1, String paramString2)
  {
    return new zzg(paramString1, paramString2);
  }

  @VisibleForTesting
  public static void resetAllOverrides()
  {
    synchronized (sLock)
    {
      if (!zzcg())
        break label58;
      Iterator localIterator = GservicesValue.zzb.zzci().iterator();
      if (localIterator.hasNext())
        ((GservicesValue)localIterator.next()).resetOverride();
    }
    GservicesValue.zzb.zzci().clear();
    label58:
  }

  public static GservicesValue<Double> value(String paramString, Double paramDouble)
  {
    return new zzd(paramString, paramDouble);
  }

  public static GservicesValue<Float> value(String paramString, Float paramFloat)
  {
    return new zze(paramString, paramFloat);
  }

  public static GservicesValue<Integer> value(String paramString, Integer paramInteger)
  {
    return new zzc(paramString, paramInteger);
  }

  public static GservicesValue<Long> value(String paramString, Long paramLong)
  {
    return new zzb(paramString, paramLong);
  }

  public static GservicesValue<String> value(String paramString1, String paramString2)
  {
    return new zzf(paramString1, paramString2);
  }

  public static GservicesValue<Boolean> value(String paramString, boolean paramBoolean)
  {
    return new zza(paramString, Boolean.valueOf(paramBoolean));
  }

  @TargetApi(24)
  private static void zza(Context paramContext, GservicesValue.zza paramzza, HashSet<String> paramHashSet)
  {
    synchronized (sLock)
    {
      zzmu = paramzza;
      zzmy = null;
      zzmw = null;
      if ((paramContext != null) && (zzd(paramContext)))
      {
        zzmy = paramHashSet;
        zzmw = paramContext.getApplicationContext().createDeviceProtectedStorageContext();
      }
      return;
    }
  }

  private static boolean zzcg()
  {
    synchronized (sLock)
    {
      if (((zzmu instanceof GservicesValue.zzb)) || ((zzmu instanceof GservicesValue.zzc)))
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  @TargetApi(24)
  private static boolean zzd(Context paramContext)
  {
    boolean bool;
    if (!PlatformVersion.isAtLeastN())
      bool = false;
    while (true)
    {
      return bool;
      paramContext = (UserManager)paramContext.getSystemService(UserManager.class);
      if (paramContext.isUserUnlocked())
        bool = false;
      else if (!paramContext.isUserRunning(Process.myUserHandle()))
        bool = true;
      else
        bool = false;
    }
  }

  public final T get()
  {
    Object localObject1;
    if (this.zzmz != null)
      localObject1 = this.zzmz;
    while (true)
    {
      return localObject1;
      Object localObject6 = StrictMode.allowThreadDiskReads();
      while (true)
      {
        synchronized (sLock)
        {
          if ((zzmw != null) && (zzd(zzmw)))
          {
            i = 1;
            HashSet localHashSet = zzmy;
            localObject1 = zzmw;
            if (i == 0)
              break label195;
            if (Log.isLoggable("GservicesValue", 3))
            {
              localObject6 = String.valueOf(this.mKey);
              if (((String)localObject6).length() == 0)
                break label150;
              "Gservice value accessed during directboot: ".concat((String)localObject6);
            }
            if ((localHashSet == null) || (localHashSet.contains(this.mKey)))
              break label178;
            localObject1 = String.valueOf(this.mKey);
            if (((String)localObject1).length() == 0)
              break label164;
            "Gservices key not whitelisted for directboot access: ".concat((String)localObject1);
            localObject1 = this.mDefaultValue;
            break;
          }
          int i = 0;
        }
        label150: new String("Gservice value accessed during directboot: ");
        continue;
        label164: new String("Gservices key not whitelisted for directboot access: ");
      }
      label178: ??? = retrieveFromDirectBootCache(localContext, this.mKey, this.mDefaultValue);
      continue;
      synchronized (sLock)
      {
        label195: zzmy = null;
        zzmw = null;
      }
      try
      {
        ??? = retrieve(this.mKey);
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject6);
        continue;
        localThreadPolicy = finally;
        throw localThreadPolicy;
      }
      catch (SecurityException localSecurityException)
      {
        l = Binder.clearCallingIdentity();
      }
      finally
      {
        try
        {
          Object localObject3 = retrieve(this.mKey);
          Binder.restoreCallingIdentity(l);
          StrictMode.setThreadPolicy(localThreadPolicy);
        }
        finally
        {
          long l;
          Binder.restoreCallingIdentity(l);
        }
        StrictMode.setThreadPolicy(localThreadPolicy);
      }
    }
  }

  @Deprecated
  public final T getBinderSafe()
  {
    return get();
  }

  public String getKey()
  {
    return this.mKey;
  }

  @VisibleForTesting
  public void override(T arg1)
  {
    this.zzmz = ???;
    synchronized (sLock)
    {
      if (zzcg())
        GservicesValue.zzb.zzci().add(this);
      return;
    }
  }

  @VisibleForTesting
  public void resetOverride()
  {
    this.zzmz = null;
  }

  protected abstract T retrieve(String paramString);

  @TargetApi(24)
  protected T retrieveFromDirectBootCache(Context paramContext, String paramString, T paramT)
  {
    throw new UnsupportedOperationException("The Gservices classes used does not support direct-boot");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.config.GservicesValue
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.f.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public class GcmNetworkManager
{
  public static final int RESULT_FAILURE = 2;
  public static final int RESULT_RESCHEDULE = 1;
  public static final int RESULT_SUCCESS = 0;

  @GuardedBy("GcmNetworkManager.class")
  private static GcmNetworkManager zzg;
  private final Context zzh;

  @GuardedBy("this")
  private final Map<String, Map<String, Boolean>> zzi;

  private GcmNetworkManager(Context paramContext)
  {
    AppMethodBeat.i(69936);
    this.zzi = new a();
    this.zzh = paramContext;
    AppMethodBeat.o(69936);
  }

  public static GcmNetworkManager getInstance(Context paramContext)
  {
    AppMethodBeat.i(69935);
    try
    {
      if (zzg == null)
      {
        GcmNetworkManager localGcmNetworkManager = new com/google/android/gms/gcm/GcmNetworkManager;
        localGcmNetworkManager.<init>(paramContext.getApplicationContext());
        zzg = localGcmNetworkManager;
      }
      paramContext = zzg;
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(69935);
    }
    throw paramContext;
  }

  private final zzn zzd()
  {
    AppMethodBeat.i(69937);
    Object localObject;
    if (GoogleCloudMessaging.zzf(this.zzh) < 5000000)
    {
      localObject = new zzo();
      AppMethodBeat.o(69937);
    }
    while (true)
    {
      return localObject;
      localObject = new zzm(this.zzh);
      AppMethodBeat.o(69937);
    }
  }

  static void zzd(String paramString)
  {
    AppMethodBeat.i(69941);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = new IllegalArgumentException("Must provide a valid tag.");
      AppMethodBeat.o(69941);
      throw paramString;
    }
    if (100 < paramString.length())
    {
      paramString = new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
      AppMethodBeat.o(69941);
      throw paramString;
    }
    AppMethodBeat.o(69941);
  }

  private final boolean zze(String paramString)
  {
    AppMethodBeat.i(69942);
    Preconditions.checkNotNull(paramString, "GcmTaskService must not be null.");
    Object localObject1 = this.zzh.getPackageManager();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = Collections.emptyList();
      if (!CollectionUtils.isEmpty((Collection)localObject2))
        break label107;
      String.valueOf(paramString).concat(" is not available. This may cause the task to be lost.");
      AppMethodBeat.o(69942);
    }
    while (true)
    {
      return true;
      if (paramString != null);
      for (localObject2 = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setClassName(this.zzh, paramString); ; localObject2 = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(this.zzh.getPackageName()))
      {
        localObject2 = ((PackageManager)localObject1).queryIntentServices((Intent)localObject2, 0);
        break;
      }
      label107: localObject2 = ((List)localObject2).iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext())
          break;
        localObject1 = (ResolveInfo)((Iterator)localObject2).next();
      }
      while ((((ResolveInfo)localObject1).serviceInfo == null) || (!((ResolveInfo)localObject1).serviceInfo.enabled));
      AppMethodBeat.o(69942);
    }
    paramString = new IllegalArgumentException(String.valueOf(paramString).length() + 118 + "The GcmTaskService class you provided " + paramString + " does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
    AppMethodBeat.o(69942);
    throw paramString;
  }

  public void cancelAllTasks(Class<? extends GcmTaskService> paramClass)
  {
    AppMethodBeat.i(69940);
    paramClass = new ComponentName(this.zzh, paramClass);
    zze(paramClass.getClassName());
    zzd().zzd(paramClass);
    AppMethodBeat.o(69940);
  }

  public void cancelTask(String paramString, Class<? extends GcmTaskService> paramClass)
  {
    AppMethodBeat.i(69939);
    paramClass = new ComponentName(this.zzh, paramClass);
    zzd(paramString);
    zze(paramClass.getClassName());
    zzd().zzd(paramClass, paramString);
    AppMethodBeat.o(69939);
  }

  public void schedule(Task paramTask)
  {
    try
    {
      AppMethodBeat.i(69938);
      zze(paramTask.getServiceName());
      if (zzd().zzd(paramTask))
      {
        Map localMap = (Map)this.zzi.get(paramTask.getServiceName());
        if ((localMap != null) && (localMap.containsKey(paramTask.getTag())))
          localMap.put(paramTask.getTag(), Boolean.TRUE);
      }
      AppMethodBeat.o(69938);
      return;
    }
    finally
    {
    }
    throw paramTask;
  }

  final boolean zzd(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(69943);
      Map localMap = (Map)this.zzi.get(paramString2);
      Object localObject = localMap;
      if (localMap == null)
      {
        localObject = new android/support/v4/f/a;
        ((a)localObject).<init>();
        this.zzi.put(paramString2, localObject);
      }
      boolean bool;
      if (((Map)localObject).put(paramString1, Boolean.FALSE) == null)
      {
        bool = true;
        AppMethodBeat.o(69943);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(69943);
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  final void zze(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(69944);
      Map localMap = (Map)this.zzi.get(paramString2);
      if (localMap != null)
        if (localMap.remove(paramString1) == null)
          break label73;
      label73: for (int i = 1; ; i = 0)
      {
        if ((i != 0) && (localMap.isEmpty()))
          this.zzi.remove(paramString2);
        AppMethodBeat.o(69944);
        return;
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  final boolean zzf(String paramString)
  {
    try
    {
      AppMethodBeat.i(69946);
      boolean bool = this.zzi.containsKey(paramString);
      AppMethodBeat.o(69946);
      return bool;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  final boolean zzf(String paramString1, String paramString2)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(69945);
        paramString2 = (Map)this.zzi.get(paramString2);
        if (paramString2 != null)
        {
          paramString1 = (Boolean)paramString2.get(paramString1);
          if (paramString1 == null)
          {
            AppMethodBeat.o(69945);
            bool = false;
            return bool;
          }
          bool = paramString1.booleanValue();
          AppMethodBeat.o(69945);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(69945);
      boolean bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GcmNetworkManager
 * JD-Core Version:    0.6.2
 */
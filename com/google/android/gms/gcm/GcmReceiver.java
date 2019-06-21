package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.iid.zzk;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public class GcmReceiver extends WakefulBroadcastReceiver
{
  private static boolean zzq = false;
  private static zzk zzr;
  private static zzk zzs;

  private final zzk zzd(Context paramContext, String paramString)
  {
    try
    {
      AppMethodBeat.i(69953);
      zzk localzzk;
      if ("com.google.android.c2dm.intent.RECEIVE".equals(paramString))
      {
        if (zzs == null)
        {
          localzzk = new com/google/android/gms/iid/zzk;
          localzzk.<init>(paramContext, paramString);
          zzs = localzzk;
        }
        paramContext = zzs;
        AppMethodBeat.o(69953);
      }
      while (true)
      {
        return paramContext;
        if (zzr == null)
        {
          localzzk = new com/google/android/gms/iid/zzk;
          localzzk.<init>(paramContext, paramString);
          zzr = localzzk;
        }
        paramContext = zzr;
        AppMethodBeat.o(69953);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  private final void zzd(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(69954);
    if (isOrderedBroadcast())
      setResultCode(500);
    Object localObject1 = paramContext.getPackageManager().resolveService(paramIntent, 0);
    if ((localObject1 == null) || (((ResolveInfo)localObject1).serviceInfo == null));
    try
    {
      if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0)
      {
        paramContext = startWakefulService(paramContext, paramIntent);
        label55: if (paramContext != null)
          break label298;
        if (!isOrderedBroadcast())
          break label310;
        setResultCode(404);
        AppMethodBeat.o(69954);
      }
      while (true)
      {
        return;
        Object localObject2 = ((ResolveInfo)localObject1).serviceInfo;
        if ((!paramContext.getPackageName().equals(((ServiceInfo)localObject2).packageName)) || (((ServiceInfo)localObject2).name == null))
        {
          localObject1 = ((ServiceInfo)localObject2).packageName;
          localObject2 = ((ServiceInfo)localObject2).name;
          new StringBuilder(String.valueOf(localObject1).length() + 94 + String.valueOf(localObject2).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append((String)localObject1).append("/").append((String)localObject2);
          break;
        }
        localObject2 = ((ServiceInfo)localObject2).name;
        localObject1 = localObject2;
        if (((String)localObject2).startsWith("."))
        {
          localObject1 = String.valueOf(paramContext.getPackageName());
          localObject2 = String.valueOf(localObject2);
          if (((String)localObject2).length() != 0)
            localObject1 = ((String)localObject1).concat((String)localObject2);
        }
        else
        {
          label220: if (Log.isLoggable("GcmReceiver", 3))
          {
            localObject2 = String.valueOf(localObject1);
            if (((String)localObject2).length() == 0)
              break label276;
            "Restricting intent to a specific service: ".concat((String)localObject2);
          }
        }
        while (true)
        {
          paramIntent.setClassName(paramContext.getPackageName(), (String)localObject1);
          break;
          localObject1 = new String((String)localObject1);
          break label220;
          label276: new String("Restricting intent to a specific service: ");
        }
        paramContext = paramContext.startService(paramIntent);
        break label55;
        label298: if (isOrderedBroadcast())
          setResultCode(-1);
        label310: AppMethodBeat.o(69954);
      }
    }
    catch (SecurityException paramContext)
    {
      while (true)
      {
        if (isOrderedBroadcast())
          setResultCode(401);
        AppMethodBeat.o(69954);
      }
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(69952);
    Log.isLoggable("GcmReceiver", 3);
    paramIntent.setComponent(null);
    paramIntent.setPackage(paramContext.getPackageName());
    if (Build.VERSION.SDK_INT <= 18)
      paramIntent.removeCategory(paramContext.getPackageName());
    if ("google.com/iid".equals(paramIntent.getStringExtra("from")))
      paramIntent.setAction("com.google.android.gms.iid.InstanceID");
    String str = paramIntent.getStringExtra("gcm.rawData64");
    if (str != null)
    {
      paramIntent.putExtra("rawData", Base64.decode(str, 0));
      paramIntent.removeExtra("gcm.rawData64");
    }
    int j = i;
    if (PlatformVersion.isAtLeastO())
    {
      j = i;
      if (paramContext.getApplicationInfo().targetSdkVersion >= 26)
        j = 1;
    }
    if (j != 0)
    {
      if (isOrderedBroadcast())
        setResultCode(-1);
      zzd(paramContext, paramIntent.getAction()).zzd(paramIntent, goAsync());
      AppMethodBeat.o(69952);
    }
    while (true)
    {
      return;
      "com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction());
      zzd(paramContext, paramIntent);
      if ((isOrderedBroadcast()) && (getResultCode() == 0))
        setResultCode(-1);
      AppMethodBeat.o(69952);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GcmReceiver
 * JD-Core Version:    0.6.2
 */
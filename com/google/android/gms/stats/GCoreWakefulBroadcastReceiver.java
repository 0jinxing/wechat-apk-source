package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.stats.StatsUtils;
import com.google.android.gms.common.stats.WakeLockTracker;
import javax.annotation.Nonnull;

public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver
{
  private static String TAG = "GCoreWakefulBroadcastReceiver";

  @SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
  public static boolean completeWakefulIntent(Context paramContext, Intent paramIntent)
  {
    boolean bool = false;
    if (paramIntent == null)
      return bool;
    if (paramContext != null)
      WakeLockTracker.getInstance().registerReleaseEvent(paramContext, paramIntent);
    while (true)
    {
      bool = WakefulBroadcastReceiver.completeWakefulIntent(paramIntent);
      break;
      paramContext = String.valueOf(paramIntent.toUri(0));
      if (paramContext.length() != 0)
        "context shouldn't be null. intent: ".concat(paramContext);
      else
        new String("context shouldn't be null. intent: ");
    }
  }

  public static ComponentName startWakefulService(Context paramContext, Intent paramIntent)
  {
    String str = null;
    ComponentName localComponentName = zza(paramContext, paramIntent);
    if (localComponentName == null)
    {
      paramContext = str;
      return paramContext;
    }
    WakeLockTracker localWakeLockTracker = WakeLockTracker.getInstance();
    str = String.valueOf(localComponentName.flattenToShortString());
    if (str.length() != 0);
    for (str = "wake:".concat(str); ; str = new String("wake:"))
    {
      localWakeLockTracker.registerAcquireEvent(paramContext, paramIntent, str, TAG, null, 1, "com.google.android.gms");
      paramContext = localComponentName;
      break;
    }
  }

  public static ComponentName startWakefulService(Context paramContext, Intent paramIntent, @Nonnull String paramString)
  {
    return startWakefulService(paramContext, paramIntent, paramString, paramContext.getPackageName());
  }

  public static ComponentName startWakefulService(Context paramContext, Intent paramIntent, @Nonnull String paramString1, String paramString2)
  {
    Object localObject = null;
    ComponentName localComponentName = zza(paramContext, paramIntent);
    if (localComponentName == null);
    for (paramContext = localObject; ; paramContext = localComponentName)
    {
      return paramContext;
      WakeLockTracker.getInstance().registerAcquireEvent(paramContext, paramIntent, paramString1, TAG, null, 1, paramString2);
    }
  }

  @SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
  private static ComponentName zza(Context paramContext, Intent paramIntent)
  {
    paramIntent.putExtra("WAKE_LOCK_KEY", StatsUtils.getEventKey(paramContext, paramIntent));
    return WakefulBroadcastReceiver.startWakefulService(paramContext, paramIntent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.stats.GCoreWakefulBroadcastReceiver
 * JD-Core Version:    0.6.2
 */
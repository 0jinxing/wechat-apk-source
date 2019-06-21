package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.stable.zzg;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class DeviceStateUtils
{
  private static final IntentFilter filter;
  private static long zzzw;
  private static float zzzx;

  static
  {
    AppMethodBeat.i(90195);
    filter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    zzzx = (0.0F / 0.0F);
    AppMethodBeat.o(90195);
  }

  @TargetApi(20)
  public static int getDeviceState(Context paramContext)
  {
    int i = 1;
    AppMethodBeat.i(90188);
    if ((paramContext == null) || (paramContext.getApplicationContext() == null))
    {
      AppMethodBeat.o(90188);
      j = -1;
      return j;
    }
    Intent localIntent = paramContext.getApplicationContext().registerReceiver(null, filter);
    if (localIntent == null)
    {
      j = 0;
      label45: if ((j & 0x7) == 0)
        break label89;
    }
    label89: for (int j = 1; ; j = 0)
    {
      paramContext = (PowerManager)paramContext.getSystemService("power");
      if (paramContext != null)
        break label94;
      AppMethodBeat.o(90188);
      j = -1;
      break;
      j = localIntent.getIntExtra("plugged", 0);
      break label45;
    }
    label94: int k;
    if (isInteractive(paramContext))
    {
      k = 1;
      label104: if (j == 0)
        break label131;
    }
    label131: for (j = i; ; j = 0)
    {
      j = k << 1 | j;
      AppMethodBeat.o(90188);
      break;
      k = 0;
      break label104;
    }
  }

  public static float getPowerPercentage(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(90191);
      float f;
      if ((SystemClock.elapsedRealtime() - zzzw < 60000L) && (!Float.isNaN(zzzx)))
      {
        f = zzzx;
        AppMethodBeat.o(90191);
      }
      while (true)
      {
        return f;
        paramContext = paramContext.getApplicationContext().registerReceiver(null, filter);
        if (paramContext != null)
        {
          int i = paramContext.getIntExtra("level", -1);
          int j = paramContext.getIntExtra("scale", -1);
          zzzx = i / j;
        }
        zzzw = SystemClock.elapsedRealtime();
        f = zzzx;
        AppMethodBeat.o(90191);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public static boolean hasConsentedNlp(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(90194);
    if (zzg.getInt(paramContext.getContentResolver(), "network_location_opt_in", -1) == 1)
      AppMethodBeat.o(90194);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90194);
    }
  }

  public static boolean isCallActive(Context paramContext)
  {
    AppMethodBeat.i(90192);
    boolean bool;
    if (((AudioManager)paramContext.getSystemService("audio")).getMode() == 2)
    {
      bool = true;
      AppMethodBeat.o(90192);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90192);
    }
  }

  public static boolean isInteractive(Context paramContext)
  {
    AppMethodBeat.i(90189);
    boolean bool = isInteractive((PowerManager)paramContext.getSystemService("power"));
    AppMethodBeat.o(90189);
    return bool;
  }

  @TargetApi(20)
  public static boolean isInteractive(PowerManager paramPowerManager)
  {
    AppMethodBeat.i(90190);
    boolean bool;
    if (PlatformVersion.isAtLeastKitKatWatch())
    {
      bool = paramPowerManager.isInteractive();
      AppMethodBeat.o(90190);
    }
    while (true)
    {
      return bool;
      bool = paramPowerManager.isScreenOn();
      AppMethodBeat.o(90190);
    }
  }

  public static boolean isUserSetupComplete(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(90193);
    if ((Build.VERSION.SDK_INT < 23) || (Settings.Secure.getInt(paramContext.getContentResolver(), "user_setup_complete", -1) == 1))
      AppMethodBeat.o(90193);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90193);
    }
  }

  @VisibleForTesting
  public static void resetForTest()
  {
    try
    {
      zzzw = 0L;
      zzzx = (0.0F / 0.0F);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.DeviceStateUtils
 * JD-Core Version:    0.6.2
 */
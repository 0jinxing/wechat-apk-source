package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Objects;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class DeviceProperties
{
  public static final String FEATURE_AUTO = "android.hardware.type.automotive";
  public static final String FEATURE_CHROME_OS = "org.chromium.arc";
  public static final String FEATURE_EMBEDDED = "android.hardware.type.embedded";
  public static final String FEATURE_IOT = "android.hardware.type.iot";
  public static final String FEATURE_LATCHSKY = "cn.google.services";
  public static final String FEATURE_PIXEL = "com.google.android.feature.PIXEL_EXPERIENCE";
  public static final String FEATURE_SIDEWINDER = "cn.google";
  public static final String FEATURE_TV_1 = "com.google.android.tv";
  public static final String FEATURE_TV_2 = "android.hardware.type.television";
  public static final String FEATURE_TV_3 = "android.software.leanback";
  private static Boolean zzzl;
  private static Boolean zzzm;
  private static Boolean zzzn;
  private static Boolean zzzo;
  private static Boolean zzzp;
  private static Boolean zzzq;
  private static Boolean zzzr;
  private static Boolean zzzs;
  private static Boolean zzzt;
  private static Boolean zzzu;
  private static Boolean zzzv;

  public static boolean isAuto(Context paramContext)
  {
    AppMethodBeat.i(90174);
    if (zzzt == null)
      if ((!PlatformVersion.isAtLeastO()) || (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))
        break label52;
    label52: for (boolean bool = true; ; bool = false)
    {
      zzzt = Boolean.valueOf(bool);
      bool = zzzt.booleanValue();
      AppMethodBeat.o(90174);
      return bool;
    }
  }

  public static boolean isChromeOsDevice(Context paramContext)
  {
    AppMethodBeat.i(90178);
    if (zzzs == null)
      zzzs = Boolean.valueOf(paramContext.getPackageManager().hasSystemFeature("org.chromium.arc"));
    boolean bool = zzzs.booleanValue();
    AppMethodBeat.o(90178);
    return bool;
  }

  public static boolean isIoT(Context paramContext)
  {
    AppMethodBeat.i(90173);
    if (zzzr == null)
      if ((!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.iot")) && (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.embedded")))
        break label58;
    label58: for (boolean bool = true; ; bool = false)
    {
      zzzr = Boolean.valueOf(bool);
      bool = zzzr.booleanValue();
      AppMethodBeat.o(90173);
      return bool;
    }
  }

  public static boolean isLatchsky(Context paramContext)
  {
    AppMethodBeat.i(90172);
    if (zzzp == null)
      if ((!PlatformVersion.isAtLeastM()) || (!paramContext.getPackageManager().hasSystemFeature("cn.google.services")))
        break label52;
    label52: for (boolean bool = true; ; bool = false)
    {
      zzzp = Boolean.valueOf(bool);
      bool = zzzp.booleanValue();
      AppMethodBeat.o(90172);
      return bool;
    }
  }

  public static boolean isLowRamOrPreKitKat(Context paramContext)
  {
    AppMethodBeat.i(90177);
    boolean bool;
    if (Build.VERSION.SDK_INT < 19)
    {
      bool = true;
      AppMethodBeat.o(90177);
    }
    while (true)
    {
      return bool;
      if (zzzq == null)
      {
        paramContext = (ActivityManager)paramContext.getSystemService("activity");
        if (paramContext != null)
          zzzq = Boolean.valueOf(paramContext.isLowRamDevice());
      }
      bool = Objects.equal(zzzq, Boolean.TRUE);
      AppMethodBeat.o(90177);
    }
  }

  public static boolean isPixelDevice(Context paramContext)
  {
    AppMethodBeat.i(90179);
    if (zzzv == null)
      zzzv = Boolean.valueOf(paramContext.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_EXPERIENCE"));
    boolean bool = zzzv.booleanValue();
    AppMethodBeat.o(90179);
    return bool;
  }

  @TargetApi(21)
  public static boolean isSidewinder(Context paramContext)
  {
    AppMethodBeat.i(90171);
    if (zzzo == null)
      if ((!PlatformVersion.isAtLeastLollipop()) || (!paramContext.getPackageManager().hasSystemFeature("cn.google")))
        break label52;
    label52: for (boolean bool = true; ; bool = false)
    {
      zzzo = Boolean.valueOf(bool);
      bool = zzzo.booleanValue();
      AppMethodBeat.o(90171);
      return bool;
    }
  }

  public static boolean isTablet(Resources paramResources)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(90168);
    if (paramResources == null)
    {
      AppMethodBeat.o(90168);
      return bool2;
    }
    int i;
    if (zzzl == null)
    {
      if ((paramResources.getConfiguration().screenLayout & 0xF) <= 3)
        break label122;
      i = 1;
      label42: if (i == 0)
        if (zzzm == null)
        {
          paramResources = paramResources.getConfiguration();
          if (((paramResources.screenLayout & 0xF) > 3) || (paramResources.smallestScreenWidthDp < 600))
            break label127;
        }
    }
    label122: label127: for (bool2 = true; ; bool2 = false)
    {
      zzzm = Boolean.valueOf(bool2);
      bool2 = bool1;
      if (zzzm.booleanValue())
        bool2 = true;
      zzzl = Boolean.valueOf(bool2);
      bool2 = zzzl.booleanValue();
      AppMethodBeat.o(90168);
      break;
      i = 0;
      break label42;
    }
  }

  public static boolean isTv(Context paramContext)
  {
    AppMethodBeat.i(90175);
    if (zzzu == null)
    {
      paramContext = paramContext.getPackageManager();
      if ((!paramContext.hasSystemFeature("com.google.android.tv")) && (!paramContext.hasSystemFeature("android.hardware.type.television")) && (!paramContext.hasSystemFeature("android.software.leanback")))
        break label66;
    }
    label66: for (boolean bool = true; ; bool = false)
    {
      zzzu = Boolean.valueOf(bool);
      bool = zzzu.booleanValue();
      AppMethodBeat.o(90175);
      return bool;
    }
  }

  public static boolean isUserBuild()
  {
    AppMethodBeat.i(90176);
    boolean bool;
    if (GooglePlayServicesUtilLight.sIsTestMode)
    {
      bool = GooglePlayServicesUtilLight.sTestIsUserBuild;
      AppMethodBeat.o(90176);
    }
    while (true)
    {
      return bool;
      bool = "user".equals(Build.TYPE);
      AppMethodBeat.o(90176);
    }
  }

  @TargetApi(20)
  public static boolean isWearable(Context paramContext)
  {
    AppMethodBeat.i(90169);
    if (zzzn == null)
      if ((!PlatformVersion.isAtLeastKitKatWatch()) || (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch")))
        break label52;
    label52: for (boolean bool = true; ; bool = false)
    {
      zzzn = Boolean.valueOf(bool);
      bool = zzzn.booleanValue();
      AppMethodBeat.o(90169);
      return bool;
    }
  }

  @TargetApi(24)
  public static boolean isWearableWithoutPlayStore(Context paramContext)
  {
    AppMethodBeat.i(90170);
    boolean bool;
    if (((!PlatformVersion.isAtLeastN()) || (isSidewinder(paramContext))) && (isWearable(paramContext)))
    {
      bool = true;
      AppMethodBeat.o(90170);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90170);
    }
  }

  @VisibleForTesting
  public static void resetForTest()
  {
    zzzm = null;
    zzzl = null;
    zzzn = null;
    zzzo = null;
    zzzp = null;
    zzzq = null;
    zzzr = null;
    zzzs = null;
    zzzt = null;
    zzzu = null;
    zzzv = null;
  }

  @VisibleForTesting
  public static void setIsAutoForTest(boolean paramBoolean)
  {
    AppMethodBeat.i(90184);
    zzzt = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(90184);
  }

  @VisibleForTesting
  public static void setIsIoTForTest(boolean paramBoolean)
  {
    AppMethodBeat.i(90183);
    zzzr = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(90183);
  }

  @VisibleForTesting
  public static void setIsLatchskyForTest(boolean paramBoolean)
  {
    AppMethodBeat.i(90182);
    zzzp = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(90182);
  }

  @VisibleForTesting
  public static void setIsLowRamForTest(boolean paramBoolean)
  {
    AppMethodBeat.i(90186);
    zzzq = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(90186);
  }

  @VisibleForTesting
  public static void setIsPixelForTest(boolean paramBoolean)
  {
    AppMethodBeat.i(90187);
    zzzv = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(90187);
  }

  @VisibleForTesting
  public static void setIsSideWinderForTest(boolean paramBoolean)
  {
    AppMethodBeat.i(90181);
    zzzo = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(90181);
  }

  @VisibleForTesting
  public static void setIsTvForTest(boolean paramBoolean)
  {
    AppMethodBeat.i(90185);
    zzzu = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(90185);
  }

  @VisibleForTesting
  public static void setIsWearableForTest(boolean paramBoolean)
  {
    AppMethodBeat.i(90180);
    zzzn = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(90180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.DeviceProperties
 * JD-Core Version:    0.6.2
 */
package com.tencent.map.lib.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SystemUtil
{
  public static final int SMALL_SCREEN_THRESHOLD = 400;

  public static float getDensity(Context paramContext)
  {
    AppMethodBeat.i(98228);
    float f;
    if (paramContext == null)
    {
      f = 1.0F;
      AppMethodBeat.o(98228);
    }
    while (true)
    {
      return f;
      f = paramContext.getResources().getDisplayMetrics().density;
      AppMethodBeat.o(98228);
    }
  }

  public static int getOpenglesVersion(Context paramContext)
  {
    AppMethodBeat.i(98231);
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getDeviceConfigurationInfo();
    int i;
    if (paramContext != null)
    {
      i = paramContext.reqGlEsVersion;
      AppMethodBeat.o(98231);
    }
    while (true)
    {
      return i;
      i = 65537;
      AppMethodBeat.o(98231);
    }
  }

  public static int getWindowHeight(Context paramContext)
  {
    AppMethodBeat.i(98230);
    int i = paramContext.getResources().getDisplayMetrics().heightPixels;
    AppMethodBeat.o(98230);
    return i;
  }

  public static int getWindowWidth(Context paramContext)
  {
    AppMethodBeat.i(98229);
    int i = paramContext.getResources().getDisplayMetrics().widthPixels;
    AppMethodBeat.o(98229);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.util.SystemUtil
 * JD-Core Version:    0.6.2
 */
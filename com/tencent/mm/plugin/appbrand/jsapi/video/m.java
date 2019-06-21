package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public final class m
{
  private static float cL(Context paramContext)
  {
    AppMethodBeat.i(126590);
    paramContext = paramContext.getContentResolver();
    float f = 0.0F;
    try
    {
      int i = Settings.System.getInt(paramContext, "screen_brightness");
      f = i / 255.0F;
      AppMethodBeat.o(126590);
      return f;
    }
    catch (Settings.SettingNotFoundException paramContext)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.VideoPlayerUtils", paramContext, "", new Object[0]);
    }
  }

  public static float cN(Context paramContext)
  {
    AppMethodBeat.i(126591);
    WindowManager.LayoutParams localLayoutParams = ((Activity)paramContext).getWindow().getAttributes();
    float f;
    if (localLayoutParams.screenBrightness < 0.0F)
    {
      f = cL(paramContext);
      AppMethodBeat.o(126591);
    }
    while (true)
    {
      return f;
      f = localLayoutParams.screenBrightness;
      AppMethodBeat.o(126591);
    }
  }

  public static String fQ(long paramLong)
  {
    AppMethodBeat.i(126592);
    if (paramLong < 3600000L);
    for (Object localObject = "mm:ss"; ; localObject = "HH:mm:ss")
    {
      localObject = new SimpleDateFormat((String)localObject);
      ((SimpleDateFormat)localObject).setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
      localObject = ((SimpleDateFormat)localObject).format(Long.valueOf(paramLong));
      AppMethodBeat.o(126592);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.m
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.websearch.ui;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public final class a
{
  private static float cL(Context paramContext)
  {
    AppMethodBeat.i(73812);
    paramContext = paramContext.getContentResolver();
    float f = 0.0F;
    try
    {
      int i = Settings.System.getInt(paramContext, "screen_brightness");
      f = i / 255.0F;
      label25: AppMethodBeat.o(73812);
      return f;
    }
    catch (Exception paramContext)
    {
      break label25;
    }
  }

  public static float cN(Context paramContext)
  {
    AppMethodBeat.i(73811);
    WindowManager.LayoutParams localLayoutParams = ((Activity)paramContext).getWindow().getAttributes();
    float f;
    if (localLayoutParams.screenBrightness < 0.0F)
    {
      f = cL(paramContext);
      AppMethodBeat.o(73811);
    }
    while (true)
    {
      return f;
      f = localLayoutParams.screenBrightness;
      AppMethodBeat.o(73811);
    }
  }

  public static String fQ(long paramLong)
  {
    AppMethodBeat.i(73813);
    if (paramLong < 3600000L);
    for (Object localObject = "mm:ss"; ; localObject = "HH:mm:ss")
    {
      localObject = new SimpleDateFormat((String)localObject);
      ((SimpleDateFormat)localObject).setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
      localObject = ((SimpleDateFormat)localObject).format(Long.valueOf(paramLong));
      AppMethodBeat.o(73813);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.ui.a
 * JD-Core Version:    0.6.2
 */
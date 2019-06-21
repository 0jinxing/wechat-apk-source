package com.tencent.xweb.x5;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.xweb.WebView.c;
import org.xwalk.core.Log;

final class X5WebFactory$b
{
  private static boolean AQJ = false;
  private static boolean lCa = false;

  public static void a(Context paramContext, WebView.c paramc)
  {
    AppMethodBeat.i(84868);
    if (lCa)
      AppMethodBeat.o(84868);
    while (true)
    {
      return;
      Log.i("X5WebFactory.preIniter", "preInit");
      lCa = true;
      QbSdk.preInit(paramContext, new X5WebFactory.b.1(paramc));
      AppMethodBeat.o(84868);
    }
  }

  public static boolean hasInited()
  {
    return lCa;
  }

  public static boolean isCoreReady()
  {
    return AQJ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.X5WebFactory.b
 * JD-Core Version:    0.6.2
 */
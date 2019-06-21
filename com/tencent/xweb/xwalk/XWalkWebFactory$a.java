package com.tencent.xweb.xwalk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtension;
import org.xwalk.core.WebViewExtensionListener;

final class XWalkWebFactory$a
{
  private static boolean APR = false;
  private static boolean AQJ = false;
  private static boolean lCa = false;

  public static boolean hasInited()
  {
    return lCa;
  }

  public static boolean hasInitedCallback()
  {
    return APR;
  }

  public static void initCallback(WebViewExtensionListener paramWebViewExtensionListener)
  {
    AppMethodBeat.i(85398);
    if (APR)
      AppMethodBeat.o(85398);
    while (true)
    {
      return;
      Log.i("XWebViewHelper", "initCallback");
      WebViewExtension.SetExtension(paramWebViewExtensionListener);
      APR = true;
      AppMethodBeat.o(85398);
    }
  }

  public static boolean isCoreReady()
  {
    return AQJ;
  }

  public static boolean jE(Context paramContext)
  {
    AppMethodBeat.i(85397);
    boolean bool;
    if (lCa)
    {
      bool = lCa;
      AppMethodBeat.o(85397);
      return bool;
    }
    Log.i("XWebViewHelper", "preInit");
    if (j.fE(paramContext))
    {
      Log.i("XWebViewHelper", "preInit finished");
      lCa = true;
      AQJ = true;
    }
    while (true)
    {
      bool = lCa;
      AppMethodBeat.o(85397);
      break;
      Log.i("XWebViewHelper", "preInit xwalk is not available");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.XWalkWebFactory.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.webview.luggage.c;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class c
{
  public static JSONObject AI(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(6505);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(6505);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        AppMethodBeat.o(6505);
        paramString = localJSONObject;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.LuggageWebViewUtil", paramString.getMessage());
        AppMethodBeat.o(6505);
        paramString = localObject;
      }
    }
  }

  public static WebViewJSSDKFileItem aeo(String paramString)
  {
    AppMethodBeat.i(6506);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.LuggageWebViewUtil", "get by local id error, local id is null or nil");
      paramString = null;
      AppMethodBeat.o(6506);
    }
    while (true)
    {
      return paramString;
      if (ah.bqo())
      {
        paramString = g.cYF().aex(paramString);
        AppMethodBeat.o(6506);
      }
      else
      {
        paramString = (WebViewJSSDKFileItem)f.a("com.tencent.mm", new IPCString(paramString), c.a.class);
        AppMethodBeat.o(6506);
      }
    }
  }

  public static void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(6504);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      al.d(paramRunnable);
      AppMethodBeat.o(6504);
    }
    while (true)
    {
      return;
      paramRunnable.run();
      AppMethodBeat.o(6504);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.c.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class bo
{
  public static String QB()
  {
    AppMethodBeat.i(91042);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      localObject = ((JSONObject)localObject).put("nativeTime", System.currentTimeMillis()).toString();
      AppMethodBeat.o(91042);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsScriptEvaluator", "makeExtStatJson e = %s", new Object[] { localException });
        String str = "{}";
        AppMethodBeat.o(91042);
      }
    }
  }

  public static void a(i parami, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(91041);
    String str = paramString2;
    if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString2))
      str = "{}";
    if (paramInt == 0);
    for (paramString2 = "undefined"; ; paramString2 = String.valueOf(paramInt))
    {
      parami.evaluateJavascript(String.format("typeof WeixinJSCoreAndroid !== 'undefined' && WeixinJSCoreAndroid.subscribeHandler(\"%s\", %s, %s, %s)", new Object[] { paramString1, str, paramString2, QB() }), new bo.1());
      AppMethodBeat.o(91041);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bo
 * JD-Core Version:    0.6.2
 */
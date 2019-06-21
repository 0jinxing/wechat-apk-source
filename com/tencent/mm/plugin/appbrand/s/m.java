package com.tencent.mm.plugin.appbrand.s;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class m
{
  public static void a(i parami, String paramString1, String paramString2)
  {
    AppMethodBeat.i(133581);
    String str = paramString2;
    if (bo.isNullOrNil(paramString2))
      str = "{}";
    ab.d("MicroMsg.JsScriptEvaluatorWC", "hy: dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramString1, Integer.valueOf(str.length()), Integer.valueOf(0) });
    parami.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler('%s', %s)", new Object[] { paramString1, str }), new ValueCallback()
    {
    });
    AppMethodBeat.o(133581);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.m
 * JD-Core Version:    0.6.2
 */
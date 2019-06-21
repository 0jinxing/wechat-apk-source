package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.l.c;

final class JsApiGetAppConfigTask$1
  implements l.c
{
  JsApiGetAppConfigTask$1(JsApiGetAppConfigTask paramJsApiGetAppConfigTask)
  {
  }

  public final void xC(String paramString)
  {
    AppMethodBeat.i(130425);
    this.hwS.value = paramString;
    JsApiGetAppConfigTask.a(this.hwS);
    AppMethodBeat.o(130425);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.n;

final class JsApiChooseMultiMedia$2 extends g.c
{
  JsApiChooseMultiMedia$2(JsApiChooseMultiMedia paramJsApiChooseMultiMedia, c paramc)
  {
  }

  public final void onResume()
  {
    AppMethodBeat.i(131218);
    n.xb(this.hIt.getAppId()).gPk = false;
    g.b(this.hIt.getAppId(), this);
    AppMethodBeat.o(131218);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.2
 * JD-Core Version:    0.6.2
 */
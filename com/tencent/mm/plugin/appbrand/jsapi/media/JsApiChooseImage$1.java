package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.n;

final class JsApiChooseImage$1 extends g.c
{
  JsApiChooseImage$1(JsApiChooseImage paramJsApiChooseImage, c paramc)
  {
  }

  public final void onResume()
  {
    AppMethodBeat.i(131123);
    n.xb(this.hxc.getAppId()).gPi = false;
    g.b(this.hxc.getAppId(), this);
    AppMethodBeat.o(131123);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage.1
 * JD-Core Version:    0.6.2
 */
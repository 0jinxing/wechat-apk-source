package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiChooseMedia$1 extends g.c
{
  JsApiChooseMedia$1(JsApiChooseMedia paramJsApiChooseMedia, c paramc)
  {
  }

  public final void onResume()
  {
    AppMethodBeat.i(131154);
    ab.i("MicroMsg.JsApiChooseMedia", "chooseMedia, onResume, remove listener");
    JsApiChooseMedia.Pu();
    g.b(this.hxc.getAppId(), this);
    AppMethodBeat.o(131154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.1
 * JD-Core Version:    0.6.2
 */
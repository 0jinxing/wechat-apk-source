package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.c;

final class JsApiChooseVideo$1 extends g.c
{
  JsApiChooseVideo$1(JsApiChooseVideo paramJsApiChooseVideo, c paramc)
  {
  }

  public final void onResume()
  {
    AppMethodBeat.i(131269);
    JsApiChooseVideo.Pu();
    g.b(this.hxc.getAppId(), this);
    AppMethodBeat.o(131269);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo.1
 * JD-Core Version:    0.6.2
 */
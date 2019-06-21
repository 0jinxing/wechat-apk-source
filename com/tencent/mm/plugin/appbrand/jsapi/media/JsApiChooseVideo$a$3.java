package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class JsApiChooseVideo$a$3
  implements Runnable
{
  JsApiChooseVideo$a$3(JsApiChooseVideo.a parama, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131284);
    JsApiChooseVideo.a.a(this.hPV).bFZ = -1;
    JsApiChooseVideo.a.a(this.hPV).hPS = JsApiChooseVideo.a.a(this.hPV, this.hPW, JsApiChooseVideo.a.c(this.hPV).hPR);
    JsApiChooseVideo.a.d(this.hPV, JsApiChooseVideo.a.a(this.hPV));
    AppMethodBeat.o(131284);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo.a.3
 * JD-Core Version:    0.6.2
 */
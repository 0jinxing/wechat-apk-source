package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;

final class JsApiStartRecordVoice$1
  implements f.b
{
  JsApiStartRecordVoice$1(JsApiStartRecordVoice paramJsApiStartRecordVoice, q paramq)
  {
  }

  public final void wW()
  {
    AppMethodBeat.i(130784);
    JsApiStopRecordVoice.g(this.hsD);
    JsApiStartRecordVoice.a(this.hBk).b(this);
    AppMethodBeat.o(130784);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice.1
 * JD-Core Version:    0.6.2
 */
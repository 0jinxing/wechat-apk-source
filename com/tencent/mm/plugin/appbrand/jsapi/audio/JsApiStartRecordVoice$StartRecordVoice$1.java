package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.media.record.a;

final class JsApiStartRecordVoice$StartRecordVoice$1
  implements Runnable
{
  JsApiStartRecordVoice$StartRecordVoice$1(JsApiStartRecordVoice.StartRecordVoice paramStartRecordVoice)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130789);
    JsApiStartRecordVoice.StartRecordVoice.a(this.hBn, a.a(JsApiStartRecordVoice.StartRecordVoice.a(this.hBn), new JsApiStartRecordVoice.StartRecordVoice.1.1(this), JsApiStartRecordVoice.StartRecordVoice.c(this.hBn) * 1000));
    if (!JsApiStartRecordVoice.StartRecordVoice.d(this.hBn))
      JsApiStartRecordVoice.StartRecordVoice.e(this.hBn);
    AppMethodBeat.o(130789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice.StartRecordVoice.1
 * JD-Core Version:    0.6.2
 */
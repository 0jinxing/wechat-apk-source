package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.compat.a.b;

final class JsApiStopPlayVoice$StopPlayVoice$1
  implements Runnable
{
  JsApiStopPlayVoice$StopPlayVoice$1(JsApiStopPlayVoice.StopPlayVoice paramStopPlayVoice)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130804);
    ((b)g.K(b.class)).stop();
    AppMethodBeat.o(130804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice.StopPlayVoice.1
 * JD-Core Version:    0.6.2
 */
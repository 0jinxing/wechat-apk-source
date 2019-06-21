package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.bo;

public final class JsApiStopPlayVoice extends a<q>
{
  public static final int CTRL_INDEX = 35;
  public static final String NAME = "stopVoice";

  public static void aCx()
  {
    AppMethodBeat.i(130808);
    if (bo.isNullOrNil(JsApiStartPlayVoice.hBd))
      AppMethodBeat.o(130808);
    while (true)
    {
      return;
      AppBrandMainProcessService.a(new JsApiStopPlayVoice.StopPlayVoice((byte)0));
      JsApiStartPlayVoice.hBd = null;
      AppMethodBeat.o(130808);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice
 * JD-Core Version:    0.6.2
 */
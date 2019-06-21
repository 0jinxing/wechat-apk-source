package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.bo;

public final class JsApiStopRecordVoice extends a<q>
{
  public static final int CTRL_INDEX = 32;
  public static final String NAME = "stopRecord";

  static void g(q paramq)
  {
    AppMethodBeat.i(130814);
    if (bo.isNullOrNil(JsApiStartRecordVoice.hBi))
      AppMethodBeat.o(130814);
    while (true)
    {
      return;
      paramq = n.xa(paramq.getAppId()).gPf;
      if (paramq != null)
        paramq.dismiss();
      AppBrandMainProcessService.a(new JsApiStopRecordVoice.StopRecordVoice((byte)0));
      JsApiStartRecordVoice.hBi = null;
      AppMethodBeat.o(130814);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice
 * JD-Core Version:    0.6.2
 */
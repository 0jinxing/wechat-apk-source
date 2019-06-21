package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

final class JsApiAddNativeDownloadTask$4
  implements Runnable
{
  JsApiAddNativeDownloadTask$4(JsApiAddNativeDownloadTask paramJsApiAddNativeDownloadTask, JsApiAddNativeDownloadTask.AddNativeDownloadTaskTask paramAddNativeDownloadTaskTask, q paramq, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130378);
    this.hwu.aBW();
    HashMap localHashMap = new HashMap();
    switch (this.hwu.bJt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(130378);
      while (true)
      {
        return;
        this.hsD.M(this.eIl, this.hwt.j("fail:cancel", null));
        AppMethodBeat.o(130378);
        continue;
        this.hsD.M(this.eIl, this.hwt.j("fail:download fail", null));
        AppMethodBeat.o(130378);
      }
      localHashMap.put("download_id", Long.valueOf(this.hwu.crZ));
      this.hsD.M(this.eIl, this.hwt.j("ok", localHashMap));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask.4
 * JD-Core Version:    0.6.2
 */
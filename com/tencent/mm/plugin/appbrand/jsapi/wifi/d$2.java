package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;

final class d$2 extends g.c
{
  d$2(d paramd, Context paramContext, c paramc)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(94375);
    if (d.idf != null)
      ab.i("MicroMsg.JsApiStartWifi", "unregisterReceiver");
    try
    {
      this.idh.unregisterReceiver(d.idf);
      d.ide = false;
      d.idf = null;
      g.b(this.hxc.getAppId(), this);
      AppMethodBeat.o(94375);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.JsApiStartWifi", localException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.d.2
 * JD-Core Version:    0.6.2
 */
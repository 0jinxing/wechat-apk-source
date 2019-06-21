package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3 extends g.c
{
  a$3(a parama, c paramc)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(94370);
    ab.d("MicroMsg.JsApiConenctWifi", "remove listener");
    d.a(null);
    g.b(this.hxc.getAppId(), this);
    AppMethodBeat.o(94370);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.a.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2 extends g.c
{
  c$2(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(94363);
    ab.i("MicroMsg.JsApiStartBeaconDiscovery", "onDestroy");
    g.b(this.hyd.getAppId(), this);
    a.a locala = a.AZ(this.hyd.getAppId());
    if (locala != null)
    {
      locala.EH();
      a.remove(this.hyd.getAppId());
    }
    this.hKj.hKg = null;
    AppMethodBeat.o(94363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.c.c.2
 * JD-Core Version:    0.6.2
 */
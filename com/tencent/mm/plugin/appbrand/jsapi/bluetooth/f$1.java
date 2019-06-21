package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.b;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class f$1
  implements b
{
  f$1(f paramf, String paramString, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(94184);
    ab.i("MicroMsg.JsApiCreateBLEConnection", "appId:%s createBLEConnection result:%s", new Object[] { this.val$appId, paramj });
    switch (paramj.errCode)
    {
    default:
      HashMap localHashMap = new HashMap();
      localHashMap.put("errCode", Integer.valueOf(paramj.errCode));
      this.hxc.M(this.eIl, this.hDx.j(paramj.aIm, localHashMap));
      c.kT(27);
      AppMethodBeat.o(94184);
    case 0:
    }
    while (true)
    {
      return;
      paramj = new HashMap();
      paramj.put("errCode", Integer.valueOf(0));
      this.hxc.M(this.eIl, this.hDx.j("ok", paramj));
      c.kT(26);
      AppMethodBeat.o(94184);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f.1
 * JD-Core Version:    0.6.2
 */
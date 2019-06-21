package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.b;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import java.util.HashMap;
import java.util.Map;

final class q$1
  implements b
{
  q$1(q paramq, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(94214);
    switch (paramj.errCode)
    {
    default:
      HashMap localHashMap = new HashMap();
      localHashMap.put("errCode", Integer.valueOf(paramj.errCode));
      this.hxc.M(this.eIl, this.hDJ.j(paramj.aIm, localHashMap));
      c.kT(58);
      AppMethodBeat.o(94214);
    case 0:
    }
    while (true)
    {
      return;
      paramj = new HashMap();
      paramj.put("errCode", Integer.valueOf(0));
      this.hxc.M(this.eIl, this.hDJ.j("ok", paramj));
      c.kT(58);
      AppMethodBeat.o(94214);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.q.1
 * JD-Core Version:    0.6.2
 */
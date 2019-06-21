package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.b;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import java.util.HashMap;
import java.util.Map;

final class n$1
  implements b
{
  n$1(n paramn, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(94204);
    switch (paramj.errCode)
    {
    default:
      HashMap localHashMap = new HashMap();
      localHashMap.put("errCode", Integer.valueOf(paramj.errCode));
      this.hxc.M(this.eIl, this.hDG.j(paramj.aIm, localHashMap));
      c.kT(43);
      AppMethodBeat.o(94204);
    case 0:
    }
    while (true)
    {
      return;
      paramj = new HashMap();
      paramj.put("errCode", Integer.valueOf(0));
      this.hxc.M(this.eIl, this.hDG.j("ok", paramj));
      c.kT(42);
      AppMethodBeat.o(94204);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.n.1
 * JD-Core Version:    0.6.2
 */
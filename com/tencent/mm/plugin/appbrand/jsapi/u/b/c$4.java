package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;

final class c$4
  implements f.b
{
  c$4(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1)
  {
  }

  public final void wW()
  {
    AppMethodBeat.i(117390);
    g.d locald = g.wV(this.hyd.getAppId());
    if (locald == g.d.gNs)
    {
      this.iet.oK(2);
      AppMethodBeat.o(117390);
    }
    while (true)
    {
      return;
      if (locald == g.d.gNo)
      {
        this.iet.oK(1);
        AppMethodBeat.o(117390);
      }
      else
      {
        this.iet.oK(3);
        AppMethodBeat.o(117390);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.c.4
 * JD-Core Version:    0.6.2
 */
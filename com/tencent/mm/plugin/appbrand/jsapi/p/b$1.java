package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.c;

final class b$1 extends b.b
{
  b$1(b paramb, c paramc1, c paramc2, l paraml)
  {
    super(paramc1);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(126369);
    g.b(this.hxc.getAppId(), this);
    this.hVs.a(this);
    AppMethodBeat.o(126369);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.b.1
 * JD-Core Version:    0.6.2
 */
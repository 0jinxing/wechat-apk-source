package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;

final class c$1 extends c.b
{
  c$1(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, com.tencent.mm.plugin.appbrand.jsapi.c paramc2, l paraml)
  {
    super(paramc1);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(126372);
    g.b(this.hxc.getAppId(), this);
    this.hVs.a(this);
    AppMethodBeat.o(126372);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.c.1
 * JD-Core Version:    0.6.2
 */
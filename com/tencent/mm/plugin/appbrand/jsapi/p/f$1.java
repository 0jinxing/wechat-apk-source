package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.c;

final class f$1 extends f.b
{
  f$1(f paramf, c paramc1, c paramc2, l paraml)
  {
    super(paramc1);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(126382);
    g.b(this.hxc.getAppId(), this);
    this.hVs.a(this);
    AppMethodBeat.o(126382);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.f.1
 * JD-Core Version:    0.6.2
 */
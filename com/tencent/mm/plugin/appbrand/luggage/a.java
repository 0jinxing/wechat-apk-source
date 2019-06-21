package com.tencent.mm.plugin.appbrand.luggage;

import com.tencent.luggage.bridge.a.a.a;
import com.tencent.luggage.bridge.a.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.e;
import com.tencent.mm.plugin.appbrand.jsapi.e.m;
import com.tencent.mm.plugin.appbrand.l.o;

public final class a extends com.tencent.luggage.bridge.impl.a
{
  private static e hmp;

  static
  {
    AppMethodBeat.i(132090);
    hmp = new com.tencent.mm.plugin.appbrand.luggage.a.c();
    AppMethodBeat.o(132090);
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(132089);
    super.a(parama);
    AppMethodBeat.o(132089);
  }

  public final void a(a.c paramc)
  {
    AppMethodBeat.i(132088);
    super.a(paramc);
    paramc.a(e.class, hmp);
    paramc.a(o.class, new com.tencent.mm.plugin.appbrand.luggage.c.c());
    paramc.a(com.tencent.mm.plugin.appbrand.s.b.a.class, new m());
    AppMethodBeat.o(132088);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.a
 * JD-Core Version:    0.6.2
 */
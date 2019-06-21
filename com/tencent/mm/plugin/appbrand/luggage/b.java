package com.tencent.mm.plugin.appbrand.luggage;

import com.tencent.luggage.bridge.a.a.a;
import com.tencent.luggage.bridge.a.a.c;
import com.tencent.luggage.bridge.impl.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.e;
import com.tencent.mm.plugin.appbrand.jsapi.base.f;
import com.tencent.mm.plugin.appbrand.luggage.b.p;

public final class b extends a
{
  private final f ikb;

  public b()
  {
    AppMethodBeat.i(11122);
    this.ikb = new p();
    AppMethodBeat.o(11122);
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(11124);
    super.a(parama);
    parama.a(f.class, this.ikb);
    AppMethodBeat.o(11124);
  }

  public final void a(a.c paramc)
  {
    AppMethodBeat.i(11123);
    super.a(paramc);
    paramc.a(f.class, this.ikb);
    paramc.a(e.class, com.tencent.mm.plugin.appbrand.dynamic.b.b.azO());
    AppMethodBeat.o(11123);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b
 * JD-Core Version:    0.6.2
 */
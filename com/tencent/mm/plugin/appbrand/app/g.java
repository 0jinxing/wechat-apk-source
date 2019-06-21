package com.tencent.mm.plugin.appbrand.app;

import com.tencent.luggage.bridge.a.a.a;
import com.tencent.luggage.bridge.a.a.b;
import com.tencent.luggage.bridge.a.a.c;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.o;
import com.tencent.mm.plugin.appbrand.jsapi.p.j;
import com.tencent.mm.plugin.appbrand.jsapi.w;
import com.tencent.mm.plugin.appbrand.luggage.b.h;
import com.tencent.mm.plugin.appbrand.luggage.b.l;
import com.tencent.mm.plugin.appbrand.r.q.a;
import com.tencent.mm.plugin.appbrand.ui.u;
import com.tencent.mm.plugin.appbrand.widget.input.panel.e.b;
import com.tencent.mm.sdk.platformtools.ah;

final class g extends com.tencent.luggage.sdk.a
{
  private a.b gRZ;

  public g()
  {
    AppMethodBeat.i(129311);
    this.gRZ = null;
    d.a(new g.a((byte)0));
    if ((ah.doF()) || (ah.doG()) || (PluginAppBrand.isAppBrandProcess()))
    {
      this.gRZ = new com.tencent.mm.plugin.appbrand.luggage.a();
      AppMethodBeat.o(129311);
    }
    while (true)
    {
      return;
      if (PluginAppBrand.isSupportProcess())
      {
        this.gRZ = new com.tencent.mm.plugin.appbrand.luggage.b();
        AppMethodBeat.o(129311);
      }
      else
      {
        this.gRZ = new g.1(this);
        AppMethodBeat.o(129311);
      }
    }
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(129313);
    super.a(parama);
    this.gRZ.a(parama);
    AppMethodBeat.o(129313);
  }

  public final void a(a.c paramc)
  {
    AppMethodBeat.i(129312);
    super.a(paramc);
    this.gRZ.a(paramc);
    paramc.a(u.class, new com.tencent.mm.plugin.appbrand.ui.i());
    paramc.a(com.tencent.luggage.c.a.a.class, new com.tencent.mm.plugin.appbrand.luggage.b.i());
    paramc.a(q.a.class, new h(ah.getContext()));
    paramc.a(com.tencent.mm.plugin.appbrand.jsapi.video.e.class, new com.tencent.mm.plugin.appbrand.jsapi.video.n());
    paramc.a(com.tencent.mm.plugin.appbrand.s.b.a.class, new com.tencent.luggage.f.a.a());
    paramc.a(com.tencent.mm.plugin.appbrand.n.a.class, new com.tencent.mm.plugin.appbrand.luggage.c.a());
    paramc.a(com.tencent.mm.plugin.appbrand.n.b.class, new com.tencent.mm.plugin.appbrand.luggage.c.b());
    paramc.a(com.tencent.mm.plugin.appbrand.widget.input.a.b.class, new com.tencent.mm.plugin.appbrand.luggage.b.e());
    paramc.a(e.b.class, new com.tencent.mm.plugin.appbrand.luggage.b.f());
    paramc.a(com.tencent.mm.plugin.appbrand.jsapi.p.a.class, new j());
    paramc.a(com.tencent.luggage.sdk.customize.b.class, new com.tencent.mm.plugin.appbrand.luggage.b.c());
    paramc.a(com.tencent.luggage.sdk.customize.a.class, com.tencent.mm.plugin.appbrand.launching.precondition.f.ijT);
    paramc.a(w.class, new com.tencent.mm.plugin.appbrand.luggage.b.b());
    paramc.a(com.tencent.mm.plugin.appbrand.jsapi.g.a.c.class, new com.tencent.mm.plugin.appbrand.luggage.b.n());
    paramc.a(o.class, com.tencent.mm.plugin.appbrand.luggage.b.a.ikd);
    paramc.a(com.tencent.mm.plugin.appbrand.widget.c.b.class, new l());
    AppMethodBeat.o(129312);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.g
 * JD-Core Version:    0.6.2
 */
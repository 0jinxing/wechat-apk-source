package com.tencent.luggage.sdk;

import com.tencent.luggage.bridge.a.a.a;
import com.tencent.luggage.bridge.a.a.c;
import com.tencent.luggage.sdk.customize.impl.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.c;
import com.tencent.mm.plugin.appbrand.appstorage.o;
import com.tencent.mm.plugin.appbrand.r.q.a;
import com.tencent.mm.plugin.appbrand.ui.u;

public class a extends com.tencent.luggage.bridge.impl.a
{
  public void a(a.a parama)
  {
    AppMethodBeat.i(114300);
    super.a(parama);
    AppMethodBeat.o(114300);
  }

  public void a(a.c paramc)
  {
    AppMethodBeat.i(114299);
    super.a(paramc);
    paramc.a(u.class, new com.tencent.luggage.sdk.customize.impl.a());
    paramc.a(com.tencent.mm.plugin.appbrand.page.al.a.class, new com.tencent.mm.plugin.appbrand.widget.input.al.a());
    paramc.a(q.a.class, new b());
    paramc.a(com.tencent.luggage.c.a.a.class, new com.tencent.luggage.c.a.a.a());
    paramc.a(o.class, c.gSg);
    AppMethodBeat.o(114299);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.a
 * JD-Core Version:    0.6.2
 */
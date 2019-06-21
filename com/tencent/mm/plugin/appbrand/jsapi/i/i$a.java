package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.l.p;
import com.tencent.mm.plugin.appbrand.l.p.2;
import com.tencent.mm.plugin.appbrand.l.p.b;
import com.tencent.mm.plugin.appbrand.l.p.c;
import com.tencent.mm.sdk.g.a.e;
import java.util.concurrent.atomic.AtomicInteger;

final class i$a
  implements p.b
{
  c gMJ;
  AtomicInteger hRN;
  AtomicInteger hRO;

  i$a(i parami, c paramc)
  {
    AppMethodBeat.i(108065);
    this.hRN = new AtomicInteger();
    this.hRO = new AtomicInteger();
    this.gMJ = paramc;
    AppMethodBeat.o(108065);
  }

  public final void a(p.c paramc)
  {
    AppMethodBeat.i(108070);
    com.tencent.luggage.g.d.i("MicroMsg.JsApiOperateLocalServicesScan", "onServiceFound");
    p localp = p.ipp;
    i.a.1 local1 = new i.a.1(this);
    com.tencent.mm.sdk.g.d.xDG.b(new p.2(localp, paramc, local1), "LocalServiceMgr#resolveService");
    AppMethodBeat.o(108070);
  }

  public final void aEp()
  {
    AppMethodBeat.i(108066);
    this.gMJ.M(this.hRN.get(), this.hRL.j("fail", null));
    com.tencent.luggage.g.d.i("MicroMsg.JsApiOperateLocalServicesScan", "onStartDiscoveryFailed");
    AppMethodBeat.o(108066);
  }

  public final void aEq()
  {
    AppMethodBeat.i(108067);
    this.gMJ.M(this.hRO.get(), this.hRL.j("fail", null));
    com.tencent.luggage.g.d.i("MicroMsg.JsApiOperateLocalServicesScan", "onStopDiscoveryFailed");
    AppMethodBeat.o(108067);
  }

  public final void aEr()
  {
    AppMethodBeat.i(108068);
    this.gMJ.M(this.hRN.get(), this.hRL.j("ok", null));
    com.tencent.luggage.g.d.i("MicroMsg.JsApiOperateLocalServicesScan", "onDiscoveryStarted");
    AppMethodBeat.o(108068);
  }

  public final void aEs()
  {
    AppMethodBeat.i(108069);
    com.tencent.luggage.g.d.i("MicroMsg.JsApiOperateLocalServicesScan", "onDiscoveryStopped");
    this.gMJ.M(this.hRO.get(), this.hRL.j("ok", null));
    a.r(this.gMJ);
    AppMethodBeat.o(108069);
  }

  public final void b(p.c paramc)
  {
    AppMethodBeat.i(108071);
    a.b(this.gMJ, paramc);
    AppMethodBeat.o(108071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.i.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.q;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.networking.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/system/JsApiGetNetworkTypeWxa;", "Lcom/tencent/mm/plugin/appbrand/jsapi/system/JsApiGetNetworkType;", "Lcom/tencent/mm/plugin/appbrand/networking/IOnNetworkStateChanged;", "()V", "mCached", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/tencent/mm/plugin/appbrand/jsapi/system/JsApiGetNetworkType$NetworkType;", "mCanUseCache", "", "getNetworkType", "component", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;", "onNetworkStateChanged", "", "onRegistered", "onUnregistered", "Companion", "luggage-wxa-app_release"})
public final class e extends d
  implements com.tencent.mm.plugin.appbrand.networking.c
{

  @Deprecated
  public static final e.a hXG;
  private final AtomicReference<d.a> hXE;
  private boolean hXF;

  static
  {
    AppMethodBeat.i(87579);
    hXG = new e.a((byte)0);
    AppMethodBeat.o(87579);
  }

  public e()
  {
    AppMethodBeat.i(87578);
    this.hXE = new AtomicReference(null);
    AppMethodBeat.o(87578);
  }

  public final void aEU()
  {
    AppMethodBeat.i(87575);
    this.hXE.set(null);
    AppMethodBeat.o(87575);
  }

  public final void g(com.tencent.mm.plugin.appbrand.jsapi.c paramc)
  {
    AppMethodBeat.i(87576);
    j.p(paramc, "component");
    paramc = (b)paramc.B(b.class);
    if (paramc != null)
    {
      paramc.a((com.tencent.mm.plugin.appbrand.networking.c)this);
      this.hXF = true;
      AppMethodBeat.o(87576);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(87576);
    }
  }

  public final void h(com.tencent.mm.plugin.appbrand.jsapi.c paramc)
  {
    AppMethodBeat.i(87577);
    j.p(paramc, "component");
    paramc = (b)paramc.B(b.class);
    if (paramc != null)
    {
      paramc.b((com.tencent.mm.plugin.appbrand.networking.c)this);
      AppMethodBeat.o(87577);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(87577);
    }
  }

  protected final d.a v(com.tencent.mm.plugin.appbrand.jsapi.c paramc)
  {
    AppMethodBeat.i(87574);
    j.p(paramc, "component");
    long l = System.nanoTime();
    d.a locala2;
    if (this.hXF)
    {
      d.a locala1 = (d.a)this.hXE.get();
      locala2 = locala1;
      if (locala1 == null)
      {
        locala2 = super.v(paramc);
        this.hXE.set(locala2);
      }
    }
    while (true)
    {
      l = System.nanoTime() - l;
      com.tencent.luggage.g.d.v("Luggage.Wxa.JsApiGetNetworkTypeWxa", "getNetworkType cost[ %d ns, %d ms] ret[%s]", new Object[] { Long.valueOf(l), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(l)), locala2.value });
      j.o(locala2, "type");
      AppMethodBeat.o(87574);
      return locala2;
      locala2 = super.v(paramc);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.e
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.p.a;
import com.tencent.mm.plugin.appbrand.l.p.c;

final class i$a$1
  implements p.a
{
  i$a$1(i.a parama)
  {
  }

  public final void c(p.c paramc)
  {
    AppMethodBeat.i(108063);
    d.i("MicroMsg.JsApiOperateLocalServicesScan", "onResolveFailed");
    a.c(this.hRP.gMJ, paramc);
    AppMethodBeat.o(108063);
  }

  public final void d(p.c paramc)
  {
    AppMethodBeat.i(108064);
    d.i("MicroMsg.JsApiOperateLocalServicesScan", "onServiceResolved");
    a.a(this.hRP.gMJ, paramc);
    AppMethodBeat.o(108064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.i.a.1
 * JD-Core Version:    0.6.2
 */
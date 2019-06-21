package com.tencent.mm.plugin.appbrand.jsapi.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;

final class j$1 extends g.c
{
  j$1(j paramj, c paramc)
  {
  }

  public final void a(g.d paramd)
  {
    AppMethodBeat.i(126420);
    ab.i("MicroMsg.JsApiSetKeepScreenOn", "onPause");
    if (j.a(this.hXI))
      j.b(this.hXI);
    AppMethodBeat.o(126420);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(126419);
    ab.i("MicroMsg.JsApiSetKeepScreenOn", "onDestroy");
    if (j.a(this.hXI))
      j.b(this.hXI);
    g.b(this.hxc.getAppId(), this);
    AppMethodBeat.o(126419);
  }

  public final void onResume()
  {
    AppMethodBeat.i(126421);
    ab.i("MicroMsg.JsApiSetKeepScreenOn", "onResume");
    if (j.access$200())
      j.c(this.hXI);
    AppMethodBeat.o(126421);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.j.1
 * JD-Core Version:    0.6.2
 */
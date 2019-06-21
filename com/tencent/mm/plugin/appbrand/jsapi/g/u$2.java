package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.o;
import com.tencent.mm.sdk.platformtools.ab;

final class u$2
  implements b.o
{
  u$2(u paramu, c paramc, int paramInt, b paramb)
  {
  }

  public final void ec(boolean paramBoolean)
  {
    AppMethodBeat.i(93873);
    ab.i("MicroMsg.JsApiTranslateMapMarker", "onMarkerTranslate result::%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      u.a(this.hMQ, this.hIt, this.eIl, "ok", this.hMI.aDU());
      AppMethodBeat.o(93873);
    }
    while (true)
    {
      return;
      u.a(this.hMQ, this.hIt, this.eIl, "fail", this.hMI.aDU());
      AppMethodBeat.o(93873);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.u.2
 * JD-Core Version:    0.6.2
 */
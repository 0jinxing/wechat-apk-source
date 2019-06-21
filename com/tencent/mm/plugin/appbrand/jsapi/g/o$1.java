package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class o$1
  implements f.b
{
  o$1(o paramo, b paramb)
  {
  }

  public final void wW()
  {
    AppMethodBeat.i(93852);
    ab.i("MicroMsg.JsApiInsertMap", "onBackground");
    if (this.hMI != null)
      this.hMI.onPause();
    AppMethodBeat.o(93852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.o.1
 * JD-Core Version:    0.6.2
 */
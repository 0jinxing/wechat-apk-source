package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class o$2
  implements f.d
{
  o$2(o paramo, b paramb)
  {
  }

  public final void wU()
  {
    AppMethodBeat.i(93853);
    ab.i("MicroMsg.JsApiInsertMap", "onForeground");
    if (this.hMI != null)
      this.hMI.onResume();
    AppMethodBeat.o(93853);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.o.2
 * JD-Core Version:    0.6.2
 */
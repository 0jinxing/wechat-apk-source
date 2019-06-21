package com.tencent.mm.plugin.appbrand.jsapi.u.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class b$2
  implements f.d
{
  public b$2(b paramb, com.tencent.mm.plugin.appbrand.jsapi.g.a.b paramb1)
  {
  }

  public final void wU()
  {
    AppMethodBeat.i(117354);
    ab.i("MicroMsg.JsApiInsertXWebMap", "onForeground");
    if (this.hMI != null)
      this.hMI.onResume();
    AppMethodBeat.o(117354);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.2
 * JD-Core Version:    0.6.2
 */
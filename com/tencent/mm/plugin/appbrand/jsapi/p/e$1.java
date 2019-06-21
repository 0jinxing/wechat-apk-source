package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ce.a;
import com.tencent.mm.plugin.appbrand.s.t.a;
import com.tencent.mm.plugin.appbrand.s.t.b;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1
  implements t.b
{
  e$1(e parame)
  {
  }

  public final void a(t.a parama1, final t.a parama2)
  {
    AppMethodBeat.i(126379);
    ab.i("MicroMsg.JsApiEnableDeviceOrientation", "OrientationListener lastOrientation:" + parama1.name() + "; newOrientation:" + parama2.name());
    a.postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(126378);
        h.b(parama2);
        AppMethodBeat.o(126378);
      }
    }
    , 500L);
    AppMethodBeat.o(126379);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.e.1
 * JD-Core Version:    0.6.2
 */
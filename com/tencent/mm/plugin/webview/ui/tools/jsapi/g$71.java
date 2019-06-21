package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.sdk.platformtools.ab;

final class g$71
  implements Runnable
{
  g$71(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9133);
    if (g.B(this.uHd) != null)
      g.B(this.uHd).c(g.C(this.uHd));
    if (g.C(this.uHd) == null)
    {
      ab.w("MicroMsg.MsgHandler", "already callback");
      AppMethodBeat.o(9133);
    }
    while (true)
    {
      return;
      g.D(this.uHd);
      g.a(this.uHd, g.j(this.uHd), "geo_location:fail_timeout", null);
      AppMethodBeat.o(9133);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.71
 * JD-Core Version:    0.6.2
 */
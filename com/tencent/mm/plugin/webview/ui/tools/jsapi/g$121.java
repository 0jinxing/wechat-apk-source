package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$121
  implements Runnable
{
  g$121(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9198);
    try
    {
      g localg = this.uHd;
      i locali = new com/tencent/mm/plugin/webview/ui/tools/jsapi/i;
      locali.<init>();
      g.k(localg, locali);
      AppMethodBeat.o(9198);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.i("MicroMsg.MsgHandler", "openCunstomWebview, close window exception : %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(9198);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.121
 * JD-Core Version:    0.6.2
 */
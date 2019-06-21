package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modelcache.r;
import com.tencent.mm.plugin.webview.modelcache.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;

final class g$6
  implements g.a
{
  public final void aCB()
  {
    AppMethodBeat.i(9047);
    r.a.cYq().aNS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(9046);
        Runnable localRunnable = (Runnable)g.dcK().pollFirst();
        if (localRunnable != null)
        {
          localRunnable.run();
          AppMethodBeat.o(9046);
        }
        while (true)
        {
          return;
          ab.i("MicroMsg.MsgHandler", "authJsApiQueue processed!");
          g.dcL();
          AppMethodBeat.o(9046);
        }
      }
    });
    AppMethodBeat.o(9047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.6
 * JD-Core Version:    0.6.2
 */
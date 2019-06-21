package com.tencent.mm.plugin.webview.fts;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;

final class g$4
  implements Runnable
{
  g$4(g paramg, int paramInt, String paramString1, String paramString2, boolean paramBoolean, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5741);
    if (g.b(this.ugk) != null)
      ab.i("MicroMsg.FTS.WebSearchLogic", "waiting for countdown, %d", new Object[] { Long.valueOf(g.b(this.ugk).getCount()) });
    while (true)
    {
      int i;
      try
      {
        g.b(this.ugk).await();
        i = this.ufW;
        if (g.c(this.ugk) == null)
          break label146;
        int j = g.c(this.ugk).cIv;
        i = j;
        if (!g.c(this.ugk).tZO)
          break label146;
        i = j;
        if (!g.d(this.ugk))
          break label146;
        ab.w("MicroMsg.FTS.WebSearchLogic", "ingore pre get data");
        AppMethodBeat.o(5741);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        ab.printErrStackTrace("MicroMsg.FTS.WebSearchLogic", localInterruptedException, "", new Object[0]);
        continue;
      }
      ab.i("MicroMsg.FTS.WebSearchLogic", "count down latch null");
      continue;
      label146: ab.i("MicroMsg.FTS.WebSearchLogic", "calling back to webview, id %d, reqId %s,  %s", new Object[] { Integer.valueOf(i), this.ufX, g.c(this.ugk) });
      h.JR(i).a(this.val$data, this.ufY, this.ufX, this.hkY);
      AppMethodBeat.o(5741);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.g.4
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;

final class f$2
  implements Runnable
{
  f$2(f paramf, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5723);
    if (f.a(this.ufV) != null)
      ab.i("MicroMsg.TopStory.RecommendLogic", "waiting for countdown, %d", new Object[] { Long.valueOf(f.a(this.ufV).getCount()) });
    while (true)
    {
      int i;
      try
      {
        f.a(this.ufV).await();
        i = this.ufW;
        if (f.b(this.ufV) == null)
          break label146;
        int j = f.b(this.ufV).cIv;
        i = j;
        if (!f.b(this.ufV).tZO)
          break label146;
        i = j;
        if (!f.c(this.ufV))
          break label146;
        ab.w("MicroMsg.TopStory.RecommendLogic", "ingore pre get data");
        AppMethodBeat.o(5723);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.RecommendLogic", localInterruptedException, "", new Object[0]);
        continue;
      }
      ab.i("MicroMsg.TopStory.RecommendLogic", "count down latch null");
      continue;
      label146: ab.i("MicroMsg.TopStory.RecommendLogic", "calling back to webview, id %d, reqId %s,  %s", new Object[] { Integer.valueOf(i), this.ufX, f.b(this.ufV) });
      h.JR(i).a(this.val$data, this.ufY, this.ufX, null);
      AppMethodBeat.o(5723);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.f.2
 * JD-Core Version:    0.6.2
 */
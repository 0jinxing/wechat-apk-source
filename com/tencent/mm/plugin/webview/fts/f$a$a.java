package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.websearch.api.a;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class f$a$a
  implements Runnable
{
  s fpL;
  public volatile boolean jxQ;

  private f$a$a(f.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5724);
    if (Thread.interrupted())
      AppMethodBeat.o(5724);
    while (true)
    {
      return;
      if (bo.isNullOrNil(this.fpL.ctj))
      {
        ab.i("MicroMsg.TopStory.RecommendLogic", "error query %d %d %d %d %s %d", new Object[] { Integer.valueOf(this.fpL.businessType), Integer.valueOf(this.fpL.scene), Integer.valueOf(this.fpL.tZw), Integer.valueOf(this.fpL.cIC), this.fpL.lcA, Integer.valueOf(this.fpL.offset) });
        AppMethodBeat.o(5724);
      }
      else
      {
        ab.i("MicroMsg.TopStory.RecommendLogic", "start New NetScene %s ,  %d", new Object[] { this.fpL.ctj, Integer.valueOf(this.fpL.cIv) });
        if (f.a.a(this.ugb) != null)
          com.tencent.mm.kernel.g.Rg().c(f.a.a(this.ugb));
        if (this.jxQ)
        {
          ab.i("MicroMsg.TopStory.RecommendLogic", "was cancelled");
          AppMethodBeat.o(5724);
        }
        else
        {
          com.tencent.mm.plugin.webview.modeltools.g.cYC().ufm.m(this.fpL.scene, this.fpL.ctj, this.fpL.businessType);
          f.a.a(this.ugb, f.a.a(this.fpL));
          com.tencent.mm.kernel.g.Rg().a(f.a.a(this.ugb).getType(), this.ugb.ufV);
          com.tencent.mm.kernel.g.Rg().a(f.a.a(this.ugb), 0);
          ab.i("MicroMsg.TopStory.RecommendLogic", "doScene(type : %s)", new Object[] { Integer.valueOf(f.a.a(this.ugb).getType()) });
          AppMethodBeat.o(5724);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.f.a.a
 * JD-Core Version:    0.6.2
 */
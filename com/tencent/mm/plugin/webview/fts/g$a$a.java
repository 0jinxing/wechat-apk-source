package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.a;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.plugin.websearch.c.a.c;
import com.tencent.mm.plugin.websearch.c.a.e;
import com.tencent.mm.plugin.websearch.c.a.e.a;
import com.tencent.mm.protocal.protobuf.cmg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g$a$a
  implements Runnable
{
  s fpL;
  public volatile boolean jxQ;

  private g$a$a(g.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5743);
    if (Thread.interrupted())
      AppMethodBeat.o(5743);
    while (true)
    {
      return;
      if (bo.isNullOrNil(this.fpL.ctj))
      {
        ab.i("MicroMsg.FTS.WebSearchLogic", "error query %d %d %d %d %s %d", new Object[] { Integer.valueOf(this.fpL.businessType), Integer.valueOf(this.fpL.scene), Integer.valueOf(this.fpL.tZw), Integer.valueOf(this.fpL.cIC), this.fpL.lcA, Integer.valueOf(this.fpL.offset) });
        AppMethodBeat.o(5743);
      }
      else
      {
        switch (this.fpL.scene)
        {
        default:
        case 3:
        case 16:
        case 20:
        }
        LinkedList localLinkedList;
        Object localObject;
        while (true)
        {
          ab.i("MicroMsg.FTS.WebSearchLogic", "start New NetScene %s ,  %d", new Object[] { this.fpL.ctj, Integer.valueOf(this.fpL.cIv) });
          if (g.a.a(this.ugo) != null)
            com.tencent.mm.kernel.g.Rg().c(g.a.a(this.ugo));
          localLinkedList = null;
          if (this.fpL.tZx != null)
          {
            localObject = localLinkedList;
            if (!this.fpL.tZx.isEmpty());
          }
          else
          {
            localObject = localLinkedList;
            if (g.al(this.fpL.ctj, this.fpL.scene, this.fpL.businessType))
            {
              long l = System.currentTimeMillis();
              localObject = (e)g.a(this.ugo.ugk).adR(this.fpL.ctj);
              l = System.currentTimeMillis() - l;
              ab.i("MicroMsg.FTS.WebSearchLogic", "match contact cost %d ms", new Object[] { Long.valueOf(l) });
              h.pYm.e(14717, new Object[] { this.fpL.ctj, Integer.valueOf(t.Zo()), Integer.valueOf(((e)localObject).mFf.size()), Long.valueOf(l), Integer.valueOf(this.fpL.scene) });
            }
          }
          if (!this.jxQ)
            break label448;
          ab.i("MicroMsg.FTS.WebSearchLogic", "was cancelled");
          AppMethodBeat.o(5743);
          break;
          ((n)com.tencent.mm.kernel.g.M(n.class)).addSOSHistory(this.fpL.ctj);
        }
        label448: com.tencent.mm.plugin.webview.modeltools.g.cYC().ufm.m(this.fpL.scene, this.fpL.ctj, this.fpL.businessType);
        g.a.a(this.ugo, g.a.c(this.fpL));
        if (localObject != null)
        {
          localLinkedList = new LinkedList();
          Iterator localIterator = new ArrayList(((e)localObject).mFf).iterator();
          while (localIterator.hasNext())
          {
            e.a locala = (e.a)localIterator.next();
            localObject = new cmg();
            ((cmg)localObject).jBB = locala.userName;
            ((cmg)localObject).xkl = locala.ucj;
            ((cmg)localObject).jCH = locala.bCu;
            ((cmg)localObject).wbw = locala.hHV;
            ((cmg)localObject).guS = locala.dFl;
            ((cmg)localObject).vEA = locala.desc;
            localLinkedList.add(localObject);
          }
          g.a.a(this.ugo).ax(localLinkedList);
        }
        com.tencent.mm.kernel.g.Rg().a(g.a.a(this.ugo).getType(), this.ugo.ugk);
        com.tencent.mm.kernel.g.Rg().a(g.a.a(this.ugo), 0);
        ab.i("MicroMsg.FTS.WebSearchLogic", "doScene(type : %s)", new Object[] { Integer.valueOf(g.a.a(this.ugo).getType()) });
        AppMethodBeat.o(5743);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.g.a.a
 * JD-Core Version:    0.6.2
 */
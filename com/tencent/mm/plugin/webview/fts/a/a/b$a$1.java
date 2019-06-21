package com.tencent.mm.plugin.webview.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.da;
import com.tencent.mm.protocal.protobuf.cvv;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a$1
  implements com.tencent.mm.modelappbrand.h
{
  b$a$1(b.a parama, cvv paramcvv, long paramLong)
  {
  }

  public final void a(boolean paramBoolean, long paramLong)
  {
    long l = 1L;
    AppMethodBeat.i(5766);
    ab.i("WidgetPkgPreDownloadMgr", "down succ %b", new Object[] { Boolean.valueOf(paramBoolean) });
    da localda;
    if (paramBoolean)
    {
      com.tencent.mm.plugin.report.service.h.pYm.k(918L, 2L, 1L);
      b.a.a(this.ugw);
      localda = new da().ib(this.ugv.csB);
      localda.diB = this.ugv.vOP;
      localda = localda.ie(this.ugv.xrO).ic(this.ugv.xrN);
      localda.diG = System.currentTimeMillis();
      if (!paramBoolean)
        break label174;
    }
    while (true)
    {
      localda.diE = l;
      localda.diF = (System.currentTimeMillis() - this.ucQ);
      localda.diH = paramLong;
      localda.ajK();
      AppMethodBeat.o(5766);
      return;
      com.tencent.mm.plugin.report.service.h.pYm.k(918L, 3L, 1L);
      break;
      label174: l = 0L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.a.a.b.a.1
 * JD-Core Version:    0.6.2
 */
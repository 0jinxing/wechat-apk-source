package com.tencent.mm.plugin.aa.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class i
  implements com.tencent.mm.ai.f
{
  long cvx = -1L;
  com.tencent.mm.vending.g.b fsC;

  public final void aon()
  {
    AppMethodBeat.i(40626);
    g.RQ();
    g.RO().eJo.b(1530, this);
    AppMethodBeat.o(40626);
  }

  public final void init()
  {
    AppMethodBeat.i(40625);
    g.RQ();
    g.RO().eJo.a(1530, this);
    AppMethodBeat.o(40625);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40627);
    ab.i("MicroMsg.CloseAALogic", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.aa.a.a.e)paramm).gmg;
      ab.i("MicroMsg.CloseAALogic", "closeAA, response.retcode: %s", new Object[] { Integer.valueOf(paramString.kCl) });
      ab.d("MicroMsg.CloseAALogic", "closeAA, response.msgxml: %s", new Object[] { paramString.vzN });
      if (paramString.kCl == 0)
      {
        com.tencent.mm.vending.g.f.a(this.fsC, new Object[] { Boolean.TRUE });
        if ((!bo.isNullOrNil(paramString.vzN)) && (this.cvx > 0L) && (((com.tencent.mm.plugin.aa.a.a.e)paramm).scene == a.glp))
          h.h(this.cvx, paramString.vzN);
        com.tencent.mm.plugin.report.service.h.pYm.a(407L, 21L, 1L, false);
        AppMethodBeat.o(40627);
      }
    }
    while (true)
    {
      return;
      if ((paramString.kCl > 0) && (!bo.isNullOrNil(paramString.kCm)))
      {
        this.fsC.cR(paramString.kCm);
        com.tencent.mm.plugin.report.service.h.pYm.a(407L, 11L, 1L, false);
        AppMethodBeat.o(40627);
      }
      else
      {
        this.fsC.cR(Boolean.FALSE);
        com.tencent.mm.plugin.report.service.h.pYm.a(407L, 23L, 1L, false);
        AppMethodBeat.o(40627);
        continue;
        this.fsC.cR(Boolean.FALSE);
        com.tencent.mm.plugin.report.service.h.pYm.a(407L, 22L, 1L, false);
        AppMethodBeat.o(40627);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.i
 * JD-Core Version:    0.6.2
 */
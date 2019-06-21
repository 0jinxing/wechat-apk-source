package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.g.a.bf.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.g.a.a.b;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class m$1
  implements Runnable
{
  m$1(m paramm, bf parambf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42326);
    boolean bool2;
    if (!bo.isNullOrNil(this.fAR.cus.filePath))
    {
      boolean bool1 = m.aN(this.fAR.cus.cuu, this.fAR.cus.filePath);
      bool2 = true;
      if (!bool1)
        break label143;
      if (!m.et(this.fAR.cus.cuu, this.fAR.cus.cuv))
        break label127;
      ab.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "not retry");
    }
    while (true)
    {
      b.c.dif().f(this.fAR.cus.cut, this.fAR.cus.cuu, this.fAR.cus.cuv, bool2);
      AppMethodBeat.o(42326);
      return;
      label127: h.pYm.k(991L, 1L, 1L);
      bool2 = false;
      continue;
      label143: h.pYm.k(991L, 2L, 1L);
      bool2 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.m.1
 * JD-Core Version:    0.6.2
 */
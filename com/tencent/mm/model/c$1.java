package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelstat.m;
import com.tencent.mm.modelstat.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bb;

final class c$1
  implements h.a
{
  c$1(c paramc)
  {
  }

  public final void RF()
  {
    AppMethodBeat.i(16199);
    g.RQ();
    if (g.RK())
    {
      m localm = q.aks();
      if (localm != null)
      {
        ab.i("MicroMsg.AccountStorage", "summer preCloseCallback netStatStg: ".concat(String.valueOf(localm)));
        long l = System.currentTimeMillis();
        localm.fTM.pl(true);
        ab.i("MicroMsg.NetStat", "summer net appendAllToDisk end takes: " + (System.currentTimeMillis() - l) + " ms");
      }
    }
    AppMethodBeat.o(16199);
  }

  public final void RG()
  {
  }

  public final void RH()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c.1
 * JD-Core Version:    0.6.2
 */
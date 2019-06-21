package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.protocal.protobuf.bfg;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.g.b;

final class z$10
  implements a<Void, a.a<bfg>>
{
  z$10(z paramz)
  {
  }

  private Void d(a.a<bfg> parama)
  {
    AppMethodBeat.i(45316);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LqtSaveFetchLogic", "CgiLqtOnClickPurchase end, errType: %s, errCode: %s", new Object[] { Integer.valueOf(parama.errType), Integer.valueOf(parama.errCode) });
    if ((parama.errType == 0) && (parama.errCode == 0))
    {
      ab.ach(((bfg)parama.fsy).tgu);
      p.tfu.a(((bfg)parama.fsy).wJa, true);
      p.tfu.a((bfg)parama.fsy);
    }
    if (z.d(this.tgm) != null)
      z.d(this.tgm).resume();
    parama = zXH;
    AppMethodBeat.o(45316);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.z.10
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.protocal.protobuf.bfi;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.g.b;

final class z$2
  implements a<Void, a.a<bfi>>
{
  z$2(z paramz)
  {
  }

  private Void d(a.a<bfi> parama)
  {
    AppMethodBeat.i(45307);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LqtSaveFetchLogic", "CgiLqtOnClickRedeem end, errType: %s, errCode: %s", new Object[] { Integer.valueOf(parama.errType), Integer.valueOf(parama.errCode) });
    if ((parama.errType == 0) && (parama.errCode == 0))
    {
      ab.ach(((bfi)parama.fsy).tgu);
      s.cMK().a((bfi)parama.fsy);
      p.tfu.a(((bfi)parama.fsy).wJa, false);
    }
    if (z.d(this.tgm) != null)
      z.d(this.tgm).resume();
    parama = zXH;
    AppMethodBeat.o(45307);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.z.2
 * JD-Core Version:    0.6.2
 */
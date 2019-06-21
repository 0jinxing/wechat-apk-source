package com.tencent.mm.plugin.wallet.balance.a.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.protocal.protobuf.bfi;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.g.b;

final class q$3
  implements a<Void, a.a<bfi>>
{
  q$3(q paramq, b paramb)
  {
  }

  private Void d(a.a<bfi> parama)
  {
    AppMethodBeat.i(45263);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedeem end, errType: %s, errCode: %s", new Object[] { Integer.valueOf(parama.errType), Integer.valueOf(parama.errCode) });
    if ((parama.errType == 0) && (parama.errCode == 0))
    {
      ab.ach(((bfi)parama.fsy).tgu);
      s.cMK().a((bfi)parama.fsy);
      p.tfu.a(((bfi)parama.fsy).wJa, false);
    }
    while (true)
    {
      this.bQV.resume();
      parama = zXH;
      AppMethodBeat.o(45263);
      return parama;
      parama = ah.getContext().getString(2131305389);
      Toast.makeText(ah.getContext(), parama, 1).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.q.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hq;
import com.tencent.mm.g.a.hq.b;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyDetailUI$20
  implements Runnable
{
  LuckyMoneyDetailUI$20(LuckyMoneyDetailUI paramLuckyMoneyDetailUI, hq paramhq, k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42669);
    if (this.ocS.cCy.cCA)
    {
      ab.i("MicroMsg.LuckyMoneyDetailUI", "Get res Ok, path=" + this.ocS.cCy.cCB);
      x.m(LuckyMoneyDetailUI.N(this.oeA), this.ocS.cCy.cCB);
      AppMethodBeat.o(42669);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.LuckyMoneyDetailUI", "Get res fail & load from url.");
      x.b(LuckyMoneyDetailUI.N(this.oeA), this.ocT.nWR, this.ocT.nXl);
      AppMethodBeat.o(42669);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.20
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hq;
import com.tencent.mm.g.a.hq.b;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class LuckyMoneyBusiDetailUI$3
  implements Runnable
{
  LuckyMoneyBusiDetailUI$3(LuckyMoneyBusiDetailUI paramLuckyMoneyBusiDetailUI, hq paramhq, k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42585);
    if (this.ocS.cCy.cCA)
    {
      ab.i("MicroMsg.LuckyMoneyDetailUI", "Get res Ok, path=" + this.ocS.cCy.cCB);
      x.m(LuckyMoneyBusiDetailUI.i(this.ocR), this.ocS.cCy.cCB);
      AppMethodBeat.o(42585);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.LuckyMoneyDetailUI", "Get res fail & load from url.");
      if (!bo.isNullOrNil(this.ocT.nWR))
        x.b(LuckyMoneyBusiDetailUI.i(this.ocR), this.ocT.nWR, this.ocT.nXl);
      AppMethodBeat.o(42585);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.3
 * JD-Core Version:    0.6.2
 */
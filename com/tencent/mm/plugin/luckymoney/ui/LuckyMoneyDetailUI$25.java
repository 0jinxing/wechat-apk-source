package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyDetailUI$25
  implements Runnable
{
  LuckyMoneyDetailUI$25(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42675);
    LuckyMoneyDetailUI.c(this.oeA, LuckyMoneyDetailUI.Q(this.oeA).getHeight());
    ab.d("MicroMsg.LuckyMoneyDetailUI", "get footer height: %s", new Object[] { Integer.valueOf(LuckyMoneyDetailUI.R(this.oeA)) });
    AppMethodBeat.o(42675);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.25
 * JD-Core Version:    0.6.2
 */
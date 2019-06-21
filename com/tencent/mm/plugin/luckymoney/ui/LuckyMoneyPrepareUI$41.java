package com.tencent.mm.plugin.luckymoney.ui;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class LuckyMoneyPrepareUI$41
  implements ap.a
{
  LuckyMoneyPrepareUI$41(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(42991);
    int i;
    double d1;
    if ((LuckyMoneyPrepareUI.c(this.ohI).bKW() != 3) && (LuckyMoneyPrepareUI.b(this.ohI).bKW() != 3))
    {
      i = LuckyMoneyPrepareUI.b(this.ohI).getInput();
      d1 = LuckyMoneyPrepareUI.c(this.ohI).getInput();
      d2 = d1;
      if (LuckyMoneyPrepareUI.d(this.ohI) != 0);
    }
    for (double d2 = d1 * i; ; d2 = 0.0D)
    {
      if ((d2 == 0.0D) || (d2 > LuckyMoneyPrepareUI.e(this.ohI).nRR) || (LuckyMoneyPrepareUI.j(this.ohI).bMz()))
      {
        LuckyMoneyPrepareUI.k(this.ohI).setClickable(false);
        LuckyMoneyPrepareUI.k(this.ohI).setEnabled(false);
      }
      while (true)
      {
        ab.i("MicroMsg.LuckyMoneyPrepareUI", "onTimeExpired & check: amount=" + d2 + ", hasErr=" + LuckyMoneyPrepareUI.j(this.ohI).bMz());
        LuckyMoneyPrepareUI.l(this.ohI).doT();
        AppMethodBeat.o(42991);
        return false;
        LuckyMoneyPrepareUI.k(this.ohI).setClickable(true);
        LuckyMoneyPrepareUI.k(this.ohI).setEnabled(true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.41
 * JD-Core Version:    0.6.2
 */
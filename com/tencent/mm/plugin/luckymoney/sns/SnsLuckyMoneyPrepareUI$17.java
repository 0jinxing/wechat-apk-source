package com.tencent.mm.plugin.luckymoney.sns;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.luckymoney.ui.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SnsLuckyMoneyPrepareUI$17
  implements ap.a
{
  SnsLuckyMoneyPrepareUI$17(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(42527);
    int i;
    double d1;
    if ((this.obN.obC.bKW() != 3) && (this.obN.nTd.bKW() != 3))
    {
      i = this.obN.nTd.getInput();
      d1 = this.obN.obC.getInput();
      d2 = d1;
      if (SnsLuckyMoneyPrepareUI.a(this.obN) != 0);
    }
    for (double d2 = d1 * i; ; d2 = 0.0D)
    {
      if ((d2 == 0.0D) || (d2 > SnsLuckyMoneyPrepareUI.b(this.obN).nRR) || (SnsLuckyMoneyPrepareUI.i(this.obN).bMz()))
      {
        this.obN.nTg.setClickable(false);
        this.obN.nTg.setEnabled(false);
      }
      while (true)
      {
        ab.i("MicroMsg.LuckyMoneyPrepareUI", "onTimeExpired & check: amount=" + d2 + ", hasErr=" + SnsLuckyMoneyPrepareUI.i(this.obN).bMz());
        SnsLuckyMoneyPrepareUI.j(this.obN).doT();
        AppMethodBeat.o(42527);
        return false;
        this.obN.nTg.setClickable(true);
        this.obN.nTg.setEnabled(true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.17
 * JD-Core Version:    0.6.2
 */
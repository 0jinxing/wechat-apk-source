package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText.a;

final class LuckyMoneyBusiDetailUI$9
  implements MMEditText.a
{
  LuckyMoneyBusiDetailUI$9(LuckyMoneyBusiDetailUI paramLuckyMoneyBusiDetailUI)
  {
  }

  public final void bMu()
  {
    AppMethodBeat.i(42591);
    if (LuckyMoneyBusiDetailUI.f(this.ocR).getVisibility() == 0)
    {
      LuckyMoneyBusiDetailUI.f(this.ocR).setVisibility(8);
      AppMethodBeat.o(42591);
    }
    while (true)
    {
      return;
      this.ocR.mController.ylL.finish();
      AppMethodBeat.o(42591);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.9
 * JD-Core Version:    0.6.2
 */
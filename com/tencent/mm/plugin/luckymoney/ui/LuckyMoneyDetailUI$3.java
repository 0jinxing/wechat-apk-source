package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText.a;

final class LuckyMoneyDetailUI$3
  implements MMEditText.a
{
  LuckyMoneyDetailUI$3(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void bMu()
  {
    AppMethodBeat.i(42648);
    if (LuckyMoneyDetailUI.t(this.oeA).getVisibility() == 0)
    {
      LuckyMoneyDetailUI.t(this.oeA).setVisibility(8);
      AppMethodBeat.o(42648);
    }
    while (true)
    {
      return;
      this.oeA.mController.ylL.finish();
      AppMethodBeat.o(42648);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.3
 * JD-Core Version:    0.6.2
 */
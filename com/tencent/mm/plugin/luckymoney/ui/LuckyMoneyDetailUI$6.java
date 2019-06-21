package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.KeyboardLinearLayout.a;

final class LuckyMoneyDetailUI$6
  implements KeyboardLinearLayout.a
{
  LuckyMoneyDetailUI$6(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void sD(int paramInt)
  {
    AppMethodBeat.i(42651);
    if (paramInt == -2)
      if (LuckyMoneyDetailUI.t(this.oeA).oil)
      {
        LuckyMoneyDetailUI.t(this.oeA).setModeClick(false);
        AppMethodBeat.o(42651);
      }
    while (true)
    {
      return;
      LuckyMoneyDetailUI.t(this.oeA).setVisibility(8);
      AppMethodBeat.o(42651);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.6
 * JD-Core Version:    0.6.2
 */
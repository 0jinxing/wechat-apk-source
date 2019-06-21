package com.tencent.mm.plugin.luckymoney.f2f.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.f2f.a;

final class LuckyMoneyF2FQRCodeUI$5
  implements ShuffleView.b
{
  LuckyMoneyF2FQRCodeUI$5(LuckyMoneyF2FQRCodeUI paramLuckyMoneyF2FQRCodeUI)
  {
  }

  public final void er(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(42174);
    int[] arrayOfInt;
    if (paramInt2 == 8)
    {
      LuckyMoneyF2FQRCodeUI.F(this.nVw).jU("music" + (paramInt1 + 1) + ".m4a");
      arrayOfInt = LuckyMoneyF2FQRCodeUI.I(this.nVw);
      arrayOfInt[4] += 1;
      AppMethodBeat.o(42174);
    }
    while (true)
    {
      return;
      LuckyMoneyF2FQRCodeUI.F(this.nVw).jU("touch_card.m4a");
      arrayOfInt = LuckyMoneyF2FQRCodeUI.I(this.nVw);
      arrayOfInt[2] += 1;
      AppMethodBeat.o(42174);
    }
  }

  public final void es(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(42176);
    if (paramInt2 == 8)
    {
      LuckyMoneyF2FQRCodeUI.F(this.nVw).jU("music" + (paramInt1 + 1) + ".m4a");
      AppMethodBeat.o(42176);
    }
    while (true)
    {
      return;
      LuckyMoneyF2FQRCodeUI.F(this.nVw).jU("select_card.m4a");
      AppMethodBeat.o(42176);
    }
  }

  public final void xL(int paramInt)
  {
    AppMethodBeat.i(42175);
    LuckyMoneyF2FQRCodeUI.J(this.nVw);
    int[] arrayOfInt;
    if (paramInt != 8)
    {
      LuckyMoneyF2FQRCodeUI.F(this.nVw).jU("select_card.m4a");
      arrayOfInt = LuckyMoneyF2FQRCodeUI.I(this.nVw);
      arrayOfInt[3] += 1;
      AppMethodBeat.o(42175);
    }
    while (true)
    {
      return;
      arrayOfInt = LuckyMoneyF2FQRCodeUI.I(this.nVw);
      arrayOfInt[5] += 1;
      AppMethodBeat.o(42175);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.5
 * JD-Core Version:    0.6.2
 */
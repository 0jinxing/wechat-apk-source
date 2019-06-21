package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.r;
import com.tencent.mm.ui.base.h.c;

final class LuckyMoneyMyRecordUI$4$1
  implements h.c
{
  LuckyMoneyMyRecordUI$4$1(LuckyMoneyMyRecordUI.4 param4, int paramInt)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(42760);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(42760);
      return;
      r localr = LuckyMoneyMyRecordUI.f(this.ofe.ofb).yb(this.ofd);
      if (localr != null)
      {
        LuckyMoneyMyRecordUI.b(this.ofe.ofb, this.ofd);
        LuckyMoneyMyRecordUI.a(this.ofe.ofb, localr, this.ofd);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.4.1
 * JD-Core Version:    0.6.2
 */
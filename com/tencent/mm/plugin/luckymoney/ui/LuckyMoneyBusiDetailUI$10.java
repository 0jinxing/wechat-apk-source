package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.am;
import com.tencent.mm.sdk.platformtools.bo;

final class LuckyMoneyBusiDetailUI$10
  implements LuckyMoneyWishFooter.b
{
  LuckyMoneyBusiDetailUI$10(LuckyMoneyBusiDetailUI paramLuckyMoneyBusiDetailUI)
  {
  }

  public final void Qm(String paramString)
  {
    AppMethodBeat.i(42592);
    if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil(LuckyMoneyBusiDetailUI.g(this.ocR))))
    {
      paramString = new am(LuckyMoneyBusiDetailUI.h(this.ocR), paramString, LuckyMoneyBusiDetailUI.g(this.ocR), "v1.0");
      this.ocR.n(paramString);
      LuckyMoneyBusiDetailUI.e(this.ocR);
    }
    AppMethodBeat.o(42592);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.10
 * JD-Core Version:    0.6.2
 */
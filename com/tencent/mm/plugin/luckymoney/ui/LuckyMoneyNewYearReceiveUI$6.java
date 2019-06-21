package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.aq;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyNewYearReceiveUI$6
  implements a.a
{
  LuckyMoneyNewYearReceiveUI$6(LuckyMoneyNewYearReceiveUI paramLuckyMoneyNewYearReceiveUI, aq paramaq)
  {
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(42789);
    ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "showDisclaimerDialog resultCode=" + paramInt1 + ";errCode=" + paramInt2 + ";errMsg=" + paramString + ";hadAgree = " + paramBoolean);
    if (paramInt1 == 1)
      this.ofE.finish();
    while (true)
    {
      AppMethodBeat.o(42789);
      return true;
      if (paramInt1 == 2)
        LuckyMoneyNewYearReceiveUI.a(this.ofE, this.ofG.msgType, this.ofG.cdf, this.ofG.nSX, this.ofG.cRS, this.ofG.nZl);
      else if ((paramInt1 == 0) && (paramBoolean))
        LuckyMoneyNewYearReceiveUI.a(this.ofE, this.ofG.msgType, this.ofG.cdf, this.ofG.nSX, this.ofG.cRS, this.ofG.nZl);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.6
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class LuckyMoneyMyRecordUI$6
  implements View.OnClickListener
{
  LuckyMoneyMyRecordUI$6(LuckyMoneyMyRecordUI paramLuckyMoneyMyRecordUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42763);
    if (!bo.isNullOrNil(this.ofb.nYT))
    {
      e.n(this.ofb, this.ofb.nYT, true);
      AppMethodBeat.o(42763);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.LuckyMoneyMyRecordUI", "hy: no avatar jump h5");
      AppMethodBeat.o(42763);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.6
 * JD-Core Version:    0.6.2
 */
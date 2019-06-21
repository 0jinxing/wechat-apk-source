package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyNewYearReceiveUI$9
  implements View.OnClickListener
{
  LuckyMoneyNewYearReceiveUI$9(LuckyMoneyNewYearReceiveUI paramLuckyMoneyNewYearReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42794);
    ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "goto BalanceManagerUI!");
    h.ak(this.ofE.mController.ylL, 1);
    AppMethodBeat.o(42794);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.9
 * JD-Core Version:    0.6.2
 */
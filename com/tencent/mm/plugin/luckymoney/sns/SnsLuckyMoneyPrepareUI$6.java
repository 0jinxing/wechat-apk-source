package com.tencent.mm.plugin.luckymoney.sns;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.ag;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class SnsLuckyMoneyPrepareUI$6
  implements View.OnClickListener
{
  SnsLuckyMoneyPrepareUI$6(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI, ag paramag)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42512);
    e.n(this.obN.mController.ylL, this.obO.nYG, false);
    AppMethodBeat.o(42512);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.6
 * JD-Core Version:    0.6.2
 */
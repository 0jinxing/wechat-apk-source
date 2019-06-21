package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bdg;
import com.tencent.mm.protocal.protobuf.bkm;
import com.tencent.mm.wallet_core.ui.e;

final class WalletLqtPlanHomeUI$b$1
  implements View.OnClickListener
{
  WalletLqtPlanHomeUI$b$1(WalletLqtPlanHomeUI.b paramb, bkm parambkm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45619);
    e.n(this.tjY.iym.getContext(), this.tjN.wNF.url, true);
    AppMethodBeat.o(45619);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.b.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.vending.g.d.a;

final class WalletLqtPlanHomeUI$8
  implements d.a
{
  WalletLqtPlanHomeUI$8(WalletLqtPlanHomeUI paramWalletLqtPlanHomeUI, Dialog paramDialog)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(45613);
    this.tjq.dismiss();
    if ((paramObject instanceof m))
      ((m)paramObject).y(this.tjK.mController.ylL, false);
    AppMethodBeat.o(45613);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.8
 * JD-Core Version:    0.6.2
 */
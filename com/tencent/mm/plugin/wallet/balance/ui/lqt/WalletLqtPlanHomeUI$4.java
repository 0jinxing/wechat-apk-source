package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bkl;
import com.tencent.mm.protocal.protobuf.he;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WalletLqtPlanHomeUI$4
  implements View.OnClickListener
{
  WalletLqtPlanHomeUI$4(WalletLqtPlanHomeUI paramWalletLqtPlanHomeUI, bkl parambkl)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45607);
    ab.i("MicroMsg.WalletLqtPlanHomeUI", "click banner");
    e.n(this.tjK.mController.ylL, this.tjL.wNB.url, true);
    AppMethodBeat.o(45607);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.4
 * JD-Core Version:    0.6.2
 */
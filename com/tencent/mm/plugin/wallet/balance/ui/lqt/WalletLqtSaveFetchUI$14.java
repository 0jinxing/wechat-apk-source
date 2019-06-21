package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.balance.a.a.p;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WalletLqtSaveFetchUI$14
  implements o.a
{
  WalletLqtSaveFetchUI$14(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(45665);
    ab.i("MicroMsg.WalletLqtSaveFetchUI", "click balance limit wording");
    e.a(this.tkP.mController.ylL, p.tfu.tfr, true, 1);
    AppMethodBeat.o(45665);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.14
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletBalanceFetchUI$18
  implements View.OnClickListener
{
  WalletBalanceFetchUI$18(WalletBalanceFetchUI paramWalletBalanceFetchUI, Dialog paramDialog)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45374);
    ab.i("MicroMsg.WalletBalanceFetchUI", "showIdentifyInfoCompleteDialog closeIcon click");
    if ((this.thm != null) && (this.thm.isShowing()))
      this.thm.dismiss();
    AppMethodBeat.o(45374);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.18
 * JD-Core Version:    0.6.2
 */
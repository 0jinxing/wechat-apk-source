package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBalanceFetchUI$9
  implements DialogInterface.OnClickListener
{
  WalletBalanceFetchUI$9(WalletBalanceFetchUI paramWalletBalanceFetchUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45363);
    paramDialogInterface.dismiss();
    WalletBalanceFetchUI.o(this.the);
    AppMethodBeat.o(45363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.9
 * JD-Core Version:    0.6.2
 */
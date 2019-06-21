package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBalanceFetchUI$5
  implements DialogInterface.OnClickListener
{
  WalletBalanceFetchUI$5(WalletBalanceFetchUI paramWalletBalanceFetchUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45359);
    paramDialogInterface.dismiss();
    WalletBalanceFetchUI.o(this.the);
    AppMethodBeat.o(45359);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.5
 * JD-Core Version:    0.6.2
 */
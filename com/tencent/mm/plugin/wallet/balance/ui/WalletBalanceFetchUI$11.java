package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBalanceFetchUI$11
  implements DialogInterface.OnClickListener
{
  WalletBalanceFetchUI$11(WalletBalanceFetchUI paramWalletBalanceFetchUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45365);
    paramDialogInterface.dismiss();
    WalletBalanceFetchUI.o(this.the);
    AppMethodBeat.o(45365);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.11
 * JD-Core Version:    0.6.2
 */
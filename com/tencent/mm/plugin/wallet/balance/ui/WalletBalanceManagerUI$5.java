package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBalanceManagerUI$5
  implements DialogInterface.OnClickListener
{
  WalletBalanceManagerUI$5(WalletBalanceManagerUI paramWalletBalanceManagerUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45432);
    paramDialogInterface.dismiss();
    WalletBalanceManagerUI.f(this.thC);
    AppMethodBeat.o(45432);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.5
 * JD-Core Version:    0.6.2
 */
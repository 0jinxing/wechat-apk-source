package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletBalanceFetchResultUI$3
  implements DialogInterface.OnClickListener
{
  WalletBalanceFetchResultUI$3(WalletBalanceFetchResultUI paramWalletBalanceFetchResultUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45349);
    this.tgA.dOD().a(this.tgA, 0, this.tgA.mBundle);
    AppMethodBeat.o(45349);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.balance.a.d;

final class WalletBalanceFetchUI$4
  implements DialogInterface.OnClickListener
{
  WalletBalanceFetchUI$4(WalletBalanceFetchUI paramWalletBalanceFetchUI, d paramd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45358);
    paramDialogInterface.dismiss();
    if (!WalletBalanceFetchUI.a(this.the, this.thh))
    {
      WalletBalanceFetchUI.a(this.the, this.thh.cBT);
      WalletBalanceFetchUI.b(this.the, this.thh);
    }
    AppMethodBeat.o(45358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.4
 * JD-Core Version:    0.6.2
 */
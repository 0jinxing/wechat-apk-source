package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class WalletBalanceFetchUI$14
  implements DialogInterface.OnClickListener
{
  WalletBalanceFetchUI$14(WalletBalanceFetchUI paramWalletBalanceFetchUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45369);
    paramDialogInterface.dismiss();
    h.pYm.e(16398, new Object[] { WalletBalanceFetchUI.d(this.the), Integer.valueOf(4), "", "" });
    AppMethodBeat.o(45369);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.14
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet.balance.a.d;

final class WalletBalanceFetchUI$6
  implements DialogInterface.OnClickListener
{
  WalletBalanceFetchUI$6(WalletBalanceFetchUI paramWalletBalanceFetchUI, d paramd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45360);
    paramDialogInterface.dismiss();
    WalletBalanceFetchUI.a(this.the, this.thh.cBT);
    WalletBalanceFetchUI.b(this.the, this.thh);
    h.pYm.e(16398, new Object[] { WalletBalanceFetchUI.d(this.the), Integer.valueOf(5), "", "" });
    AppMethodBeat.o(45360);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.6
 * JD-Core Version:    0.6.2
 */
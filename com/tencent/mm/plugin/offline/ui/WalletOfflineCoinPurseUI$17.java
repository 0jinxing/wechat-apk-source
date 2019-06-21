package com.tencent.mm.plugin.offline.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletOfflineCoinPurseUI$17
  implements DialogInterface.OnDismissListener
{
  WalletOfflineCoinPurseUI$17(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, DialogInterface.OnDismissListener paramOnDismissListener)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(43523);
    if (this.paK != null)
      this.paK.onDismiss(paramDialogInterface);
    if (WalletOfflineCoinPurseUI.A(this.pav))
    {
      WalletOfflineCoinPurseUI.a(this.pav);
      WalletOfflineCoinPurseUI.B(this.pav);
      WalletOfflineCoinPurseUI.C(this.pav);
      WalletOfflineCoinPurseUI.D(this.pav);
    }
    AppMethodBeat.o(43523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.17
 * JD-Core Version:    0.6.2
 */
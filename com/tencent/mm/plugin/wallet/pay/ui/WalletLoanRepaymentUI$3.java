package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.q;

final class WalletLoanRepaymentUI$3
  implements DialogInterface.OnCancelListener
{
  WalletLoanRepaymentUI$3(WalletLoanRepaymentUI paramWalletLoanRepaymentUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(45993);
    if (this.toY.toD != null)
    {
      this.toY.toD.cancel();
      this.toY.setResult(0);
      this.toY.finish();
    }
    AppMethodBeat.o(45993);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.3
 * JD-Core Version:    0.6.2
 */
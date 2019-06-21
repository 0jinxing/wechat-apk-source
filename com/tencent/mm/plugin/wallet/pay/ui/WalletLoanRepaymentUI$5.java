package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLoanRepaymentUI$5
  implements DialogInterface.OnClickListener
{
  WalletLoanRepaymentUI$5(WalletLoanRepaymentUI paramWalletLoanRepaymentUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45995);
    if (this.toY.bwP())
      this.toY.finish();
    AppMethodBeat.o(45995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.5
 * JD-Core Version:    0.6.2
 */
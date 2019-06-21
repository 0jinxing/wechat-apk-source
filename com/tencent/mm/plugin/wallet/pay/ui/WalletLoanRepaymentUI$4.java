package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletLoanRepaymentUI$4
  implements DialogInterface.OnClickListener
{
  WalletLoanRepaymentUI$4(WalletLoanRepaymentUI paramWalletLoanRepaymentUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45994);
    ab.i("MicroMsg.WalletLoanRepaymentUI", "to bind a new bankcard");
    this.toY.cNT();
    AppMethodBeat.o(45994);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.4
 * JD-Core Version:    0.6.2
 */
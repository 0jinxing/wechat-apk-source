package com.tencent.mm.plugin.wallet.pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.q;

final class WalletLoanRepaymentUI$2
  implements View.OnClickListener
{
  WalletLoanRepaymentUI$2(WalletLoanRepaymentUI paramWalletLoanRepaymentUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45992);
    WalletLoanRepaymentUI.c(this.toY);
    if (this.toY.toD != null)
      this.toY.toD.dismiss();
    AppMethodBeat.o(45992);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ah;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.wallet_core.c.a;

final class WalletLoanRepaymentUI$6
  implements c.a
{
  WalletLoanRepaymentUI$6(WalletLoanRepaymentUI paramWalletLoanRepaymentUI)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(45996);
    if (paramInt == -1)
      WalletLoanRepaymentUI.b(this.toY, WalletLoanRepaymentUI.b(this.toY));
    while (true)
    {
      AppMethodBeat.o(45996);
      return null;
      paramBundle = r.cPJ();
      if (paramBundle.cPU())
      {
        paramBundle = paramBundle.cPV();
        WalletLoanRepaymentUI.a(this.toY, paramBundle, WalletLoanRepaymentUI.d(this.toY), WalletLoanRepaymentUI.e(this.toY));
      }
      else
      {
        this.toY.setResult(0, null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.6
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.a;

final class WalletBalanceSaveUI$3
  implements a
{
  WalletBalanceSaveUI$3(WalletBalanceSaveUI paramWalletBalanceSaveUI)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(45471);
    if (paramBoolean)
    {
      WalletBalanceSaveUI.b(this.thL);
      AppMethodBeat.o(45471);
    }
    while (true)
    {
      return;
      WalletBalanceSaveUI.c(this.thL).scrollTo(0, 0);
      AppMethodBeat.o(45471);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.3
 * JD-Core Version:    0.6.2
 */
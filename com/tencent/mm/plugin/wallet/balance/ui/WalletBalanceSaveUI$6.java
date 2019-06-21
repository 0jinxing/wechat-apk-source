package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBalanceSaveUI$6
  implements Runnable
{
  WalletBalanceSaveUI$6(WalletBalanceSaveUI paramWalletBalanceSaveUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45476);
    WalletBalanceSaveUI.c(this.thL).scrollBy(0, this.pNU);
    AppMethodBeat.o(45476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.6
 * JD-Core Version:    0.6.2
 */
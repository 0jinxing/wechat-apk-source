package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBalanceFetchUI$2
  implements Runnable
{
  WalletBalanceFetchUI$2(WalletBalanceFetchUI paramWalletBalanceFetchUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45354);
    WalletBalanceFetchUI.l(this.the).scrollBy(0, this.pNU);
    AppMethodBeat.o(45354);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.2
 * JD-Core Version:    0.6.2
 */
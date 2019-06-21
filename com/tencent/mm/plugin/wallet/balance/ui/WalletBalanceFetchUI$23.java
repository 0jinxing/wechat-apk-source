package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.a;

final class WalletBalanceFetchUI$23
  implements a
{
  WalletBalanceFetchUI$23(WalletBalanceFetchUI paramWalletBalanceFetchUI)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(45379);
    if (paramBoolean)
    {
      WalletBalanceFetchUI.k(this.the);
      AppMethodBeat.o(45379);
    }
    while (true)
    {
      return;
      WalletBalanceFetchUI.l(this.the).scrollTo(0, 0);
      AppMethodBeat.o(45379);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.23
 * JD-Core Version:    0.6.2
 */
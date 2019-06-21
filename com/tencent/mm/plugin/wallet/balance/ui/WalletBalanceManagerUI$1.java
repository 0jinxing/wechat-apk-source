package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBalanceManagerUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletBalanceManagerUI$1(WalletBalanceManagerUI paramWalletBalanceManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45426);
    if (WalletBalanceManagerUI.a(this.thC))
    {
      this.thC.aqX();
      this.thC.showDialog(1000);
    }
    while (true)
    {
      AppMethodBeat.o(45426);
      return true;
      this.thC.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.1
 * JD-Core Version:    0.6.2
 */
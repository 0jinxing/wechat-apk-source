package com.tencent.mm.plugin.wallet_core.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletVerifyCodeUI$10
  implements MenuItem.OnMenuItemClickListener
{
  WalletVerifyCodeUI$10(WalletVerifyCodeUI paramWalletVerifyCodeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(47699);
    this.tLn.aqX();
    if (this.tLn.cNR())
      this.tLn.showDialog(1000);
    while (true)
    {
      AppMethodBeat.o(47699);
      return false;
      this.tLn.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.10
 * JD-Core Version:    0.6.2
 */
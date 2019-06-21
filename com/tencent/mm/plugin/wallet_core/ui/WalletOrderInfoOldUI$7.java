package com.tencent.mm.plugin.wallet_core.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletOrderInfoOldUI$7
  implements MenuItem.OnMenuItemClickListener
{
  WalletOrderInfoOldUI$7(WalletOrderInfoOldUI paramWalletOrderInfoOldUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(47480);
    this.tIW.done();
    AppMethodBeat.o(47480);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.7
 * JD-Core Version:    0.6.2
 */
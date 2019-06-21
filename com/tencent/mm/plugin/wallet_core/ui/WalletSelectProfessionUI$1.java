package com.tencent.mm.plugin.wallet_core.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSelectProfessionUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletSelectProfessionUI$1(WalletSelectProfessionUI paramWalletSelectProfessionUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(47661);
    this.tKK.setResult(0);
    this.tKK.finish();
    AppMethodBeat.o(47661);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSelectBankcardModeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletSelectBankcardModeUI$1(WalletSelectBankcardModeUI paramWalletSelectBankcardModeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45489);
    this.thS.setResult(0);
    this.thS.finish();
    AppMethodBeat.o(45489);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI.1
 * JD-Core Version:    0.6.2
 */
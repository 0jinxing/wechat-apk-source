package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPasswordSettingUI$6
  implements MenuItem.OnMenuItemClickListener
{
  WalletPasswordSettingUI$6(WalletPasswordSettingUI paramWalletPasswordSettingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(46354);
    this.tsu.finish();
    AppMethodBeat.o(46354);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.6
 * JD-Core Version:    0.6.2
 */
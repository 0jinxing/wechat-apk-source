package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletDelayTransferSettingUI$2
  implements MenuItem.OnMenuItemClickListener
{
  WalletDelayTransferSettingUI$2(WalletDelayTransferSettingUI paramWalletDelayTransferSettingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(46240);
    this.trn.finish();
    AppMethodBeat.o(46240);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI.2
 * JD-Core Version:    0.6.2
 */
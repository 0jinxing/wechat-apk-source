package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WalletDelayTransferSettingUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletDelayTransferSettingUI$1(WalletDelayTransferSettingUI paramWalletDelayTransferSettingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(46239);
    e.n(this.trn.mController.ylL, WalletDelayTransferSettingUI.a(this.trn), false);
    AppMethodBeat.o(46239);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI.1
 * JD-Core Version:    0.6.2
 */
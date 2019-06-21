package com.tencent.mm.plugin.wxcredit.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletWXCreditOpenNotifyUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletWXCreditOpenNotifyUI$1(WalletWXCreditOpenNotifyUI paramWalletWXCreditOpenNotifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(48740);
    this.uZD.setResult(-1);
    this.uZD.finish();
    AppMethodBeat.o(48740);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtSimpleCheckPwdUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletLqtSimpleCheckPwdUI$1(WalletLqtSimpleCheckPwdUI paramWalletLqtSimpleCheckPwdUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45709);
    this.tlc.finish();
    AppMethodBeat.o(45709);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI.1
 * JD-Core Version:    0.6.2
 */
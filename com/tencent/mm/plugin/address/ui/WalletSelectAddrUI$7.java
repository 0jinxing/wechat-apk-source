package com.tencent.mm.plugin.address.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSelectAddrUI$7
  implements MenuItem.OnMenuItemClickListener
{
  WalletSelectAddrUI$7(WalletSelectAddrUI paramWalletSelectAddrUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(16984);
    this.gLk.setResult(0);
    this.gLk.finish();
    AppMethodBeat.o(16984);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.7
 * JD-Core Version:    0.6.2
 */
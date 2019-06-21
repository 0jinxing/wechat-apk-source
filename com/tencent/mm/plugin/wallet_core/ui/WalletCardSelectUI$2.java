package com.tencent.mm.plugin.wallet_core.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletCardSelectUI$2
  implements MenuItem.OnMenuItemClickListener
{
  WalletCardSelectUI$2(WalletCardSelectUI paramWalletCardSelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(47297);
    this.tGH.finish();
    AppMethodBeat.o(47297);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet_core.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletVerifyIdCardUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletVerifyIdCardUI$1(WalletVerifyIdCardUI paramWalletVerifyIdCardUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(47718);
    this.tLt.finish();
    AppMethodBeat.o(47718);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI.1
 * JD-Core Version:    0.6.2
 */
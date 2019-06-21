package com.tencent.mm.plugin.wxcredit.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletWXCreditDetailUI$2
  implements MenuItem.OnMenuItemClickListener
{
  WalletWXCreditDetailUI$2(WalletWXCreditDetailUI paramWalletWXCreditDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(48721);
    this.uZx.aqX();
    this.uZx.finish();
    AppMethodBeat.o(48721);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI.2
 * JD-Core Version:    0.6.2
 */
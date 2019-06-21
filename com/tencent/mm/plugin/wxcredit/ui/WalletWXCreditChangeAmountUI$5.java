package com.tencent.mm.plugin.wxcredit.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletWXCreditChangeAmountUI$5
  implements MenuItem.OnMenuItemClickListener
{
  WalletWXCreditChangeAmountUI$5(WalletWXCreditChangeAmountUI paramWalletWXCreditChangeAmountUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(48693);
    this.uZr.aqX();
    this.uZr.showDialog(3);
    AppMethodBeat.o(48693);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.5
 * JD-Core Version:    0.6.2
 */
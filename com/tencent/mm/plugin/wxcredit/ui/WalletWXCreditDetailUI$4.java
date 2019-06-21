package com.tencent.mm.plugin.wxcredit.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.List;

final class WalletWXCreditDetailUI$4
  implements MenuItem.OnMenuItemClickListener
{
  WalletWXCreditDetailUI$4(WalletWXCreditDetailUI paramWalletWXCreditDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(48724);
    paramMenuItem = new ArrayList();
    r.cPI();
    WalletWXCreditDetailUI.a(this.uZx);
    h.a(this.uZx, null, (String[])paramMenuItem.toArray(new String[paramMenuItem.size()]), this.uZx.getString(2131304856), false, new WalletWXCreditDetailUI.4.1(this));
    AppMethodBeat.o(48724);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI.4
 * JD-Core Version:    0.6.2
 */
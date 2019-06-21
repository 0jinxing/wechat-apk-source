package com.tencent.mm.plugin.wallet.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.List;

final class WalletBankcardDetailUI$5
  implements MenuItem.OnMenuItemClickListener
{
  WalletBankcardDetailUI$5(WalletBankcardDetailUI paramWalletBankcardDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45745);
    s.cNC();
    paramMenuItem = s.cND().cQB();
    if ((paramMenuItem != null) && (paramMenuItem.size() > 1))
    {
      s.cNC();
      s.cND();
    }
    paramMenuItem = new ArrayList();
    h.a(this.tlK, null, (String[])paramMenuItem.toArray(new String[paramMenuItem.size()]), this.tlK.getString(2131304856), false, new WalletBankcardDetailUI.5.1(this));
    AppMethodBeat.o(45745);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.5
 * JD-Core Version:    0.6.2
 */
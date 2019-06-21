package com.tencent.mm.plugin.wallet.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class WalletBankcardManageUI$3
  implements MenuItem.OnMenuItemClickListener
{
  WalletBankcardManageUI$3(WalletBankcardManageUI paramWalletBankcardManageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45765);
    this.tlZ.finish();
    h.pYm.e(14422, new Object[] { Integer.valueOf(4) });
    AppMethodBeat.o(45765);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.3
 * JD-Core Version:    0.6.2
 */
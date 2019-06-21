package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class WalletBalanceManagerUI$3
  implements MenuItem.OnMenuItemClickListener
{
  WalletBalanceManagerUI$3(WalletBalanceManagerUI paramWalletBalanceManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45429);
    paramMenuItem = new Intent();
    if (!bo.isNullOrNil(this.thC.thy.twW))
    {
      ab.i("MicroMsg.WalletBalanceManagerUI", "carson: entry_url: %s", new Object[] { this.thC.thy.twW });
      paramMenuItem.putExtra("rawUrl", this.thC.thy.twW);
    }
    while (true)
    {
      paramMenuItem.putExtra("showShare", false);
      paramMenuItem.putExtra("geta8key_username", r.Yz());
      paramMenuItem.putExtra("KPublisherId", "pay_blance_list");
      paramMenuItem.putExtra("geta8key_scene", 33);
      d.b(this.thC, "webview", ".ui.tools.WebViewUI", paramMenuItem);
      e.QS(16);
      h.pYm.e(16503, new Object[] { Integer.valueOf(1), "balanceBill" });
      AppMethodBeat.o(45429);
      return true;
      paramMenuItem.putExtra("rawUrl", this.thC.thy.twV);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.3
 * JD-Core Version:    0.6.2
 */
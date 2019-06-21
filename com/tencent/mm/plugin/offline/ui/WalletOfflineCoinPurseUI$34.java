package com.tencent.mm.plugin.offline.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gq;

final class WalletOfflineCoinPurseUI$34
  implements MenuItem.OnMenuItemClickListener
{
  WalletOfflineCoinPurseUI$34(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(43544);
    paramMenuItem = new gq();
    paramMenuItem.cBo.cBp = "ok";
    com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
    if (WalletOfflineCoinPurseUI.c(this.pav) == 8)
      com.tencent.mm.plugin.offline.c.a.Up(this.pav.getIntent().getStringExtra("key_appid"));
    this.pav.finish();
    AppMethodBeat.o(43544);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.34
 * JD-Core Version:    0.6.2
 */
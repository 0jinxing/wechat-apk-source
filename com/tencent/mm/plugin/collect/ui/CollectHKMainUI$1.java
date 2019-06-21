package com.tencent.mm.plugin.collect.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class CollectHKMainUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CollectHKMainUI$1(CollectHKMainUI paramCollectHKMainUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(41243);
    e.n(this.kGh.mController.ylL, "https://hkwallet.moneydata.hk/hybrid/www/weixin/f2f/zh_hk/faq.shtml", true);
    AppMethodBeat.o(41243);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectHKMainUI.1
 * JD-Core Version:    0.6.2
 */
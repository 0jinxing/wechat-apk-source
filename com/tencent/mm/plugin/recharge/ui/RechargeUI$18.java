package com.tencent.mm.plugin.recharge.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class RechargeUI$18
  implements MenuItem.OnMenuItemClickListener
{
  RechargeUI$18(RechargeUI paramRechargeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44324);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("rawUrl", RechargeUI.j(this.pHV));
    d.b(this.pHV, "webview", ".ui.tools.WebViewUI", paramMenuItem);
    AppMethodBeat.o(44324);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.18
 * JD-Core Version:    0.6.2
 */
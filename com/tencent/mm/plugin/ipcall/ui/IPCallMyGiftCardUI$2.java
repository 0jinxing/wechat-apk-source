package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class IPCallMyGiftCardUI$2
  implements MenuItem.OnMenuItemClickListener
{
  IPCallMyGiftCardUI$2(IPCallMyGiftCardUI paramIPCallMyGiftCardUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22210);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("rawUrl", this.nDz.getString(2131300727));
    paramMenuItem.putExtra("showShare", false);
    d.b(this.nDz, "webview", ".ui.tools.WebViewUI", paramMenuItem);
    AppMethodBeat.o(22210);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI.2
 * JD-Core Version:    0.6.2
 */
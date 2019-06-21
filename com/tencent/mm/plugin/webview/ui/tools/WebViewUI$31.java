package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewUI$31
  implements MenuItem.OnMenuItemClickListener
{
  WebViewUI$31(WebViewUI paramWebViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7852);
    paramMenuItem = new Intent();
    paramMenuItem.setClassName(this.uxp, "com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI");
    paramMenuItem.putExtra("entry_fix_tools", 1);
    this.uxp.startActivity(paramMenuItem);
    AppMethodBeat.o(7852);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.31
 * JD-Core Version:    0.6.2
 */
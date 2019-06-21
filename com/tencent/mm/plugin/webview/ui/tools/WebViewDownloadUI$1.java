package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewDownloadUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WebViewDownloadUI$1(WebViewDownloadUI paramWebViewDownloadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7592);
    this.utk.finish();
    AppMethodBeat.o(7592);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.1
 * JD-Core Version:    0.6.2
 */
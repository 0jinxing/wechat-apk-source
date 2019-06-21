package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewUI$21
  implements MenuItem.OnMenuItemClickListener
{
  WebViewUI$21(WebViewUI paramWebViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7841);
    this.uxp.aqX();
    this.uxp.daC();
    ab.i("MicroMsg.WebViewUI", "on back btn press");
    AppMethodBeat.o(7841);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.21
 * JD-Core Version:    0.6.2
 */
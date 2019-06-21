package com.tencent.mm.plugin.webview.ui.tools;

import android.os.RemoteException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewUI$9
  implements MenuItem.OnMenuItemClickListener
{
  WebViewUI$9(WebViewUI paramWebViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7816);
    try
    {
      paramMenuItem = this.uxp.icy.afp(null);
      this.uxp.loadUrl(paramMenuItem);
      AppMethodBeat.o(7816);
      return false;
    }
    catch (RemoteException paramMenuItem)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WebViewUI", paramMenuItem, "[oneliang]feedback exception:%s", new Object[] { paramMenuItem.getMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.9
 * JD-Core Version:    0.6.2
 */
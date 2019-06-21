package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;

final class OAuthUI$6
  implements MenuItem.OnMenuItemClickListener
{
  OAuthUI$6(OAuthUI paramOAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7422);
    if (OAuthUI.b(this.urX) != null)
      OAuthUI.b(this.urX);
    this.urX.pzf.stopLoading();
    this.urX.X(false, false);
    OAuthUI.c(this.urX);
    AppMethodBeat.o(7422);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OAuthUI.6
 * JD-Core Version:    0.6.2
 */
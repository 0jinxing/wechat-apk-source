package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class OAuthUI$5
  implements MenuItem.OnMenuItemClickListener
{
  OAuthUI$5(OAuthUI paramOAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7421);
    OAuthUI.a(this.urX);
    this.urX.finish();
    AppMethodBeat.o(7421);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OAuthUI.5
 * JD-Core Version:    0.6.2
 */
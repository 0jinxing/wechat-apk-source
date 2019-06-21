package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareToQQWeiboUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ShareToQQWeiboUI$1(ShareToQQWeiboUI paramShareToQQWeiboUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(9840);
    this.uIX.aqX();
    this.uIX.finish();
    AppMethodBeat.o(9840);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI.1
 * JD-Core Version:    0.6.2
 */
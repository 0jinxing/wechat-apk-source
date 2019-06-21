package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.b;

final class i$2
  implements MenuItem.OnMenuItemClickListener
{
  i$2(i parami, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7628);
    try
    {
      boolean bool = this.utx.cZv().icy.isSDCardAvailable();
      WebViewUI localWebViewUI = this.utx.cZv();
      paramMenuItem = this.icQ;
      String str = b.dTR().getCookie(this.icQ);
      i.2.1 local1 = new com/tencent/mm/plugin/webview/ui/tools/i$2$1;
      local1.<init>(this);
      u.a(localWebViewUI, paramMenuItem, str, bool, local1);
      AppMethodBeat.o(7628);
      return true;
    }
    catch (Exception paramMenuItem)
    {
      while (true)
        ab.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + paramMenuItem.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.i.2
 * JD-Core Version:    0.6.2
 */
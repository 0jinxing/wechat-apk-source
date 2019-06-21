package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.b;

final class i$3
  implements MenuItem.OnMenuItemClickListener
{
  i$3(i parami, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7629);
    try
    {
      bool = this.utx.cZv().icy.isSDCardAvailable();
    }
    catch (Exception paramMenuItem)
    {
      try
      {
        while (true)
        {
          u.a(this.utx.cZv(), this.icQ, b.dTR().getCookie(this.icQ), bool);
          AppMethodBeat.o(7629);
          return true;
          paramMenuItem = paramMenuItem;
          ab.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + paramMenuItem.getMessage());
          boolean bool = false;
        }
      }
      catch (Exception paramMenuItem)
      {
        while (true)
          ab.e("MicroMsg.WebViewLongClickHelper", "save to sdcard failed : %s", new Object[] { paramMenuItem.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.i.3
 * JD-Core Version:    0.6.2
 */
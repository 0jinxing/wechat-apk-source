package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.content.Context;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.b;

final class e$5
  implements MenuItem.OnMenuItemClickListener
{
  e$5(e parame, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17033);
    try
    {
      boolean bool = e.i(this.icM).isSDCardAvailable();
      paramMenuItem = this.icQ.replaceAll("tp=webp", "");
      Context localContext = e.g(this.icM);
      String str = b.dTR().getCookie(paramMenuItem);
      e.5.1 local1 = new com/tencent/mm/plugin/appbrand/jsapi/t/e$5$1;
      local1.<init>(this);
      u.a(localContext, paramMenuItem, str, bool, local1);
      AppMethodBeat.o(17033);
      return true;
    }
    catch (Exception paramMenuItem)
    {
      while (true)
        ab.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onMenuItemClick fail, ex = " + paramMenuItem.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e.5
 * JD-Core Version:    0.6.2
 */
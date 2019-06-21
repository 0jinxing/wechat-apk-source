package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.content.Context;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.pluginsdk.ui.tools.u.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.b;

final class e$3
  implements MenuItem.OnMenuItemClickListener
{
  e$3(e parame, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17030);
    try
    {
      boolean bool = e.i(this.icM).isSDCardAvailable();
      Context localContext = e.g(this.icM);
      String str = this.icQ;
      paramMenuItem = b.dTR().getCookie(this.icQ);
      u.a local1 = new com/tencent/mm/plugin/appbrand/jsapi/t/e$3$1;
      local1.<init>(this);
      u.a(localContext, str, paramMenuItem, bool, local1);
      AppMethodBeat.o(17030);
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
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e.3
 * JD-Core Version:    0.6.2
 */
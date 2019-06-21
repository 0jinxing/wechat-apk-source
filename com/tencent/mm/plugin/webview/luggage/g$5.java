package com.tencent.mm.plugin.webview.luggage;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.b;

final class g$5
  implements MenuItem.OnMenuItemClickListener
{
  g$5(g paramg, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(6126);
    try
    {
      u.a(g.a(this.uiJ).mContext, this.icQ, b.dTR().getCookie(this.icQ), f.Mn());
      AppMethodBeat.o(6126);
      return true;
    }
    catch (Exception paramMenuItem)
    {
      while (true)
        ab.e("MicroMsg.GameWebViewMenuListHelper", "save to sdcard failed : %s", new Object[] { paramMenuItem.getMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.5
 * JD-Core Version:    0.6.2
 */
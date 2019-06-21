package com.tencent.mm.plugin.webview.luggage;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.xweb.b;

final class g$6
  implements MenuItem.OnMenuItemClickListener
{
  g$6(g paramg, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(6128);
    paramMenuItem = this.icQ.replaceAll("tp=webp", "");
    u.a(g.a(this.uiJ).mContext, paramMenuItem, b.dTR().getCookie(paramMenuItem), f.Mn(), new g.6.1(this));
    AppMethodBeat.o(6128);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.6
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.webview.luggage;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.xweb.b;

final class g$4
  implements MenuItem.OnMenuItemClickListener
{
  g$4(g paramg, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(6125);
    u.a(g.a(this.uiJ).mContext, this.icQ, b.dTR().getCookie(this.icQ), f.Mn(), new g.4.1(this));
    AppMethodBeat.o(6125);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.4
 * JD-Core Version:    0.6.2
 */
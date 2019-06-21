package com.tencent.mm.plugin.webview.luggage;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.ipc.b;
import com.tencent.mm.sdk.platformtools.ab;

final class g$7
  implements MenuItem.OnMenuItemClickListener
{
  g$7(g paramg, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(6129);
    ab.i("MicroMsg.GameWebViewMenuListHelper", "onMenuItemClick recognize qbcode");
    paramMenuItem = new Bundle();
    paramMenuItem.putString("result", this.icT);
    paramMenuItem.putString("url", g.b(this.uiJ));
    paramMenuItem.putInt("codeType", this.uiJ.icC);
    paramMenuItem.putInt("codeVersion", this.uiJ.icD);
    b.a(g.a(this.uiJ).mContext, paramMenuItem, g.d.class);
    AppMethodBeat.o(6129);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.7
 * JD-Core Version:    0.6.2
 */
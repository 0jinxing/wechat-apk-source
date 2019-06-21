package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;

final class j$4
  implements n.d
{
  j$4(j paramj)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(7645);
    this.utN.afF(paramMenuItem.getTitle().toString());
    AppMethodBeat.o(7645);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.4
 * JD-Core Version:    0.6.2
 */
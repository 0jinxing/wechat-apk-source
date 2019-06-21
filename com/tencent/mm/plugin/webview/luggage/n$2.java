package com.tencent.mm.plugin.webview.luggage;

import android.view.MenuItem;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.b.l;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.d;

final class n$2
  implements n.d
{
  n$2(n paramn)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(6220);
    n localn = this.ujt;
    localn.ujb.a(localn.uiI.mContext, localn.uiI, paramMenuItem);
    this.ujt.ujs.cpE();
    AppMethodBeat.o(6220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.n.2
 * JD-Core Version:    0.6.2
 */
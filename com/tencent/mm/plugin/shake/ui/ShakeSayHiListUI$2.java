package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.storage.bu;
import com.tencent.mm.ui.base.n.d;

final class ShakeSayHiListUI$2
  implements n.d
{
  ShakeSayHiListUI$2(ShakeSayHiListUI paramShakeSayHiListUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(24874);
    d.akR().QT(String.valueOf(ShakeSayHiListUI.g(this.qwt)));
    ShakeSayHiListUI.b(this.qwt).a(null, null);
    AppMethodBeat.o(24874);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.2
 * JD-Core Version:    0.6.2
 */
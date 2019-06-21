package com.tencent.mm.plugin.nearby.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.ui.base.n.d;

final class NearbySayHiListUI$3
  implements n.d
{
  NearbySayHiListUI$3(NearbySayHiListUI paramNearbySayHiListUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(55495);
    g.RN().QU();
    ((j)g.K(j.class)).bOo().QT(String.valueOf(NearbySayHiListUI.h(this.oQP)));
    NearbySayHiListUI.b(this.oQP).a(null, null);
    if (NearbySayHiListUI.c(this.oQP) > 0)
      NearbySayHiListUI.i(this.oQP);
    NearbySayHiListUI.j(this.oQP);
    AppMethodBeat.o(55495);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.3
 * JD-Core Version:    0.6.2
 */
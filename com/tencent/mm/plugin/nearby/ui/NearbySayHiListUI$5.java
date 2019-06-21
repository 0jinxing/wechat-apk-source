package com.tencent.mm.plugin.nearby.ui;

import android.content.res.Resources;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class NearbySayHiListUI$5
  implements MenuItem.OnMenuItemClickListener
{
  NearbySayHiListUI$5(NearbySayHiListUI paramNearbySayHiListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55498);
    h.a(this.oQP.mController.ylL, true, this.oQP.getResources().getString(2131302715), "", this.oQP.getResources().getString(2131302714), this.oQP.getString(2131296868), new NearbySayHiListUI.5.1(this), null);
    AppMethodBeat.o(55498);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.5
 * JD-Core Version:    0.6.2
 */
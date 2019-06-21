package com.tencent.mm.plugin.nearby.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearbySayHiListUI$12
  implements MenuItem.OnMenuItemClickListener
{
  NearbySayHiListUI$12(NearbySayHiListUI paramNearbySayHiListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55506);
    this.oQP.aqX();
    this.oQP.setResult(0);
    this.oQP.finish();
    AppMethodBeat.o(55506);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.12
 * JD-Core Version:    0.6.2
 */
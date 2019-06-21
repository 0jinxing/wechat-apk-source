package com.tencent.mm.plugin.aa.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class AAQueryListUI$4
  implements MenuItem.OnMenuItemClickListener
{
  AAQueryListUI$4(AAQueryListUI paramAAQueryListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(40733);
    paramMenuItem = new d(this.gnt, 1, false);
    paramMenuItem.rBl = new AAQueryListUI.4.1(this);
    paramMenuItem.rBm = new AAQueryListUI.4.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(40733);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAQueryListUI.4
 * JD-Core Version:    0.6.2
 */
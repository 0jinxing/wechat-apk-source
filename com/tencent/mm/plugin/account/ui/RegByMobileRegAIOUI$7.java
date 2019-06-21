package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByMobileRegAIOUI$7
  implements MenuItem.OnMenuItemClickListener
{
  RegByMobileRegAIOUI$7(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125346);
    this.gGd.aqX();
    RegByMobileRegAIOUI.m(this.gGd);
    this.gGd.finish();
    AppMethodBeat.o(125346);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.7
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.welab.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WelabMainUI$2
  implements MenuItem.OnMenuItemClickListener
{
  WelabMainUI$2(WelabMainUI paramWelabMainUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(80616);
    this.uMC.aqX();
    this.uMC.finish();
    AppMethodBeat.o(80616);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.ui.WelabMainUI.2
 * JD-Core Version:    0.6.2
 */
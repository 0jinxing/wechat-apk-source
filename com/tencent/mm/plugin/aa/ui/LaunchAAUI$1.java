package com.tencent.mm.plugin.aa.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LaunchAAUI$1
  implements MenuItem.OnMenuItemClickListener
{
  LaunchAAUI$1(LaunchAAUI paramLaunchAAUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(40824);
    this.gpj.finish();
    AppMethodBeat.o(40824);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAUI.1
 * JD-Core Version:    0.6.2
 */
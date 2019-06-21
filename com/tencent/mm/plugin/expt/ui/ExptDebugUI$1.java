package com.tencent.mm.plugin.expt.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExptDebugUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ExptDebugUI$1(ExptDebugUI paramExptDebugUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(73632);
    this.lPd.finish();
    AppMethodBeat.o(73632);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.ui.ExptDebugUI.1
 * JD-Core Version:    0.6.2
 */
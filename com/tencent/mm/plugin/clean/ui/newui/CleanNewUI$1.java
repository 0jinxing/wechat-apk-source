package com.tencent.mm.plugin.clean.ui.newui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CleanNewUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CleanNewUI$1(CleanNewUI paramCleanNewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(18911);
    this.kyW.finish();
    AppMethodBeat.o(18911);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanNewUI.1
 * JD-Core Version:    0.6.2
 */
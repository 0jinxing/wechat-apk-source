package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TVInfoUI$4
  implements MenuItem.OnMenuItemClickListener
{
  TVInfoUI$4(TVInfoUI paramTVInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24913);
    this.qwG.finish();
    AppMethodBeat.o(24913);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.TVInfoUI.4
 * JD-Core Version:    0.6.2
 */
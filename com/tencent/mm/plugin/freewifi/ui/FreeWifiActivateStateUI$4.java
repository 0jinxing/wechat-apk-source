package com.tencent.mm.plugin.freewifi.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiActivateStateUI$4
  implements MenuItem.OnMenuItemClickListener
{
  FreeWifiActivateStateUI$4(FreeWifiActivateStateUI paramFreeWifiActivateStateUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(20902);
    FreeWifiActivateStateUI.c(this.myd);
    AppMethodBeat.o(20902);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateStateUI.4
 * JD-Core Version:    0.6.2
 */
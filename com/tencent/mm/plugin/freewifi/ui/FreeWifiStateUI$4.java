package com.tencent.mm.plugin.freewifi.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiStateUI$4
  implements MenuItem.OnMenuItemClickListener
{
  FreeWifiStateUI$4(FreeWifiStateUI paramFreeWifiStateUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(21074);
    FreeWifiStateUI.c(this.mAc);
    AppMethodBeat.o(21074);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiStateUI.4
 * JD-Core Version:    0.6.2
 */
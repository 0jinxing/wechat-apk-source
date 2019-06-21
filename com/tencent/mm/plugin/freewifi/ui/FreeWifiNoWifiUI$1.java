package com.tencent.mm.plugin.freewifi.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiNoWifiUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FreeWifiNoWifiUI$1(FreeWifiNoWifiUI paramFreeWifiNoWifiUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(21057);
    this.mzR.finish();
    AppMethodBeat.o(21057);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNoWifiUI.1
 * JD-Core Version:    0.6.2
 */
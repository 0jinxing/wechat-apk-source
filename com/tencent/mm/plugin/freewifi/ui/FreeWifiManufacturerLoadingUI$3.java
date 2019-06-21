package com.tencent.mm.plugin.freewifi.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiManufacturerLoadingUI$3
  implements MenuItem.OnMenuItemClickListener
{
  FreeWifiManufacturerLoadingUI$3(FreeWifiManufacturerLoadingUI paramFreeWifiManufacturerLoadingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(21011);
    this.mzG.finish();
    AppMethodBeat.o(21011);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiManufacturerLoadingUI.3
 * JD-Core Version:    0.6.2
 */
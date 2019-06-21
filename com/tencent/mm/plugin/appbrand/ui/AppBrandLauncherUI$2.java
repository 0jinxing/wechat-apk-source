package com.tencent.mm.plugin.appbrand.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandLauncherUI$2
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandLauncherUI$2(AppBrandLauncherUI paramAppBrandLauncherUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(132971);
    this.iGN.onBackPressed();
    AppMethodBeat.o(132971);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandNearbyEmptyUI$1
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandNearbyEmptyUI$1(AppBrandNearbyEmptyUI paramAppBrandNearbyEmptyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(132992);
    this.iGW.onBackPressed();
    AppMethodBeat.o(132992);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI.1
 * JD-Core Version:    0.6.2
 */
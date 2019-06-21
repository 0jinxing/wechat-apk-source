package com.tencent.mm.plugin.appbrand.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrand404PageUI$2
  implements MenuItem.OnMenuItemClickListener
{
  AppBrand404PageUI$2(AppBrand404PageUI paramAppBrand404PageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(132883);
    this.iFA.finish();
    AppMethodBeat.o(132883);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI.2
 * JD-Core Version:    0.6.2
 */
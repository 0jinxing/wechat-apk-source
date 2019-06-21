package com.tencent.mm.plugin.appbrand.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandProfileUI$1
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandProfileUI$1(AppBrandProfileUI paramAppBrandProfileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(133025);
    this.iIf.onBackPressed();
    AppMethodBeat.o(133025);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.1
 * JD-Core Version:    0.6.2
 */
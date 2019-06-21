package com.tencent.mm.plugin.appbrand.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandAuthorizeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandAuthorizeUI$1(AppBrandAuthorizeUI paramAppBrandAuthorizeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(132892);
    AppBrandAuthorizeUI.a(this.iFJ);
    this.iFJ.finish();
    AppMethodBeat.o(132892);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.1
 * JD-Core Version:    0.6.2
 */
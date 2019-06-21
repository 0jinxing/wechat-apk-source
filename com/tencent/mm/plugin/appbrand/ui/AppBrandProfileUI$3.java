package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.config.u;
import com.tencent.mm.plugin.appbrand.ui.collection.h;
import com.tencent.mm.plugin.appbrand.v;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;

final class AppBrandProfileUI$3
  implements n.d
{
  AppBrandProfileUI$3(AppBrandProfileUI paramAppBrandProfileUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(133027);
    switch (paramMenuItem.getItemId())
    {
    case 3:
    default:
    case 2:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(133027);
      while (true)
      {
        return;
        paramMenuItem = new Intent(this.iIf, AppBrandAuthorizeUI.class).putExtra("key_username", AppBrandProfileUI.d(this.iIf));
        d.b(this.iIf, "appbrand", ".ui.AppBrandAuthorizeUI", paramMenuItem);
        AppBrandProfileUI.a(this.iIf, 10, 1);
        AppMethodBeat.o(133027);
      }
      boolean bool1 = ((af)g.K(af.class)).aB(AppBrandProfileUI.d(this.iIf), 0);
      boolean bool2 = h.a(bool1, this.iIf, AppBrandProfileUI.d(this.iIf), 0);
      if (bool1)
      {
        paramInt = 12;
        label149: if (!bool2)
          break label181;
      }
      label181: for (int i = 1; ; i = 2)
      {
        AppBrandProfileUI.a(this.iIf, paramInt, i);
        AppMethodBeat.o(133027);
        break;
        paramInt = 11;
        break label149;
      }
      if ((AppBrandProfileUI.e(this.iIf) != null) && (!bo.isNullOrNil(AppBrandProfileUI.e(this.iIf).appId)))
      {
        d.b(this.iIf, "webview", ".ui.tools.WebViewUI", new Intent().putExtra("rawUrl", v.xg(AppBrandProfileUI.e(this.iIf).appId)).putExtra("forceHideShare", true));
        AppBrandProfileUI.a(this.iIf, 16, 1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.v;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandProfileUI$19
  implements View.OnClickListener
{
  AppBrandProfileUI$19(AppBrandProfileUI paramAppBrandProfileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133044);
    if (AppBrandProfileUI.c(this.iIf) == null)
    {
      ab.e("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "wxaExposedParams is null");
      AppMethodBeat.o(133044);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      String str = v.a(AppBrandProfileUI.c(this.iIf));
      ab.i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "feedbackUrl:%s, wxaExposedParams:%s", new Object[] { str, AppBrandProfileUI.c(this.iIf).toString() });
      localIntent.putExtra("title", paramView.getContext().getString(2131296785));
      localIntent.putExtra("rawUrl", str);
      localIntent.putExtra("forceHideShare", true);
      d.b(this.iIf, "webview", ".ui.tools.WebViewUI", localIntent);
      AppBrandProfileUI.a(this.iIf, 20, 1);
      AppMethodBeat.o(133044);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.19
 * JD-Core Version:    0.6.2
 */
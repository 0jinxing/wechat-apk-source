package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.config.u;
import com.tencent.mm.plugin.appbrand.v;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.URISyntaxException;

final class AppBrandProfileUI$6
  implements View.OnClickListener
{
  AppBrandProfileUI$6(AppBrandProfileUI paramAppBrandProfileUI, u paramu)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133031);
    try
    {
      Object localObject = this.iIh.hgE;
      paramView = new java/lang/StringBuilder;
      paramView.<init>("appid=");
      paramView = v.bp((String)localObject, AppBrandProfileUI.c(this.iIf).appId);
      localObject = new android/content/Intent;
      ((Intent)localObject).<init>();
      paramView = ((Intent)localObject).putExtra("rawUrl", paramView).putExtra("forceHideShare", true);
      d.b(this.iIf, "webview", ".ui.tools.WebViewUI", paramView);
      AppBrandProfileUI.a(this.iIf, 21, 1);
      AppMethodBeat.o(133031);
      return;
    }
    catch (URISyntaxException paramView)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.Profile.AppBrandProfileUI", paramView, "URISyntaxException with originalRedirectUrl %s", new Object[] { this.iIh.hgE });
        AppMethodBeat.o(133031);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.6
 * JD-Core Version:    0.6.2
 */
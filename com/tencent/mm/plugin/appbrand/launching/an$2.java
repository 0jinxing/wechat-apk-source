package com.tencent.mm.plugin.appbrand.launching;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil.a;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class an$2
  implements OpenBusinessViewUtil.a
{
  an$2(an paraman, String paramString1, String paramString2, String paramString3, int paramInt1, Context paramContext, int paramInt2)
  {
  }

  public final void R(int paramInt, String paramString)
  {
    AppMethodBeat.i(132002);
    ab.e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch fail, CGI errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    an.b(this.iiS);
    OpenBusinessViewUtil.p(this.iiR, null, -2);
    AppMethodBeat.o(132002);
  }

  public final void ce(String paramString1, String paramString2)
  {
    AppMethodBeat.i(132001);
    an.b(this.iiS);
    if (an.c(this.iiS))
      AppMethodBeat.o(132001);
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString1))
      {
        ab.e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, invalid businessType");
        OpenBusinessViewUtil.p(this.iiR, null, -4);
        AppMethodBeat.o(132001);
      }
      else
      {
        AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
        localAppBrandStatObject.scene = 1055;
        localAppBrandStatObject.cst = (q.encode(bo.nullAsNil(this.iiT)) + ":" + this.iiU + ":" + this.iiV);
        AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
        localAppBrandLaunchReferrer.appId = this.iiU;
        localAppBrandLaunchReferrer.hgQ = 2;
        localAppBrandLaunchReferrer.url = this.iiT;
        localAppBrandLaunchReferrer.businessType = this.iiR;
        localAppBrandLaunchReferrer.cvp = 5;
        if (AppBrandLaunchProxyUI.a(this.val$context, null, paramString1, paramString2, this.hjh, -1, localAppBrandStatObject, localAppBrandLaunchReferrer, null))
        {
          n.xb(paramString1).gPl = false;
          n.xb(paramString1).gPn = false;
          n.xb(paramString1).gPm = false;
          ab.i("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch success");
          AppMethodBeat.o(132001);
        }
        else
        {
          ab.e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch fail");
          OpenBusinessViewUtil.p(this.iiR, null, -1);
          AppMethodBeat.o(132001);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.an.2
 * JD-Core Version:    0.6.2
 */
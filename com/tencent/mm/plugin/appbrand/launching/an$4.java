package com.tencent.mm.plugin.appbrand.launching;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil.a;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class an$4
  implements OpenBusinessViewUtil.a
{
  an$4(an paraman, String paramString1, String paramString2, Context paramContext, int paramInt)
  {
  }

  public final void R(int paramInt, String paramString)
  {
    AppMethodBeat.i(132005);
    ab.e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch fail, CGI errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    an.b(this.iiS);
    OpenBusinessViewUtil.o(this.iiU, this.iiR, -3);
    AppMethodBeat.o(132005);
  }

  public final void ce(String paramString1, String paramString2)
  {
    AppMethodBeat.i(132004);
    an.b(this.iiS);
    if (an.c(this.iiS))
      AppMethodBeat.o(132004);
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString1))
      {
        ab.e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, invalid businessType");
        OpenBusinessViewUtil.o(this.iiU, this.iiR, -3);
        AppMethodBeat.o(132004);
      }
      else
      {
        AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
        localAppBrandStatObject.scene = 1069;
        localAppBrandStatObject.cst = this.iiU;
        AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
        localAppBrandLaunchReferrer.appId = this.iiU;
        localAppBrandLaunchReferrer.hgQ = 4;
        localAppBrandLaunchReferrer.businessType = this.iiR;
        localAppBrandLaunchReferrer.cvp = 5;
        if (AppBrandLaunchProxyUI.a(this.val$context, null, paramString1, paramString2, this.hjh, -1, localAppBrandStatObject, localAppBrandLaunchReferrer, null))
        {
          n.xb(paramString1).gPl = false;
          n.xb(paramString1).gPn = false;
          n.xb(paramString1).gPm = false;
          ab.i("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch success");
          AppMethodBeat.o(132004);
        }
        else
        {
          ab.e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch fail");
          OpenBusinessViewUtil.o(this.iiU, this.iiR, -3);
          AppMethodBeat.o(132004);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.an.4
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class b extends e
{
  public final String a(h paramh, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(131027);
    if ((paramh.getRuntime() instanceof o))
    {
      o localo = (o)paramh.getRuntime();
      AppBrandLaunchReferrer localAppBrandLaunchReferrer = localo.atI().hgF;
      if ((localAppBrandLaunchReferrer != null) && (localAppBrandLaunchReferrer.hgQ == 1) && (OpenBusinessViewUtil.l(localo)))
      {
        String str = paramJSONObject.optString("extraData");
        ab.i("MicroMsg.JsApiNavigateBackMiniProgramWC", "navigate back MiniProgram, businessType:%s", new Object[] { localAppBrandLaunchReferrer.businessType });
        OpenBusinessViewUtil.k(localAppBrandLaunchReferrer.businessType, d.hJv.errCode, str);
        n.xb(paramh.getAppId()).gPm = true;
      }
      OpenBusinessViewUtil.m(localo);
    }
    paramh = super.a(paramh, paramJSONObject);
    AppMethodBeat.o(131027);
    return paramh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.fakenative.b
 * JD-Core Version:    0.6.2
 */
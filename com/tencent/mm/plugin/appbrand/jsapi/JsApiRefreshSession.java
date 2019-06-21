package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import org.json.JSONObject;

public final class JsApiRefreshSession extends a
{
  private static final int CTRL_INDEX = 118;
  private static final String NAME = "refreshSession";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130553);
    paramJSONObject = new JsApiRefreshSession.RefreshSessionTask();
    Object localObject = (h)paramc.aa(h.class);
    if (localObject != null)
      JsApiRefreshSession.RefreshSessionTask.a(paramJSONObject, ((h)localObject).hhd.gVt);
    localObject = paramc.getAppId();
    paramJSONObject.hwj = this;
    paramJSONObject.hxS = paramc;
    paramJSONObject.hwi = paramInt;
    paramJSONObject.appId = ((String)localObject);
    paramc = com.tencent.mm.plugin.appbrand.a.wK((String)localObject);
    if (paramc != null)
      paramJSONObject.hyE = paramc.scene;
    paramJSONObject.aBV();
    AppBrandMainProcessService.a(paramJSONObject);
    AppMethodBeat.o(130553);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession
 * JD-Core Version:    0.6.2
 */
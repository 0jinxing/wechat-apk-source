package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsApiLogin extends f
{
  public static final int CTRL_INDEX = 52;
  public static final String NAME = "login";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.h paramh, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130872);
    try
    {
      if (!paramJSONObject.has("requestInQueue"))
        paramJSONObject.put("requestInQueue", false);
      super.a(paramh, paramJSONObject, paramInt);
      AppMethodBeat.o(130872);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.JsApiLogin", "invoke put KEY_IN_QUEUE e=%s", new Object[] { localJSONException.getMessage() });
    }
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.h paramh, JSONObject paramJSONObject, int paramInt, d paramd)
  {
    AppMethodBeat.i(130873);
    JsApiLogin.LoginTask localLoginTask = new JsApiLogin.LoginTask();
    localLoginTask.appId = paramh.getAppId();
    localLoginTask.hBU = "login";
    Object localObject = paramh.getRuntime().ye();
    if (localObject != null)
      localLoginTask.har = ((com.tencent.mm.plugin.appbrand.config.h)localObject).hhd.gVt;
    localObject = a.wK(paramh.getAppId());
    if (localObject != null)
      localLoginTask.hyE = ((AppBrandStatObject)localObject).scene;
    paramJSONObject = paramJSONObject.toString();
    localLoginTask.hBQ = this;
    localLoginTask.hBR = paramh;
    localLoginTask.data = paramJSONObject;
    localLoginTask.hwi = paramInt;
    localLoginTask.hBS = paramd;
    localLoginTask.hCe = new Bundle();
    if ((paramh instanceof q))
      localLoginTask.hCf = 1;
    while (true)
    {
      localLoginTask.aBV();
      AppBrandMainProcessService.a(localLoginTask);
      AppMethodBeat.o(130873);
      return;
      if ((paramh instanceof u))
        localLoginTask.hCf = 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class JsApiOperateWXData extends f
{
  public static final int CTRL_INDEX = 79;
  public static final String NAME = "operateWXData";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.h paramh, JSONObject paramJSONObject, int paramInt, d paramd)
  {
    AppMethodBeat.i(130895);
    try
    {
      String str = paramJSONObject.getString("data");
      paramJSONObject = new JsApiOperateWXData.OperateWXDataTask();
      paramJSONObject.appId = paramh.getAppId();
      paramJSONObject.hBU = "operateWXData";
      com.tencent.mm.plugin.appbrand.config.h localh = paramh.getRuntime().ye();
      if (localh != null)
        paramJSONObject.har = localh.hhd.gVt;
      paramJSONObject.hBQ = this;
      paramJSONObject.hBR = paramh;
      paramJSONObject.hCo = str;
      paramJSONObject.hwi = paramInt;
      paramJSONObject.hBS = paramd;
      paramJSONObject.hCe = new Bundle();
      paramd = a.wK(paramJSONObject.appId);
      if (paramd != null)
        paramJSONObject.hyE = paramd.scene;
      if ((paramh instanceof q))
      {
        paramJSONObject.hCf = 1;
        paramJSONObject.aBV();
        AppBrandMainProcessService.a(paramJSONObject);
        AppMethodBeat.o(130895);
        return;
      }
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiOperateWXData", "Exception %s", new Object[] { paramJSONObject.getMessage() });
        paramh.M(paramInt, j("fail", null));
        AppMethodBeat.o(130895);
        continue;
        if ((paramh instanceof u))
          paramJSONObject.hCf = 2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData
 * JD-Core Version:    0.6.2
 */
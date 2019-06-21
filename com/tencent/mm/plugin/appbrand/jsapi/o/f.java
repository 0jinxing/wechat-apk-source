package com.tencent.mm.plugin.appbrand.jsapi.o;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

public class f extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 63;
  public static final String NAME = "reportKeyValue";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131431);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("dataArray");
    if (localJSONArray == null)
    {
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(131431);
    }
    while (true)
    {
      return;
      int i = paramJSONObject.optInt("version", -1);
      paramJSONObject = (com.tencent.mm.plugin.appbrand.config.h)paramc.aa(com.tencent.mm.plugin.appbrand.config.h.class);
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.JsApiReportKeyValue", "config is Null!");
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(131431);
      }
      else
      {
        int j = 0;
        if (j < localJSONArray.length())
        {
          try
          {
            Object localObject = localJSONArray.getJSONObject(j);
            int k = ((JSONObject)localObject).optInt("key");
            localObject = ((JSONObject)localObject).optString("value");
            if ((k > 0) && (!bo.isNullOrNil((String)localObject)))
            {
              if (i < 2)
                break label323;
              QualitySessionRuntime localQualitySessionRuntime = com.tencent.mm.plugin.appbrand.report.quality.a.DG(paramc.getAppId());
              if (localQualitySessionRuntime == null)
              {
                paramc.M(paramInt, j("fail NULL QualitySystem instance", null));
                AppMethodBeat.o(131431);
                continue;
              }
              ab.i("MicroMsg.JsApiReportKeyValue", "report kv_%d{appId='%s',pkgVersion=%d,pkgDebugType=%d,value='%s'}", new Object[] { Integer.valueOf(k), paramc.getAppId(), Integer.valueOf(paramJSONObject.hhd.gVu), Integer.valueOf(paramJSONObject.hhd.gVt + 1), localObject });
              com.tencent.mm.plugin.report.service.h.pYm.e(k, new Object[] { localQualitySessionRuntime.igT, localQualitySessionRuntime.appId, Integer.valueOf(localQualitySessionRuntime.iDa), Integer.valueOf(localQualitySessionRuntime.iCZ), Integer.valueOf(localQualitySessionRuntime.apptype), localObject });
            }
            while (true)
            {
              j++;
              break;
              label323: ab.i("MicroMsg.JsApiReportKeyValue", "report kv_%d{appId='%s',pkgVersion=%d,pkgDebugType=%d,value='%s'}", new Object[] { Integer.valueOf(k), paramc.getAppId(), Integer.valueOf(paramJSONObject.hhd.gVu), Integer.valueOf(paramJSONObject.hhd.gVt + 1), localObject });
              com.tencent.mm.plugin.report.service.h.pYm.e(k, new Object[] { paramc.getAppId(), Integer.valueOf(paramJSONObject.hhd.gVu), Integer.valueOf(paramJSONObject.hhd.gVt + 1), localObject });
            }
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicroMsg.JsApiReportKeyValue", "AppBrandComponent parse report value failed : %s", new Object[] { localException.getMessage() });
          }
        }
        else
        {
          paramc.M(paramInt, j("ok", null));
          AppMethodBeat.o(131431);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.o.f
 * JD-Core Version:    0.6.2
 */
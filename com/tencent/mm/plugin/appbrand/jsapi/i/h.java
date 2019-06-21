package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.l.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h extends a
{
  public static final int CTRL_INDEX = 270;
  public static final String NAME = "operateDownloadTask";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(108060);
    ab.d("MicroMsg.JsApiOperateDownloadTask", "JsApiOperateDownloadTask");
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data is null", null));
      ab.e("MicroMsg.JsApiOperateDownloadTask", "data is null");
      AppMethodBeat.o(108060);
    }
    while (true)
    {
      return;
      String str = paramJSONObject.optString("downloadTaskId");
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.JsApiOperateDownloadTask", "downloadTaskId is null");
        paramc.M(paramInt, j("fail:downloadTaskId is null or nil", null));
        AppMethodBeat.o(108060);
      }
      else
      {
        paramJSONObject = paramJSONObject.optString("operationType");
        if (bo.isNullOrNil(paramJSONObject))
        {
          ab.e("MicroMsg.JsApiOperateDownloadTask", "operationType is null");
          paramc.M(paramInt, j("fail:operationType is null or nil", null));
          AppMethodBeat.o(108060);
        }
        else if (paramJSONObject.equals("abort"))
        {
          b localb = com.tencent.mm.plugin.appbrand.l.c.aIB().CJ(paramc.getAppId());
          if (localb == null)
          {
            paramc.M(paramInt, j("fail:no task", null));
            ab.w("MicroMsg.JsApiOperateDownloadTask", "download is null");
            AppMethodBeat.o(108060);
          }
          else
          {
            paramJSONObject = localb.CG(str);
            if (paramJSONObject == null)
            {
              paramc.M(paramInt, j("fail:no task", null));
              ab.w("MicroMsg.JsApiOperateDownloadTask", "downloadWorker is null %s", new Object[] { str });
              AppMethodBeat.o(108060);
            }
            else
            {
              localb.a(paramJSONObject);
              paramc.M(paramInt, j("ok", null));
              paramJSONObject = new HashMap();
              paramJSONObject.put("downloadTaskId", String.valueOf(str));
              paramJSONObject.put("state", "fail");
              paramJSONObject.put("errMsg", "abort");
              paramJSONObject = new JSONObject(paramJSONObject).toString();
              new d.a().j(paramc).AM(paramJSONObject).aCj();
              ab.d("MicroMsg.JsApiOperateDownloadTask", "abortTask finish %s", new Object[] { str });
              AppMethodBeat.o(108060);
            }
          }
        }
        else
        {
          paramc.M(paramInt, j("fail:unknown operationType", null));
          AppMethodBeat.o(108060);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.h
 * JD-Core Version:    0.6.2
 */
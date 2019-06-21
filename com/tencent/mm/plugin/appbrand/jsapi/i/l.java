package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.l.g;
import com.tencent.mm.plugin.appbrand.l.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class l extends a
{
  public static final int CTRL_INDEX = 273;
  public static final String NAME = "operateUploadTask";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(108078);
    ab.d("MicroMsg.JsApiOperateUploadTask", "JsApiOperateUploadTask");
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data is null", null));
      ab.e("MicroMsg.JsApiOperateUploadTask", "data is null");
      AppMethodBeat.o(108078);
    }
    while (true)
    {
      return;
      String str = paramJSONObject.optString("uploadTaskId");
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.JsApiOperateUploadTask", "uploadTaskId is null");
        paramc.M(paramInt, j("fail:uploadTaskId is null or nil", null));
        AppMethodBeat.o(108078);
      }
      else
      {
        paramJSONObject = paramJSONObject.optString("operationType");
        if (bo.isNullOrNil(paramJSONObject))
        {
          ab.e("MicroMsg.JsApiOperateUploadTask", "operationType is null");
          paramc.M(paramInt, j("fail:operationType is null or nil", null));
          AppMethodBeat.o(108078);
        }
        else if (paramJSONObject.equals("abort"))
        {
          g localg = i.aIG().CO(paramc.getAppId());
          if (localg == null)
          {
            ab.i("MicroMsg.JsApiOperateUploadTask", "upload is null");
            paramc.M(paramInt, j("fail:no task", null));
            AppMethodBeat.o(108078);
          }
          else
          {
            paramJSONObject = localg.CN(str);
            if (paramJSONObject == null)
            {
              ab.i("MicroMsg.JsApiOperateUploadTask", "uploadInfo is null %s", new Object[] { str });
              paramc.M(paramInt, j("fail:no task", null));
              AppMethodBeat.o(108078);
            }
            else
            {
              localg.a(paramJSONObject);
              paramc.M(paramInt, j("ok", null));
              paramJSONObject = new HashMap();
              paramJSONObject.put("uploadTaskId", String.valueOf(str));
              paramJSONObject.put("state", "fail");
              paramJSONObject.put("errMsg", "abort");
              paramJSONObject = new JSONObject(paramJSONObject).toString();
              new g.a().j(paramc).AM(paramJSONObject).aCj();
              ab.d("MicroMsg.JsApiOperateUploadTask", "abortTask finish %s", new Object[] { str });
              AppMethodBeat.o(108078);
            }
          }
        }
        else
        {
          paramc.M(paramInt, j("fail:unknown operationType", null));
          AppMethodBeat.o(108078);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.l
 * JD-Core Version:    0.6.2
 */
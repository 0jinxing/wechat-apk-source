package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.l.d;
import com.tencent.mm.plugin.appbrand.l.e;
import com.tencent.mm.plugin.appbrand.l.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j extends a
{
  public static final int CTRL_INDEX = 243;
  public static final String NAME = "operateRequestTask";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(108075);
    ab.d("MicroMsg.JsApiOperateRequestTask", "JsApiOperateRequestTask");
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data is null", null));
      ab.e("MicroMsg.JsApiOperateRequestTask", "data is null");
      AppMethodBeat.o(108075);
    }
    while (true)
    {
      return;
      String str = paramJSONObject.optString("requestTaskId");
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.JsApiOperateRequestTask", "requestTaskId is null");
        paramc.M(paramInt, j("fail:requestTaskId is null or nil", null));
        AppMethodBeat.o(108075);
      }
      else
      {
        paramJSONObject = paramJSONObject.optString("operationType");
        if (bo.isNullOrNil(paramJSONObject))
        {
          ab.e("MicroMsg.JsApiOperateRequestTask", "operationType is null");
          paramc.M(paramInt, j("fail:operationType is null or nil", null));
          AppMethodBeat.o(108075);
        }
        else if (paramJSONObject.equals("abort"))
        {
          paramJSONObject = f.aIE().CM(paramc.getAppId());
          if (paramJSONObject == null)
          {
            paramc.M(paramInt, j("fail:no task", null));
            ab.w("MicroMsg.JsApiOperateRequestTask", "request is null");
            AppMethodBeat.o(108075);
          }
          else
          {
            e locale = paramJSONObject.CL(str);
            if (locale == null)
            {
              paramc.M(paramInt, j("fail:no task", null));
              ab.w("MicroMsg.JsApiOperateRequestTask", "requestInfo is null %s", new Object[] { str });
              AppMethodBeat.o(108075);
            }
            else
            {
              paramJSONObject.b(locale);
              paramc.M(paramInt, j("ok", null));
              paramJSONObject = new HashMap();
              paramJSONObject.put("requestTaskId", String.valueOf(str));
              paramJSONObject.put("state", "fail");
              paramJSONObject.put("errMsg", "abort");
              paramJSONObject = new JSONObject(paramJSONObject).toString();
              new e.a().j(paramc).AM(paramJSONObject).aCj();
              ab.d("MicroMsg.JsApiOperateRequestTask", "abortTask finish %s", new Object[] { str });
              AppMethodBeat.o(108075);
            }
          }
        }
        else
        {
          paramc.M(paramInt, j("fail:unknown operationType", null));
          AppMethodBeat.o(108075);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.j
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.d;
import com.tencent.mm.plugin.appbrand.l.k.c;
import com.tencent.mm.plugin.appbrand.l.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public final class k extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 347;
  public static final String NAME = "operateSocketTask";
  private boolean hRD = false;
  private boolean hRE = false;
  private k.c hRz;

  public k(k.c paramc)
  {
    this.hRz = paramc;
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(108076);
    ab.d("MicroMsg.JsApiOperateSocketTask", "JsApiOperateSocketTask");
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data is null", null));
      ab.e("MicroMsg.JsApiOperateSocketTask", "data is null");
      AppMethodBeat.o(108076);
    }
    while (true)
    {
      return;
      String str1 = paramJSONObject.optString("socketTaskId");
      if (bo.isNullOrNil(str1))
      {
        ab.e("MicroMsg.JsApiOperateSocketTask", "taskId is null");
        paramc.M(paramInt, j("fail:taskId is null or nil", null));
        AppMethodBeat.o(108076);
      }
      else
      {
        String str2 = paramJSONObject.optString("operationType");
        if (bo.isNullOrNil(str2))
        {
          ab.e("MicroMsg.JsApiOperateSocketTask", "operationType is null");
          paramc.M(paramInt, j("fail:operationType is null or nil", null));
          AppMethodBeat.o(108076);
        }
        else
        {
          d locald = l.aII().CT(paramc.getAppId());
          if (locald == null)
          {
            paramc.M(paramInt, j("fail:no task", null));
            ab.w("MicroMsg.JsApiOperateSocketTask", "client is null");
            AppMethodBeat.o(108076);
          }
          else
          {
            com.tencent.mm.plugin.appbrand.jsapi.websocket.e locale = locald.BS(str1);
            if (locale == null)
            {
              paramc.M(paramInt, j("fail:taskID not exist", null));
              ab.w("MicroMsg.JsApiOperateSocketTask", "webSocketClient is null");
              AppMethodBeat.o(108076);
            }
            else if (str2.equals("close"))
            {
              int i = paramJSONObject.optInt("code", 1000);
              if ((i != 1000) && ((i < 3000) || (i >= 5000)))
              {
                paramc.M(paramInt, j("fail:The code must be either 1000, or between 3000 and 4999", null));
                AppMethodBeat.o(108076);
              }
              else
              {
                paramJSONObject = paramJSONObject.optString("reason", "");
                locald.a(locale, i, paramJSONObject);
                paramc.M(paramInt, j("ok", null));
                ab.i("MicroMsg.JsApiOperateSocketTask", "closeSocket taskId:%s, code %d, reason %s", new Object[] { str1, Integer.valueOf(i), paramJSONObject });
                AppMethodBeat.o(108076);
              }
            }
            else if (str2.equals("send"))
            {
              if (!locald.b(locale))
              {
                paramc.M(paramInt, j("fail", null));
                ab.w("MicroMsg.JsApiOperateSocketTask", "send fail taskId: %s", new Object[] { str1 });
                AppMethodBeat.o(108076);
              }
              else
              {
                paramJSONObject = paramJSONObject.opt("data");
                if (paramJSONObject != null)
                {
                  try
                  {
                    if ((paramJSONObject instanceof ByteBuffer))
                    {
                      ab.i("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage ok message:%s", new Object[] { paramJSONObject });
                      locald.a(locale, (ByteBuffer)paramJSONObject);
                      ((com.tencent.mm.plugin.appbrand.n.a)com.tencent.luggage.a.e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 4L, 1L);
                    }
                    while (true)
                    {
                      paramc.M(paramInt, j("ok", null));
                      AppMethodBeat.o(108076);
                      break;
                      if (!(paramJSONObject instanceof String))
                        break label636;
                      ab.i("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage ok message");
                      locald.a(locale, (String)paramJSONObject);
                      ((com.tencent.mm.plugin.appbrand.n.a)com.tencent.luggage.a.e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 4L, 1L);
                    }
                  }
                  catch (Exception paramJSONObject)
                  {
                    paramc.M(paramInt, j("fail:" + paramJSONObject.getMessage(), null));
                    if ((this.hRD) || (this.hRE))
                    {
                      ((com.tencent.mm.plugin.appbrand.n.a)com.tencent.luggage.a.e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 6L, 1L);
                      AppMethodBeat.o(108076);
                      continue;
                      label636: ab.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage error message type wrong");
                      paramc.M(paramInt, j("fail:unknown data", null));
                      AppMethodBeat.o(108076);
                      continue;
                    }
                    ((com.tencent.mm.plugin.appbrand.n.a)com.tencent.luggage.a.e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 5L, 1L);
                    AppMethodBeat.o(108076);
                  }
                }
                else
                {
                  paramc.M(paramInt, j("fail:message is null or nil", null));
                  ab.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage fail:%s", new Object[] { paramJSONObject });
                  AppMethodBeat.o(108076);
                }
              }
            }
            else
            {
              paramc.M(paramInt, j("fail:unknown operationType", null));
              ab.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage fail:unknown operationType");
              AppMethodBeat.o(108076);
            }
          }
        }
      }
    }
  }

  public final void g(c paramc)
  {
    AppMethodBeat.i(108077);
    if (this.hRz != null)
    {
      this.hRD = this.hRz.xj(paramc.getAppId());
      this.hRE = this.hRz.auB();
    }
    AppMethodBeat.o(108077);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.k
 * JD-Core Version:    0.6.2
 */
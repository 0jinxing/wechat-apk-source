package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class g extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 183;
  private static final String NAME = "getBLEDeviceCharacteristics";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94186);
    c.kT(151);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "getBLEDeviceCharacteristics data is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10013));
      paramc.M(paramInt, j("fail:invalid data", paramJSONObject));
      c.cZ(153, 154);
      AppMethodBeat.o(94186);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiGetBLEDeviceCharacteristics", "appId:%s getBLEDeviceCharacteristics data %s", new Object[] { paramc.getAppId(), paramJSONObject.toString() });
      Object localObject = a.AT(paramc.getAppId());
      if (localObject == null)
      {
        ab.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "bleWorker is null, may not open ble");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10000));
        paramc.M(paramInt, j("fail:not init", paramJSONObject));
        c.cZ(153, 156);
        AppMethodBeat.o(94186);
        continue;
      }
      if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(153, 158);
        AppMethodBeat.o(94186);
        continue;
      }
      localObject = ((b)localObject).ca(paramJSONObject.optString("deviceId"), paramJSONObject.optString("serviceId"));
      paramJSONObject = new HashMap();
      if ((localObject == null) || (((List)localObject).size() <= 0))
      {
        ab.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "not found characteristic");
        paramJSONObject.put("errCode", Integer.valueOf(10005));
        paramc.M(paramInt, j("fail:no characteristic", paramJSONObject));
        c.cZ(153, 159);
        AppMethodBeat.o(94186);
        continue;
      }
      paramJSONObject = new JSONArray();
      localObject = ((List)localObject).iterator();
      if (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c localc = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c)((Iterator)localObject).next();
        while (true)
        {
          try
          {
            if (localc.jsonObject == null)
            {
              JSONObject localJSONObject = new org/json/JSONObject;
              localJSONObject.<init>();
              localc.jsonObject = localJSONObject;
              localc.jsonObject.put("uuid", localc.eCq);
              localJSONObject = new org/json/JSONObject;
              localJSONObject.<init>();
              localJSONObject.put("read", localc.hEC);
              if ((!localc.hED) && (!localc.hEE))
                break label548;
              bool = true;
              localJSONObject.put("write", bool);
              localJSONObject.put("notify", localc.flq);
              localJSONObject.put("indicate", localc.hEF);
              localc.jsonObject.put("properties", localJSONObject);
            }
            paramJSONObject.put(localc.jsonObject);
          }
          catch (JSONException localJSONException)
          {
            ab.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "JSONException %s", new Object[] { localJSONException.getMessage() });
          }
          break;
          label548: boolean bool = false;
        }
      }
      localObject = new JSONObject();
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((JSONObject)localObject).put("errMsg", getName() + ":ok");
        ((JSONObject)localObject).put("characteristics", paramJSONObject);
        ((JSONObject)localObject).put("errCode", 0);
        ab.i("MicroMsg.JsApiGetBLEDeviceCharacteristics", "retJson %s", new Object[] { ((JSONObject)localObject).toString() });
        paramc.M(paramInt, ((JSONObject)localObject).toString());
        c.kT(152);
        AppMethodBeat.o(94186);
      }
      catch (JSONException paramJSONObject)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.JsApiGetBLEDeviceCharacteristics", paramJSONObject, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g
 * JD-Core Version:    0.6.2
 */
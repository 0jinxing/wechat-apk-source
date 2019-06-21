package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class j extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 178;
  private static final String NAME = "getBluetoothDevices";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    JSONArray localJSONArray = null;
    AppMethodBeat.i(94189);
    c.kT(166);
    Object localObject1 = paramc.getAppId();
    Object localObject2 = paramJSONObject;
    if (paramJSONObject == null)
      localObject2 = "";
    ab.i("MicroMsg.JsApiGetBluetoothDevices", "appId:%s getBluetoothDevices data:%s", new Object[] { localObject1, localObject2 });
    localObject1 = a.AT((String)localObject1);
    if (localObject1 == null)
    {
      ab.e("MicroMsg.JsApiGetBluetoothDevices", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramc.M(paramInt, j("fail:not init", paramJSONObject));
      c.cZ(168, 170);
      AppMethodBeat.o(94189);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiGetBluetoothDevices", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(168, 172);
        AppMethodBeat.o(94189);
        continue;
      }
      paramJSONObject = localJSONArray;
      if (((b)localObject1).hDu != null)
      {
        localObject2 = ((b)localObject1).hDu;
        paramJSONObject = localJSONArray;
        if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject2).hDZ != null)
          paramJSONObject = new ArrayList(((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject2).hDZ.hFg.values());
      }
      localObject2 = new JSONObject();
      localJSONArray = new JSONArray();
      if (paramJSONObject != null)
      {
        paramJSONObject.addAll(((b)localObject1).aCO());
        paramJSONObject = paramJSONObject.iterator();
        while (paramJSONObject.hasNext())
        {
          localObject1 = (d)paramJSONObject.next();
          try
          {
            localJSONArray.put(((d)localObject1).aCq());
          }
          catch (JSONException localJSONException)
          {
            ab.printErrStackTrace("MicroMsg.JsApiGetBluetoothDevices", localJSONException, "", new Object[0]);
          }
        }
      }
      try
      {
        paramJSONObject = new java/lang/StringBuilder;
        paramJSONObject.<init>();
        ((JSONObject)localObject2).put("errMsg", getName() + ":ok");
        ((JSONObject)localObject2).put("devices", localJSONArray);
        ab.i("MicroMsg.JsApiGetBluetoothDevices", "retJson %s", new Object[] { localObject2 });
        paramc.M(paramInt, ((JSONObject)localObject2).toString());
        c.kT(167);
        AppMethodBeat.o(94189);
      }
      catch (JSONException paramJSONObject)
      {
        while (true)
          ab.e("MicroMsg.JsApiGetBluetoothDevices", "put json value error : %s", new Object[] { Log.getStackTraceString(paramJSONObject) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j
 * JD-Core Version:    0.6.2
 */
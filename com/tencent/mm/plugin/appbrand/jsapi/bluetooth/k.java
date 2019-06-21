package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.d;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class k extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 179;
  private static final String NAME = "getConnectedBluetoothDevices";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94190);
    c.kT(191);
    ab.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "getConnectedBluetoothDevices!");
    ab.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "appId:%s getBLEDeviceCharacteristics data %s", new Object[] { paramc.getAppId(), paramJSONObject.toString() });
    paramJSONObject = a.AT(paramc.getAppId());
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramc.M(paramInt, j("fail:not init", paramJSONObject));
      c.cZ(193, 195);
      AppMethodBeat.o(94190);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(193, 197);
        AppMethodBeat.o(94190);
        continue;
      }
      Object localObject1 = paramJSONObject.aCO();
      if (localObject1 == null)
      {
        ab.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bluetoothDevices is empty!");
        paramc.M(paramInt, j("fail:internal error", null));
        c.cZ(193, 198);
        AppMethodBeat.o(94190);
        continue;
      }
      paramJSONObject = new JSONArray();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (d)((Iterator)localObject1).next();
        String str = ((d)localObject2).ceI;
        localObject2 = ((d)localObject2).name;
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("deviceId", str);
          localJSONObject.put("name", localObject2);
          paramJSONObject.put(localJSONObject);
        }
        catch (JSONException localJSONException)
        {
          ab.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "put JSON data error : %s", new Object[] { localJSONException });
        }
      }
      localObject1 = new JSONObject();
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((JSONObject)localObject1).put("errMsg", getName() + ":ok");
        ((JSONObject)localObject1).put("devices", paramJSONObject);
        ab.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "retJson %s", new Object[] { ((JSONObject)localObject1).toString() });
        paramc.M(paramInt, ((JSONObject)localObject1).toString());
        c.kT(192);
        AppMethodBeat.o(94190);
      }
      catch (JSONException paramJSONObject)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.JsApiGetConnectedBluetoothDevices", paramJSONObject, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k
 * JD-Core Version:    0.6.2
 */
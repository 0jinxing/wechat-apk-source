package com.tencent.mm.plugin.appbrand.jsapi.c;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.j.b;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 221;
  private static final String NAME = "startBeaconDiscovery";
  private a.a.a hKb;
  g.c hKg = null;

  private static UUID[] z(JSONObject paramJSONObject)
  {
    int i = 0;
    AppMethodBeat.i(94365);
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramJSONObject.has("uuids"))
    {
      Object localObject3 = localObject2;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localObject3 = localObject2;
        localJSONArray.<init>(paramJSONObject.optString("uuids"));
        localObject3 = localObject2;
        paramJSONObject = new UUID[localJSONArray.length()];
        while (true)
        {
          localObject3 = paramJSONObject;
          localObject1 = paramJSONObject;
          if (i >= localJSONArray.length())
            break;
          localObject3 = paramJSONObject;
          localObject1 = localJSONArray.getString(i);
          localObject3 = paramJSONObject;
          ab.d("MicroMsg.JsApiStartBeaconDiscovery", "uuid %s", new Object[] { localObject1 });
          localObject3 = paramJSONObject;
          paramJSONObject[i] = UUID.fromString((String)localObject1);
          i++;
        }
      }
      catch (JSONException paramJSONObject)
      {
        ab.e("MicroMsg.JsApiStartBeaconDiscovery", "get uuid error!");
        localObject1 = localObject3;
      }
    }
    AppMethodBeat.o(94365);
    return localObject1;
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94364);
    ab.i("MicroMsg.JsApiStartBeaconDiscovery", "startBeaconDiscovery data %s", new Object[] { paramJSONObject });
    UUID[] arrayOfUUID = z(paramJSONObject);
    if ((arrayOfUUID == null) || (arrayOfUUID.length <= 0))
    {
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(11006));
      paramc.M(paramInt, j("fail:invalid data", paramJSONObject));
      AppMethodBeat.o(94364);
      return;
    }
    String str = paramc.getAppId();
    Object localObject = a.AZ(paramc.getAppId());
    paramJSONObject = (JSONObject)localObject;
    if (localObject == null)
    {
      ab.i("MicroMsg.JsApiStartBeaconDiscovery", "beaconWorker init");
      paramJSONObject = new a.a();
      a.a(str, paramJSONObject);
    }
    if (this.hKb == null)
    {
      ab.i("MicroMsg.JsApiStartBeaconDiscovery", "onBeaconScanCallback init");
      this.hKb = new c.1(this, paramc);
    }
    if (this.hKg == null)
    {
      ab.i("MicroMsg.JsApiStartBeaconDiscovery", "listener init");
      this.hKg = new c.2(this, paramc);
      g.a(paramc.getAppId(), this.hKg);
    }
    paramJSONObject.hKa = arrayOfUUID;
    paramJSONObject.hKb = this.hKb;
    ab.i("MicroMsg.BeaconManager", "BeaconWorker:%d start", new Object[] { Integer.valueOf(paramJSONObject.hashCode()) });
    if (paramJSONObject.isStart())
    {
      ab.i("MicroMsg.BeaconManager", "BeaconWorker:%d, already start", new Object[] { Integer.valueOf(paramJSONObject.hashCode()) });
      paramJSONObject = com.tencent.mm.vending.j.c.F(Integer.valueOf(11003), "fail:already start");
      label270: localObject = new HashMap();
      ((Map)localObject).put("errCode", paramJSONObject.get(0));
      if (((Integer)paramJSONObject.get(0)).intValue() != 0)
        break label537;
    }
    label537: for (paramJSONObject = "ok"; ; paramJSONObject = (String)paramJSONObject.get(1))
    {
      paramc.M(paramInt, j(paramJSONObject, (Map)localObject));
      AppMethodBeat.o(94364);
      break;
      if (d.fP(18))
      {
        ab.e("MicroMsg.BeaconManager", "API version is below 18!");
        paramJSONObject = com.tencent.mm.vending.j.c.F(Integer.valueOf(11000), "fail:not support");
        break label270;
      }
      if (paramJSONObject.hJY == null)
      {
        ab.e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
        paramJSONObject = com.tencent.mm.vending.j.c.F(Integer.valueOf(11001), "fail:bluetooth service is unavailable");
        break label270;
      }
      if (!paramJSONObject.hJY.isEnabled())
      {
        ab.e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
        paramJSONObject = com.tencent.mm.vending.j.c.F(Integer.valueOf(11001), "fail:bluetooth service is unavailable");
        break label270;
      }
      if (paramJSONObject.hJY.isDiscovering())
      {
        ab.e("MicroMsg.BeaconManager", "bluetoothAdapter is Discovering!");
        paramJSONObject = com.tencent.mm.vending.j.c.F(Integer.valueOf(11003), "fail:already start");
        break label270;
      }
      paramJSONObject.hJZ.clear();
      boolean bool = paramJSONObject.hJY.startLeScan(paramJSONObject.hKe);
      ab.i("MicroMsg.BeaconManager", "startLeScan:%b", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        paramJSONObject = com.tencent.mm.vending.j.c.F(Integer.valueOf(11005), "fail:system error");
        break label270;
      }
      paramJSONObject.cFy = true;
      paramJSONObject = com.tencent.mm.vending.j.c.F(Integer.valueOf(0), "");
      break label270;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.c.c
 * JD-Core Version:    0.6.2
 */
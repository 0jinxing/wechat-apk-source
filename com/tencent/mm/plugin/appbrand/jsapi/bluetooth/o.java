package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import android.os.ParcelUuid;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.i;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@TargetApi(18)
public final class o extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 176;
  private static final String NAME = "startBluetoothDevicesDiscovery";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94212);
    c.kT(11);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "startBluetoothDevicesDiscovery data is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10013));
      paramc.M(paramInt, j("fail:invalid data", paramJSONObject));
      c.cZ(13, 14);
      AppMethodBeat.o(94212);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "appId:%s startBluetoothDevicesDiscovery data:%s", new Object[] { paramc.getAppId(), paramJSONObject });
      Object localObject1 = a.AT(paramc.getAppId());
      if (localObject1 == null)
      {
        ab.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "bleWorker is null, may not open ble");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10000));
        paramc.M(paramInt, j("fail:not init", paramJSONObject));
        c.cZ(13, 16);
        AppMethodBeat.o(94212);
      }
      else if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(13, 18);
        AppMethodBeat.o(94212);
      }
      else if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(13, 18);
        AppMethodBeat.o(94212);
      }
      else
      {
        boolean bool = paramJSONObject.optBoolean("allowDuplicatesKey");
        int i = paramJSONObject.optInt("interval");
        String str = paramJSONObject.optString("", "middle");
        Object localObject2 = null;
        Object localObject3;
        if (paramJSONObject.has("services"))
        {
          localObject3 = new ArrayList();
          try
          {
            JSONArray localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>(paramJSONObject.optString("services"));
            for (int j = 0; ; j++)
            {
              localObject2 = localObject3;
              if (j >= localJSONArray.length())
                break;
              localObject2 = ParcelUuid.fromString(localJSONArray.getString(j).toUpperCase());
              paramJSONObject = new com/tencent/mm/plugin/appbrand/jsapi/bluetooth/sdk/scan/ScanFilterCompat$a;
              paramJSONObject.<init>();
              ((List)localObject3).add(paramJSONObject.a((ParcelUuid)localObject2).aCV());
            }
          }
          catch (Exception paramJSONObject)
          {
            ab.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "get uuid error!");
            paramJSONObject = new HashMap();
            paramJSONObject.put("isDiscovering", Boolean.FALSE);
            paramJSONObject.put("errCode", Integer.valueOf(10004));
            paramc.M(paramInt, j("fail:no service", paramJSONObject));
            c.kT(13);
            AppMethodBeat.o(94212);
          }
        }
        else
        {
          paramJSONObject = new a.a();
          paramJSONObject.eCL = i;
          paramJSONObject.hDL = bool;
          paramJSONObject.hDU = str;
          paramJSONObject = paramJSONObject.aCP();
          if (((b)localObject1).hDu != null)
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleManager", "initBleConfig:%s", new Object[] { paramJSONObject });
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a(paramJSONObject);
          }
          paramJSONObject = new o.1(this, paramc, paramInt);
          localObject3 = new o.2(this, paramc);
          if (((b)localObject1).hDu != null)
          {
            localObject1 = ((b)localObject1).hDu;
            if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject1).hDZ != null)
              ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject1).hDZ.a(paramJSONObject, (List)localObject2, (i)localObject3);
          }
          m.c.a(paramc, true, true);
          AppMethodBeat.o(94212);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o
 * JD-Core Version:    0.6.2
 */
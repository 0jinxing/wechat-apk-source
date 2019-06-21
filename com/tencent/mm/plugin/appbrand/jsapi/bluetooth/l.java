package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

@TargetApi(18)
public final class l extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 186;
  private static final String NAME = "notifyBLECharacteristicValueChanged";
  public static String hDy = "notification";
  public static String hDz = "indication";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94193);
    c.kT(71);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "JsApiNotifyBLECharacteristicValueChanged data is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10013));
      paramc.M(paramInt, j("fail:invalid data", paramJSONObject));
      c.cZ(73, 74);
      AppMethodBeat.o(94193);
    }
    while (true)
    {
      return;
      String str1 = paramc.getAppId();
      ab.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "appId:%s notifyBLECharacteristicValueChanged data %s", new Object[] { str1, paramJSONObject.toString() });
      b localb = a.AT(paramc.getAppId());
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "bleWorker is null, may not open ble");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10000));
        paramc.M(paramInt, j("fail:not init", paramJSONObject));
        c.cZ(73, 76);
        AppMethodBeat.o(94193);
      }
      else if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(73, 79);
        AppMethodBeat.o(94193);
      }
      else
      {
        String str2 = paramJSONObject.optString("deviceId");
        String str3 = paramJSONObject.optString("serviceId");
        String str4 = paramJSONObject.optString("characteristicId");
        boolean bool1 = paramJSONObject.optBoolean("state");
        String str5 = paramJSONObject.optString("type", hDz);
        boolean bool2 = paramJSONObject.optBoolean("debug", false);
        boolean bool3 = paramJSONObject.optBoolean("mainThread", false);
        boolean bool4 = paramJSONObject.optBoolean("serial", true);
        if (localb.hDu != null)
        {
          paramJSONObject = localb.hDu;
          if (paramJSONObject.hDY != null)
          {
            paramJSONObject = paramJSONObject.hDY;
            if (paramJSONObject.hEg.get(str2) != null)
            {
              paramJSONObject = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)paramJSONObject.hEg.get(str2);
              if (paramJSONObject.hEl != null)
                break label448;
              com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristic] bluetoothGatt is null, err", new Object[0]);
            }
          }
          label385: paramJSONObject = null;
        }
        while (true)
        {
          if (paramJSONObject != null)
            break label666;
          ab.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "bleCharacteristic is null, may not connect");
          paramJSONObject = new HashMap();
          paramJSONObject.put("errCode", Integer.valueOf(10005));
          paramc.M(paramInt, j("fail:no characteristic", paramJSONObject));
          c.kT(73);
          AppMethodBeat.o(94193);
          break;
          label448: if ((bo.isNullOrNil(str3)) || (bo.isNullOrNil(str4)))
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristic] serviceId is null, err", new Object[0]);
            break label385;
          }
          if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.AX(str3))
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristics] serviceId is illegal, err", new Object[0]);
            break label385;
          }
          if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.AX(str4))
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristics] characteristicId is illegal, err", new Object[0]);
            break label385;
          }
          paramJSONObject = paramJSONObject.hEl.getService(UUID.fromString(str3));
          if (paramJSONObject == null)
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleConnectWorker", "[getCharacteristic] bluetoothGattServices is null, err", new Object[0]);
            break label385;
          }
          BluetoothGattCharacteristic localBluetoothGattCharacteristic = paramJSONObject.getCharacteristic(UUID.fromString(str4));
          if (localBluetoothGattCharacteristic == null)
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleConnectWorker", "[getCharacteristic] characteristics is null, err", new Object[0]);
            break label385;
          }
          paramJSONObject = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c();
          paramJSONObject.eCq = localBluetoothGattCharacteristic.getUuid().toString().toUpperCase();
          int i = localBluetoothGattCharacteristic.getProperties();
          paramJSONObject.hEC = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.og(i);
          paramJSONObject.hED = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.oh(i);
          paramJSONObject.hEE = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.oi(i);
          paramJSONObject.flq = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.oj(i);
          paramJSONObject.hEF = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.ok(i);
          continue;
          paramJSONObject = null;
        }
        label666: boolean bool5;
        if (((paramJSONObject.flq) && (!paramJSONObject.hEF)) || ((paramJSONObject.flq) && (paramJSONObject.hEF) && (str5.toLowerCase().equals(hDy))))
        {
          bool5 = true;
          label711: if (((paramJSONObject.flq) || (!paramJSONObject.hEF)) && ((!paramJSONObject.flq) || (!paramJSONObject.hEF) || (!str5.toLowerCase().equals(hDz))))
            break label858;
        }
        label858: for (boolean bool6 = true; ; bool6 = false)
        {
          ab.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "appId:%s notifyBLECharacteristicValueChanged isNotify:%b isIndicate:%b", new Object[] { str1, Boolean.valueOf(bool5), Boolean.valueOf(bool6) });
          if (!bool5)
            break label864;
          paramJSONObject = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.d(str3, str4, bool1);
          paramJSONObject.aJe = bool2;
          paramJSONObject.hDP = bool3;
          paramJSONObject.hDR = bool4;
          localb.a(str2, paramJSONObject, new l.1(this, paramc, paramInt));
          AppMethodBeat.o(94193);
          break;
          bool5 = false;
          break label711;
        }
        label864: if (bool6)
        {
          paramJSONObject = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.c(str3, str4, bool1);
          paramJSONObject.aJe = bool2;
          paramJSONObject.hDP = bool3;
          paramJSONObject.hDR = bool4;
          localb.a(str2, paramJSONObject, new l.2(this, str1, paramc, paramInt));
          AppMethodBeat.o(94193);
        }
        else
        {
          ab.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "not support notify and not support indicate...");
          paramJSONObject = new HashMap();
          paramJSONObject.put("errCode", Integer.valueOf(10007));
          paramc.M(paramInt, j("fail:internal error", paramJSONObject));
          c.cZ(73, 82);
          AppMethodBeat.o(94193);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l
 * JD-Core Version:    0.6.2
 */
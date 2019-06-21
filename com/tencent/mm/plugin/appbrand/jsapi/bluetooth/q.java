package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.f;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class q extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 184;
  private static final String NAME = "writeBLECharacteristicValue";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94215);
    c.kT(56);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiWriteBLECharacteristicValue", "JsApiWriteBLECharacteristicValue data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      c.cZ(58, 59);
      AppMethodBeat.o(94215);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiWriteBLECharacteristicValue", "appId:%s writeBLECharacteristicValue data %s", new Object[] { paramc.getAppId(), paramJSONObject.toString() });
      b localb = a.AT(paramc.getAppId());
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiWriteBLECharacteristicValue", "bleWorker is null, may not open ble");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10000));
        paramc.M(paramInt, j("fail:not init", paramJSONObject));
        c.cZ(58, 61);
        AppMethodBeat.o(94215);
      }
      else if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiWriteBLECharacteristicValue", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(58, 63);
        AppMethodBeat.o(94215);
      }
      else
      {
        String str1 = paramJSONObject.optString("deviceId");
        String str2 = paramJSONObject.optString("serviceId");
        String str3 = paramJSONObject.optString("characteristicId");
        String str4 = paramJSONObject.optString("value");
        boolean bool1 = paramJSONObject.optBoolean("debug", false);
        boolean bool2 = paramJSONObject.optBoolean("serial", true);
        paramJSONObject = new f(str2, str3, str4);
        paramJSONObject.aJe = bool1;
        paramJSONObject.hDP = false;
        paramJSONObject.hDR = bool2;
        localb.a(str1, paramJSONObject, new q.1(this, paramc, paramInt));
        AppMethodBeat.o(94215);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.q
 * JD-Core Version:    0.6.2
 */
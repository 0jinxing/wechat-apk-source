package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class n extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 185;
  private static final String NAME = "readBLECharacteristicValue";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94205);
    c.kT(41);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiReadBLECharacteristicValue", "JsApiReadBLECharacteristicValue data is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10013));
      paramc.M(paramInt, j("fail:invalid data", paramJSONObject));
      c.cZ(43, 44);
      AppMethodBeat.o(94205);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiReadBLECharacteristicValue", "appId:%s readBLECharacteristicValue data %s", new Object[] { paramc.getAppId(), paramJSONObject.toString() });
      b localb = a.AT(paramc.getAppId());
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiReadBLECharacteristicValue", "bleWorker is null, may not open ble");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10000));
        paramc.M(paramInt, j("fail:not init", paramJSONObject));
        c.cZ(43, 46);
        AppMethodBeat.o(94205);
      }
      else if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiReadBLECharacteristicValue", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(43, 48);
        AppMethodBeat.o(94205);
      }
      else
      {
        String str1 = paramJSONObject.optString("deviceId");
        String str2 = paramJSONObject.optString("serviceId");
        String str3 = paramJSONObject.optString("characteristicId");
        boolean bool1 = paramJSONObject.optBoolean("debug", false);
        boolean bool2 = paramJSONObject.optBoolean("serial", true);
        paramJSONObject = new e(str2, str3);
        paramJSONObject.aJe = bool1;
        paramJSONObject.hDP = false;
        paramJSONObject.hDR = bool2;
        localb.a(str1, paramJSONObject, new n.1(this, paramc, paramInt));
        AppMethodBeat.o(94205);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.n
 * JD-Core Version:    0.6.2
 */
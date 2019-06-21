package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class i extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 175;
  private static final String NAME = "getBluetoothAdapterState";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(94188);
    c.kT(126);
    ab.i("MicroMsg.JsApiGetBluetoothAdapterState", "appId:%s getBluetoothAdapterState", new Object[] { paramc.getAppId() });
    paramJSONObject = a.AT(paramc.getAppId());
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiGetBluetoothAdapterState", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramc.M(paramInt, j("fail:not init", paramJSONObject));
      c.cZ(128, 130);
      AppMethodBeat.o(94188);
    }
    while (true)
    {
      return;
      boolean bool2 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ();
      boolean bool3 = bool1;
      if (paramJSONObject.hDu != null)
      {
        paramJSONObject = paramJSONObject.hDu;
        bool3 = bool1;
        if (paramJSONObject.hDZ != null)
          bool3 = paramJSONObject.hDZ.hFh.get();
      }
      ab.i("MicroMsg.JsApiGetBluetoothAdapterState", "availableState : " + bool2 + ",discoveringState : " + bool3);
      paramJSONObject = new HashMap();
      paramJSONObject.put("available", Boolean.valueOf(bool2));
      paramJSONObject.put("discovering", Boolean.valueOf(bool3));
      paramc.M(paramInt, j("ok", paramJSONObject));
      c.kT(127);
      AppMethodBeat.o(94188);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i
 * JD-Core Version:    0.6.2
 */
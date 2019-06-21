package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class p extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 177;
  private static final String NAME = "stopBluetoothDevicesDiscovery";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94213);
    c.kT(101);
    String str = paramc.getAppId();
    Object localObject = paramJSONObject;
    if (paramJSONObject == null)
      localObject = "";
    ab.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "appId:%s stopBluetoothDevicesDiscovery data:%s", new Object[] { str, localObject });
    paramJSONObject = a.AT(str);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramc.M(paramInt, j("fail:not init", paramJSONObject));
      c.cZ(103, 106);
      AppMethodBeat.o(94213);
    }
    while (true)
    {
      label116: return;
      if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(103, 108);
        AppMethodBeat.o(94213);
      }
      else
      {
        if (paramJSONObject.hDu != null)
        {
          paramJSONObject = paramJSONObject.hDu;
          if (paramJSONObject.hDZ != null)
            paramJSONObject = paramJSONObject.hDZ.aCU();
        }
        while (true)
        {
          ab.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "stopBleScan result:%s", new Object[] { paramJSONObject });
          localObject = new HashMap();
          switch (paramJSONObject.errCode)
          {
          default:
            ((Map)localObject).put("isDiscovering", Boolean.FALSE);
            paramc.M(paramInt, j("fail", (Map)localObject));
            c.kT(103);
            AppMethodBeat.o(94213);
            break label116;
            paramJSONObject = j.hEM;
            continue;
            paramJSONObject = j.hEM;
          case 0:
          }
        }
        ((Map)localObject).put("isDiscovering", Boolean.FALSE);
        paramc.M(paramInt, j("ok", (Map)localObject));
        c.kT(102);
        m.c.a(paramc, true, false);
        AppMethodBeat.o(94213);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.c;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 222;
  private static final String NAME = "stopBeaconDiscovery";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94366);
    com.tencent.luggage.g.d.i("MicroMsg.JsApiStopBeaconDiscovery", "stopBeaconDiscovery!");
    paramJSONObject = a.AZ(paramc.getAppId());
    if (paramJSONObject == null)
    {
      com.tencent.luggage.g.d.e("MicroMsg.JsApiStopBeaconDiscovery", "beaconWorker is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(11004));
      paramc.M(paramInt, j("fail:not start", paramJSONObject));
      AppMethodBeat.o(94366);
    }
    while (true)
    {
      return;
      JSONObject localJSONObject;
      if (paramJSONObject.EH())
      {
        a.remove(paramc.getAppId());
        new HashMap().put("errCode", Integer.valueOf(0));
        paramc.M(paramInt, j("ok", null));
        paramJSONObject = new d.a((byte)0);
        localJSONObject = new JSONObject();
      }
      try
      {
        localJSONObject.put("available", a.hDs);
        localJSONObject.put("discovering", false);
        com.tencent.luggage.g.d.i("MicroMsg.JsApiStopBeaconDiscovery", "OnBeaconServiceChangedEvent %s", new Object[] { localJSONObject.toString() });
        paramJSONObject.b(paramc, paramc.aBw()).AM(localJSONObject.toString()).aCj();
        AppMethodBeat.o(94366);
        continue;
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(11004));
        paramc.M(paramInt, j("fail:not start", paramJSONObject));
      }
      catch (JSONException localJSONException)
      {
        while (true)
          com.tencent.luggage.g.d.e("MicroMsg.JsApiStopBeaconDiscovery", "put JSON data error : %s", new Object[] { localJSONException });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.c.d
 * JD-Core Version:    0.6.2
 */
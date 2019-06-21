package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.h;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h extends a
{
  public static final int CTRL_INDEX = 144;
  public static final String NAME = "getMapCenterLocation";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93845);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiGetMapCenterLocation", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93845);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiGetMapCenterLocation", "data:%s", new Object[] { paramJSONObject });
      b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiGetMapCenterLocation", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93845);
      }
      else
      {
        paramJSONObject = new HashMap();
        b.h localh = localb.aDV();
        paramJSONObject.put("latitude", Double.valueOf(localh.latitude));
        paramJSONObject.put("longitude", Double.valueOf(localh.longitude));
        ab.i("MicroMsg.JsApiGetMapCenterLocation", "ok, values:%s", new Object[] { paramJSONObject.toString() });
        a(paramc, paramInt, j("ok", paramJSONObject), true, localb.aDU());
        AppMethodBeat.o(93845);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.h
 * JD-Core Version:    0.6.2
 */
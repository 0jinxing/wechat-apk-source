package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class p extends a
{
  public static final int CTRL_INDEX = 141;
  public static final String NAME = "moveToMapLocation";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93866);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiMoveToMapLocation", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93866);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiMoveToMapLocation", "data:%s", new Object[] { paramJSONObject });
      paramJSONObject = f(paramc, paramJSONObject);
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.JsApiMoveToMapLocation", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93866);
      }
      else
      {
        ab.i("MicroMsg.JsApiMoveToMapLocation", "moveToMapLocation");
        paramJSONObject.aDR();
        a(paramc, paramInt, j("ok", null), true, paramJSONObject.aDU());
        AppMethodBeat.o(93866);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.p
 * JD-Core Version:    0.6.2
 */
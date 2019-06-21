package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "getMapRotate";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93848);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiGetMapRotate", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93848);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiGetMapRotate", "data:%s", new Object[] { paramJSONObject });
      paramJSONObject = f(paramc, paramJSONObject);
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.JsApiGetMapRotate", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93848);
      }
      else
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("rotate", Float.valueOf(paramJSONObject.aDS()));
        ab.i("MicroMsg.JsApiGetMapRotate", "getMapRotate ok, values:%s", new Object[] { localHashMap.toString() });
        a(paramc, paramInt, j("ok", localHashMap), true, paramJSONObject.aDU());
        AppMethodBeat.o(93848);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.k
 * JD-Core Version:    0.6.2
 */
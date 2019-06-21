package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.e;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.f;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i extends a
{
  public static final int CTRL_INDEX = 525;
  public static final String NAME = "getMapIndoorFloor";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93846);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiGetMapActiveIndoorInfo", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93846);
    }
    b localb;
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiGetMapActiveIndoorInfo", "data:%s", new Object[] { paramJSONObject });
      localb = f(paramc, paramJSONObject);
      if (localb != null)
        break;
      ab.e("MicroMsg.JsApiGetMapActiveIndoorInfo", "mapView is null, return");
      paramc.M(paramInt, j("fail:mapview is null", null));
      AppMethodBeat.o(93846);
    }
    b.e locale = localb.aDT();
    paramJSONObject = new HashMap();
    JSONArray localJSONArray;
    if (locale != null)
      try
      {
        paramJSONObject.put("buildingId", locale.buildingId);
        paramJSONObject.put("buildingName", locale.buildingName);
        if ((locale.hNP != null) && (locale.hNP.size() > 0))
        {
          localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>();
          Iterator localIterator = locale.hNP.iterator();
          while (localIterator.hasNext())
          {
            b.f localf = (b.f)localIterator.next();
            JSONObject localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>();
            localJSONObject.put("name", localf.floorName);
            localJSONArray.put(localJSONObject);
          }
        }
      }
      catch (JSONException localJSONException)
      {
        ab.e("MicroMsg.JsApiGetMapActiveIndoorInfo", "put JSON data error : %s", new Object[] { localJSONException });
      }
    while (true)
    {
      ab.i("MicroMsg.JsApiGetMapActiveIndoorInfo", "getMapActiveIndoorInfo ok, values:%s", new Object[] { paramJSONObject.toString() });
      a(paramc, paramInt, j("ok", paramJSONObject), true, localb.aDU());
      AppMethodBeat.o(93846);
      break;
      paramJSONObject.put("floorList", localJSONArray);
      paramJSONObject.put("floorIndex", Integer.valueOf(locale.hNQ));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.i
 * JD-Core Version:    0.6.2
 */
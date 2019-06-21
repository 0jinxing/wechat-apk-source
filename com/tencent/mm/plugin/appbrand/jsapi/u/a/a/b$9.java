package com.tencent.mm.plugin.appbrand.jsapi.u.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.e;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.f;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.t;
import com.tencent.mm.plugin.appbrand.jsapi.g.o.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b$9
  implements b.t
{
  public b$9(b paramb, int paramInt, c paramc)
  {
  }

  public final void a(b.e parame)
  {
    AppMethodBeat.i(117363);
    o.c localc = new o.c();
    JSONObject localJSONObject1 = new JSONObject();
    JSONArray localJSONArray;
    try
    {
      localJSONObject1.put("mapId", this.hMD);
      if (parame != null)
      {
        localJSONObject1.put("buildingId", parame.buildingId);
        localJSONObject1.put("buildingName", parame.buildingName);
        if ((parame.hNP == null) || (parame.hNP.size() <= 0))
          break label232;
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        Iterator localIterator = parame.hNP.iterator();
        while (localIterator.hasNext())
        {
          b.f localf = (b.f)localIterator.next();
          JSONObject localJSONObject2 = new org/json/JSONObject;
          localJSONObject2.<init>();
          localJSONObject2.put("name", localf.floorName);
          localJSONArray.put(localJSONObject2);
        }
      }
    }
    catch (JSONException parame)
    {
      ab.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", new Object[] { parame });
    }
    while (true)
    {
      localc.AM(localJSONObject1.toString());
      this.hyd.b(localc);
      this.hyd.a(localc);
      ab.v("MicroMsg.JsApiInsertXWebMap", "OnMapIndoorStateChange:%s", new Object[] { localJSONObject1.toString() });
      AppMethodBeat.o(117363);
      return;
      localJSONObject1.put("floorList", localJSONArray);
      label232: localJSONObject1.put("floorIndex", parame.hNQ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.9
 * JD-Core Version:    0.6.2
 */
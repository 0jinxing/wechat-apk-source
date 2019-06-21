package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.e;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.f;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.t;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class o$9
  implements b.t
{
  o$9(o paramo, int paramInt, e parame)
  {
  }

  public final void a(b.e parame)
  {
    AppMethodBeat.i(93862);
    o.c localc = new o.c();
    JSONObject localJSONObject1 = new JSONObject();
    JSONArray localJSONArray;
    try
    {
      localJSONObject1.put("mapId", this.hCN);
      if (parame != null)
      {
        localJSONObject1.put("buildingId", parame.buildingId);
        localJSONObject1.put("buildingName", parame.buildingName);
        if ((parame.hNP == null) || (parame.hNP.size() <= 0))
          break label222;
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
      ab.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", new Object[] { parame });
    }
    while (true)
    {
      localc.AM(localJSONObject1.toString());
      this.hMK.b(localc);
      ab.v("MicroMsg.JsApiInsertMap", "OnMapIndoorStateChange:%s", new Object[] { localJSONObject1.toString() });
      AppMethodBeat.o(93862);
      return;
      localJSONObject1.put("floorList", localJSONArray);
      label222: localJSONObject1.put("floorIndex", parame.hNQ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.o.9
 * JD-Core Version:    0.6.2
 */
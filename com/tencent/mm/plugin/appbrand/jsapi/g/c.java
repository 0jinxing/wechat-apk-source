package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.m;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends a
{
  public static final int CTRL_INDEX = 140;
  public static final String NAME = "addMapControls";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93840);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiAddMapControls", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93840);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.JsApiAddMapControls", "data:%s", new Object[] { paramJSONObject.toString() });
      com.tencent.mm.plugin.appbrand.jsapi.g.a.b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiAddMapControls", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93840);
      }
      else
      {
        try
        {
          if (!paramJSONObject.has("controls"))
            break label441;
          localb.aDX();
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>(paramJSONObject.optString("controls"));
          int i = 0;
          if (i >= localJSONArray.length())
            break label441;
          Object localObject = (JSONObject)localJSONArray.get(i);
          b.c localc = new com/tencent/mm/plugin/appbrand/jsapi/g/a/b$c;
          localc.<init>();
          localc.hNN = ((com.tencent.mm.plugin.appbrand.d.b)paramc.B(com.tencent.mm.plugin.appbrand.d.b.class)).b(paramc, ((JSONObject)localObject).optString("iconPath"));
          localc.hNO = ((JSONObject)localObject).optBoolean("clickable");
          localc.data = ((JSONObject)localObject).optString("data");
          JSONObject localJSONObject = ((JSONObject)localObject).getJSONObject("position");
          int j = g.a(localJSONObject, "left", 0);
          int k = g.a(localJSONObject, "top", 0);
          localc.left = j;
          localc.top = k;
          if (localJSONObject.has("width"))
            localc.width = g.a(localJSONObject, "width", 0);
          if (localJSONObject.has("height"))
            localc.height = g.a(localJSONObject, "height", 0);
          if (((JSONObject)localObject).optBoolean("clickable"))
          {
            k = f.B(paramJSONObject);
            localObject = new com/tencent/mm/plugin/appbrand/jsapi/g/c$1;
            ((c.1)localObject).<init>(this, k, paramc);
            localb.a(localc, (b.m)localObject, (com.tencent.mm.plugin.appbrand.d.a)paramc.B(com.tencent.mm.plugin.appbrand.d.a.class));
          }
          while (true)
          {
            i++;
            break;
            localb.a(localc, null, (com.tencent.mm.plugin.appbrand.d.a)paramc.B(com.tencent.mm.plugin.appbrand.d.a.class));
          }
        }
        catch (Exception paramJSONObject)
        {
          ab.e("MicroMsg.JsApiAddMapControls", "parse controls error, exception : %s", new Object[] { paramJSONObject });
          a(paramc, paramInt, j("fail:internal error", null), false, localb.aDU());
          AppMethodBeat.o(93840);
        }
        continue;
        label441: a(paramc, paramInt, j("ok", null), true, localb.aDU());
        AppMethodBeat.o(93840);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.c
 * JD-Core Version:    0.6.2
 */
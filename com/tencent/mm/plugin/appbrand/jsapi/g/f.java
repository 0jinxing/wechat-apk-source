package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.h;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.v;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f extends a
{
  public static final int CTRL_INDEX = 492;
  public static final String NAME = "addMapPolygons";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93843);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiAddMapPolygons", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93843);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiAddMapPolygons", "data:%s", new Object[] { paramJSONObject });
      b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiAddMapPolygons", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93843);
      }
      else
      {
        try
        {
          if (paramJSONObject.has("polygons"))
          {
            localb.aEb();
            JSONArray localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>(paramJSONObject.optString("polygons"));
            for (int i = 0; i < localJSONArray.length(); i++)
            {
              Object localObject1 = (JSONObject)localJSONArray.get(i);
              paramJSONObject = new java/util/ArrayList;
              paramJSONObject.<init>();
              Object localObject2 = new org/json/JSONArray;
              ((JSONArray)localObject2).<init>(((JSONObject)localObject1).optString("points"));
              for (int j = 0; j < ((JSONArray)localObject2).length(); j++)
              {
                Object localObject3 = ((JSONArray)localObject2).getJSONObject(j);
                float f1 = bo.getFloat(((JSONObject)localObject3).optString("latitude"), 0.0F);
                float f2 = bo.getFloat(((JSONObject)localObject3).optString("longitude"), 0.0F);
                localObject3 = new com/tencent/mm/plugin/appbrand/jsapi/g/f$1;
                ((1)localObject3).<init>(this, f1, f2);
                paramJSONObject.add(localObject3);
              }
              int k = g.by(((JSONObject)localObject1).optString("fillColor", ""), Color.parseColor("#000000"));
              j = g.by(((JSONObject)localObject1).optString("strokeColor", ""), Color.parseColor("#000000"));
              int m = g.a((JSONObject)localObject1, "strokeWidth", 0);
              int n = ((JSONObject)localObject1).optInt("zIndex", 0);
              localObject2 = new com/tencent/mm/plugin/appbrand/jsapi/g/a/b$v;
              ((b.v)localObject2).<init>();
              localObject1 = new java/util/ArrayList;
              ((ArrayList)localObject1).<init>();
              ((b.v)localObject2).hNV = ((List)localObject1);
              ((b.v)localObject2).hNV.addAll(paramJSONObject);
              ((b.v)localObject2).fillColor = k;
              ((b.v)localObject2).strokeWidth = m;
              ((b.v)localObject2).strokeColor = j;
              ((b.v)localObject2).zIndex = n;
              localb.a((b.v)localObject2);
            }
          }
          ab.e("MicroMsg.JsApiAddMapPolygons", "data has not lines info");
          a(paramc, paramInt, j("ok", null), true, localb.aDU());
          AppMethodBeat.o(93843);
        }
        catch (Exception paramJSONObject)
        {
          ab.e("MicroMsg.JsApiAddMapPolygons", "parse lines error, exception : %s", new Object[] { paramJSONObject });
          a(paramc, paramInt, j("fail:internal error", null), false, localb.aDU());
          AppMethodBeat.o(93843);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.f
 * JD-Core Version:    0.6.2
 */
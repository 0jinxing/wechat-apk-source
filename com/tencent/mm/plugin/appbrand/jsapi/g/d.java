package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.j;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends a
{
  public static final int CTRL_INDEX = 134;
  public static final String NAME = "addMapLines";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93841);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiAddMapLines", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93841);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiAddMapLines", "data:%s", new Object[] { paramJSONObject });
      com.tencent.mm.plugin.appbrand.jsapi.g.a.b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiAddMapLines", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93841);
      }
      else
      {
        try
        {
          if (paramJSONObject.has("lines"))
          {
            localb.aDY();
            JSONArray localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>(paramJSONObject.optString("lines"));
            for (int i = 0; i < localJSONArray.length(); i++)
            {
              paramJSONObject = (JSONObject)localJSONArray.get(i);
              Object localObject1 = new java/util/ArrayList;
              ((ArrayList)localObject1).<init>();
              Object localObject2 = new org/json/JSONArray;
              ((JSONArray)localObject2).<init>(paramJSONObject.optString("points"));
              for (int j = 0; j < ((JSONArray)localObject2).length(); j++)
              {
                localObject3 = ((JSONArray)localObject2).getJSONObject(j);
                float f1 = bo.getFloat(((JSONObject)localObject3).optString("latitude"), 0.0F);
                float f2 = bo.getFloat(((JSONObject)localObject3).optString("longitude"), 0.0F);
                localObject3 = new com/tencent/mm/plugin/appbrand/jsapi/g/d$1;
                ((d.1)localObject3).<init>(this, f1, f2);
                ((List)localObject1).add(localObject3);
              }
              Object localObject4 = paramJSONObject.optString("id");
              int k = g.by(paramJSONObject.optString("color", ""), Color.parseColor("#000000"));
              int m = paramJSONObject.optInt("style", -1);
              int n = g.a(paramJSONObject, "width", 0);
              boolean bool1 = paramJSONObject.optBoolean("dottedLine", false);
              int i1 = g.by(paramJSONObject.optString("borderColor", ""), Color.parseColor("#000000"));
              int i2 = g.a(paramJSONObject, "borderWidth", 0);
              boolean bool2 = paramJSONObject.optBoolean("arrowLine", false);
              Object localObject3 = paramJSONObject.optString("arrowIconPath", "");
              j = g.a(paramJSONObject, "arrowGap", 0);
              localObject2 = new com/tencent/mm/plugin/appbrand/jsapi/g/a/b$j;
              ((b.j)localObject2).<init>();
              ((b.j)localObject2).id = ((String)localObject4);
              ((b.j)localObject2).style = m;
              localObject4 = new java/util/ArrayList;
              ((ArrayList)localObject4).<init>();
              ((b.j)localObject2).hNV = ((List)localObject4);
              ((b.j)localObject2).hNV.addAll((Collection)localObject1);
              ((b.j)localObject2).color = k;
              ((b.j)localObject2).width = n;
              ((b.j)localObject2).hNW = bool1;
              ((b.j)localObject2).borderColor = i1;
              ((b.j)localObject2).borderWidth = i2;
              ((b.j)localObject2).hNX = bool2;
              ((b.j)localObject2).hNZ = j;
              if (bool2)
                ((b.j)localObject2).hNY = ((com.tencent.mm.plugin.appbrand.d.b)paramc.B(com.tencent.mm.plugin.appbrand.d.b.class)).b(paramc, (String)localObject3);
              localObject1 = paramJSONObject.optString("buildingId");
              paramJSONObject = paramJSONObject.optString("floorName");
              ((b.j)localObject2).buildingId = ((String)localObject1);
              ((b.j)localObject2).floorName = paramJSONObject;
              localb.a((b.j)localObject2, (com.tencent.mm.plugin.appbrand.d.a)paramc.B(com.tencent.mm.plugin.appbrand.d.a.class));
            }
          }
          ab.e("MicroMsg.JsApiAddMapLines", "data has not lines info");
          a(paramc, paramInt, j("ok", null), true, localb.aDU());
          AppMethodBeat.o(93841);
        }
        catch (Exception paramJSONObject)
        {
          ab.e("MicroMsg.JsApiAddMapLines", "parse lines error, exception : %s", new Object[] { paramJSONObject });
          a(paramc, paramInt, j("fail:internal error", null), false, localb.aDU());
          AppMethodBeat.o(93841);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.d
 * JD-Core Version:    0.6.2
 */
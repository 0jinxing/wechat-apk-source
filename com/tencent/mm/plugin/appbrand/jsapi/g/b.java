package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends a
{
  public static final int CTRL_INDEX = 135;
  public static final String NAME = "addMapCircles";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93838);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiAddMapCircles", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93838);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiAddMapCircles", "data:%s", new Object[] { paramJSONObject });
      com.tencent.mm.plugin.appbrand.jsapi.g.a.b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiAddMapCircles", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93838);
      }
      else
      {
        try
        {
          if (!paramJSONObject.has("circles"))
            break label347;
          localb.aDW();
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>(paramJSONObject.optString("circles"));
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            paramJSONObject = (JSONObject)localJSONArray.get(i);
            float f1 = bo.getFloat(paramJSONObject.optString("latitude"), 0.0F);
            float f2 = bo.getFloat(paramJSONObject.optString("longitude"), 0.0F);
            int j = g.by(paramJSONObject.optString("color", ""), Color.parseColor("#000000"));
            int k = g.by(paramJSONObject.optString("fillColor", ""), Color.parseColor("#000000"));
            int m = paramJSONObject.optInt("radius");
            float f3 = g.a(paramJSONObject, "strokeWidth", 0.0F);
            paramJSONObject = new com/tencent/mm/plugin/appbrand/jsapi/g/a/b$b;
            paramJSONObject.<init>();
            double d1 = f1;
            double d2 = f2;
            paramJSONObject.latitude = d1;
            paramJSONObject.longitude = d2;
            paramJSONObject.radius = m;
            paramJSONObject.strokeColor = j;
            paramJSONObject.strokeWidth = ((int)f3);
            paramJSONObject.fillColor = k;
            localb.a(paramJSONObject);
          }
        }
        catch (Exception paramJSONObject)
        {
          ab.e("MicroMsg.JsApiAddMapCircles", "parse circles error, exception : %s", new Object[] { paramJSONObject });
          a(paramc, paramInt, j("fail:internal error", null), false, localb.aDU());
          AppMethodBeat.o(93838);
        }
        continue;
        label347: a(paramc, paramInt, j("ok", null), true, localb.aDU());
        AppMethodBeat.o(93838);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.b
 * JD-Core Version:    0.6.2
 */
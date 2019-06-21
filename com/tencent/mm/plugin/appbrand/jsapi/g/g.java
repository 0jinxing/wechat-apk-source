package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.h;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "eraseMapLines";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93844);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiEraseMapLines", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93844);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiEraseMapLines", "data:%s", new Object[] { paramJSONObject });
      b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiEraseMapLines", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93844);
      }
      else if (paramJSONObject.has("lines"))
      {
        try
        {
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>(paramJSONObject.optString("lines"));
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            JSONObject localJSONObject1 = (JSONObject)localJSONArray.get(i);
            String str = localJSONObject1.optString("id");
            if (!bo.isNullOrNil(str))
            {
              paramJSONObject = null;
              JSONObject localJSONObject2 = localJSONObject1.optJSONObject("point");
              if (localJSONObject2 != null)
              {
                float f1 = bo.getFloat(localJSONObject2.optString("latitude"), 0.0F);
                float f2 = bo.getFloat(localJSONObject2.optString("longitude"), 0.0F);
                paramJSONObject = new com/tencent/mm/plugin/appbrand/jsapi/g/a/b$h;
                paramJSONObject.<init>(f1, f2);
              }
              if (paramJSONObject != null)
                localb.a(str, localJSONObject1.optInt("index", 0), paramJSONObject, localJSONObject1.optBoolean("clear", true));
            }
          }
          a(paramc, paramInt, j("ok", null), true, localb.aDU());
          AppMethodBeat.o(93844);
        }
        catch (JSONException paramJSONObject)
        {
          ab.c("MicroMsg.JsApiEraseMapLines", "", new Object[] { paramJSONObject });
          a(paramc, paramInt, j("fail:internal error", null), false, localb.aDU());
          AppMethodBeat.o(93844);
        }
      }
      else
      {
        ab.e("MicroMsg.JsApiEraseMapLines", "data has not lines info");
        a(paramc, paramInt, j("fail:invalid data", null), false, localb.aDU());
        AppMethodBeat.o(93844);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.g
 * JD-Core Version:    0.6.2
 */
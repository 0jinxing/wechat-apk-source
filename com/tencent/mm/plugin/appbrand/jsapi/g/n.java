package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n extends a
{
  public static final int CTRL_INDEX = 136;
  public static final String NAME = "includeMapPoints";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93851);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiIncludeMapPoints", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93851);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiIncludeMapPoints", "data:%s", new Object[] { paramJSONObject });
      b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiIncludeMapPoints", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93851);
      }
      else
      {
        try
        {
          if (paramJSONObject.has("points"))
          {
            ArrayList localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
            Object localObject = paramJSONObject.optString("points");
            JSONArray localJSONArray;
            if (!bo.isNullOrNil((String)localObject))
            {
              localJSONArray = new org/json/JSONArray;
              localJSONArray.<init>((String)localObject);
              for (i = 0; i < localJSONArray.length(); i++)
              {
                localObject = (JSONObject)localJSONArray.get(i);
                float f1 = bo.getFloat(((JSONObject)localObject).optString("latitude"), 0.0F);
                float f2 = bo.getFloat(((JSONObject)localObject).optString("longitude"), 0.0F);
                localObject = new com/tencent/mm/plugin/appbrand/jsapi/g/n$1;
                ((n.1)localObject).<init>(this, f1, f2);
                localArrayList.add(localObject);
              }
            }
            int i = 0;
            paramJSONObject = paramJSONObject.optString("padding");
            if (!bo.isNullOrNil(paramJSONObject))
            {
              localJSONArray = new org/json/JSONArray;
              localJSONArray.<init>(paramJSONObject);
              i = g.a(localJSONArray, 0);
            }
            if (localArrayList.size() > 0)
              localb.h(localArrayList, i);
          }
          a(paramc, paramInt, j("ok", null), true, localb.aDU());
          AppMethodBeat.o(93851);
        }
        catch (Exception paramJSONObject)
        {
          ab.e("MicroMsg.JsApiIncludeMapPoints", "parse points error, exception : %s", new Object[] { paramJSONObject });
          paramc.M(paramInt, j("fail:internal error", null));
          AppMethodBeat.o(93851);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.n
 * JD-Core Version:    0.6.2
 */
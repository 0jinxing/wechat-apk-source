package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class r extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "removeMapLines";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93869);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiRemoveMapLines", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93869);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiRemoveMapLines", "data:%s", new Object[] { paramJSONObject });
      b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiRemoveMapLines", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93869);
      }
      else if (paramJSONObject.has("lines"))
      {
        try
        {
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>(paramJSONObject.optString("lines"));
          for (int i = 0; i < localJSONArray.length(); i++)
            localb.Bg(localJSONArray.getString(i));
        }
        catch (JSONException paramJSONObject)
        {
          ab.printErrStackTrace("MicroMsg.JsApiRemoveMapLines", paramJSONObject, "", new Object[0]);
          paramc.M(paramInt, j("fail:internal error", null));
          AppMethodBeat.o(93869);
        }
      }
      else
      {
        a(paramc, paramInt, j("ok", null), true, localb.aDU());
        AppMethodBeat.o(93869);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.r
 * JD-Core Version:    0.6.2
 */
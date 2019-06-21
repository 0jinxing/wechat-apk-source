package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.p;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

final class o$7
  implements b.u
{
  o$7(o paramo, int paramInt, e parame)
  {
  }

  public final void a(b.p paramp)
  {
    AppMethodBeat.i(93858);
    o.e locale = new o.e();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mapId", this.hCN);
      localJSONObject.put("latitude", paramp.latitude);
      localJSONObject.put("longitude", paramp.longitude);
      localJSONObject.put("name", paramp.name);
      if (!bo.isNullOrNil(paramp.buildingId))
      {
        localJSONObject.put("buildingId", paramp.buildingId);
        localJSONObject.put("floorName", paramp.floorName);
      }
      locale.AM(localJSONObject.toString());
      this.hMK.b(locale);
      ab.v("MicroMsg.JsApiInsertMap", "OnMapPoiClick %s", new Object[] { localJSONObject.toString() });
      AppMethodBeat.o(93858);
      return;
    }
    catch (JSONException paramp)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", new Object[] { paramp });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.o.7
 * JD-Core Version:    0.6.2
 */
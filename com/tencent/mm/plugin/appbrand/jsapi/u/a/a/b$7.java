package com.tencent.mm.plugin.appbrand.jsapi.u.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.p;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.u;
import com.tencent.mm.plugin.appbrand.jsapi.g.o.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class b$7
  implements b.u
{
  public b$7(b paramb, int paramInt, c paramc)
  {
  }

  public final void a(b.p paramp)
  {
    AppMethodBeat.i(117359);
    o.e locale = new o.e();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mapId", this.hMD);
      localJSONObject.put("latitude", paramp.latitude);
      localJSONObject.put("longitude", paramp.longitude);
      localJSONObject.put("name", paramp.name);
      if (!bo.isNullOrNil(paramp.buildingId))
      {
        localJSONObject.put("buildingId", paramp.buildingId);
        localJSONObject.put("floorName", paramp.floorName);
      }
      locale.AM(localJSONObject.toString());
      this.hyd.b(locale);
      ab.v("MicroMsg.JsApiInsertXWebMap", "OnMapPoiClick %s", new Object[] { localJSONObject.toString() });
      AppMethodBeat.o(117359);
      return;
    }
    catch (JSONException paramp)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", new Object[] { paramp });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.7
 * JD-Core Version:    0.6.2
 */
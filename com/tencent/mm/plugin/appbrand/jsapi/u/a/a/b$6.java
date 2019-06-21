package com.tencent.mm.plugin.appbrand.jsapi.u.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.l;
import com.tencent.mm.plugin.appbrand.jsapi.g.o.b;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class b$6
  implements b.l
{
  public b$6(b paramb, int paramInt, c paramc)
  {
  }

  public final void aDL()
  {
    AppMethodBeat.i(117358);
    o.b localb = new o.b();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mapId", this.hMD);
      localb.AM(localJSONObject.toString());
      this.hyd.b(localb);
      AppMethodBeat.o(117358);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", new Object[] { localJSONException });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.6
 * JD-Core Version:    0.6.2
 */
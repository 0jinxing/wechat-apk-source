package com.tencent.mm.plugin.appbrand.jsapi.u.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.k;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.q;
import com.tencent.mm.plugin.appbrand.jsapi.g.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class b$4
  implements b.k
{
  public b$4(b paramb, int paramInt, c paramc)
  {
  }

  public final void a(b.q paramq)
  {
    AppMethodBeat.i(117356);
    o.a locala = new o.a();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mapId", this.hMD);
      localJSONObject.put("data", paramq.data);
      locala.AM(localJSONObject.toString());
      this.hyd.b(locala);
      AppMethodBeat.o(117356);
      return;
    }
    catch (JSONException paramq)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", new Object[] { paramq });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.4
 * JD-Core Version:    0.6.2
 */
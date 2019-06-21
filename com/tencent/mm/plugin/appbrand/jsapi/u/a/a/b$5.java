package com.tencent.mm.plugin.appbrand.jsapi.u.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.n;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.q;
import com.tencent.mm.plugin.appbrand.jsapi.g.o.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class b$5
  implements b.n
{
  public b$5(b paramb, int paramInt, c paramc)
  {
  }

  public final boolean b(b.q paramq)
  {
    AppMethodBeat.i(117357);
    o.d locald = new o.d();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mapId", this.hMD);
      localJSONObject.put("data", paramq.data);
      locald.AM(localJSONObject.toString());
      this.hyd.b(locald);
      AppMethodBeat.o(117357);
      return false;
    }
    catch (JSONException paramq)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", new Object[] { paramq });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.5
 * JD-Core Version:    0.6.2
 */
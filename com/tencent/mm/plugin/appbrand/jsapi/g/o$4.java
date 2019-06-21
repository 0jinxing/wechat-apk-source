package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.k;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.q;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class o$4
  implements b.k
{
  o$4(o paramo, int paramInt, e parame)
  {
  }

  public final void a(b.q paramq)
  {
    AppMethodBeat.i(93855);
    o.a locala = new o.a();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mapId", this.hCN);
      localJSONObject.put("data", paramq.data);
      locala.AM(localJSONObject.toString());
      this.hMK.b(locala);
      AppMethodBeat.o(93855);
      return;
    }
    catch (JSONException paramq)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", new Object[] { paramq });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.o.4
 * JD-Core Version:    0.6.2
 */
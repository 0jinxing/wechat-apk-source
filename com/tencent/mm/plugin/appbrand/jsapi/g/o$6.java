package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.l;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class o$6
  implements b.l
{
  o$6(o paramo, int paramInt, e parame)
  {
  }

  public final void aDL()
  {
    AppMethodBeat.i(93857);
    o.b localb = new o.b();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mapId", this.hCN);
      localb.AM(localJSONObject.toString());
      this.hMK.b(localb);
      AppMethodBeat.o(93857);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", new Object[] { localJSONException });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.o.6
 * JD-Core Version:    0.6.2
 */
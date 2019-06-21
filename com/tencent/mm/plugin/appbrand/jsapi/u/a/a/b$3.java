package com.tencent.mm.plugin.appbrand.jsapi.u.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class b$3
  implements f.c
{
  public b$3(b paramb, e parame, String paramString, c paramc, JSONObject paramJSONObject)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(117355);
    ab.i("MicroMsg.JsApiInsertXWebMap", "onDestroy");
    this.hCQ.b(this);
    g.ck(this.val$appId, f.g(this.hyd, this.hsm));
    AppMethodBeat.o(117355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.3
 * JD-Core Version:    0.6.2
 */
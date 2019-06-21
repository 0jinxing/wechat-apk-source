package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class c$3
  implements c.a
{
  c$3(c paramc1, com.tencent.mm.plugin.appbrand.jsapi.h paramh, f paramf, c paramc2, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void aqU()
  {
    AppMethodBeat.i(130818);
    ab.i("MicroMsg.AppBrandAuthJsApiQueue", "about to call AuthInvoke, api[%s]", new Object[] { this.hBJ.mName });
    if (!this.hBK.isRunning())
    {
      ab.e("MicroMsg.AppBrandAuthJsApiQueue", "doAuth but component not running, api = %s", new Object[] { this.hBL.getName() });
      this.hBM.sendMessage(2);
      AppMethodBeat.o(130818);
    }
    while (true)
    {
      return;
      this.hBL.a(this.hBK, this.hsm, this.eIl, this.hBM);
      AppMethodBeat.o(130818);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(130819);
    String str = hashCode() + "|" + this.hBL.getName();
    AppMethodBeat.o(130819);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.c.3
 * JD-Core Version:    0.6.2
 */
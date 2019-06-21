package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class g$1
  implements c
{
  g$1(g paramg, com.tencent.mm.plugin.appbrand.jsapi.c paramc)
  {
  }

  public final void bj(String paramString, int paramInt)
  {
    AppMethodBeat.i(126560);
    ab.i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo onPreLoadFail err_code = %s, url = %s", new Object[] { Integer.valueOf(paramInt), paramString });
    g.a(this.hyd, paramString, -5, paramInt);
    AppMethodBeat.o(126560);
  }

  public final void cv(String paramString1, String paramString2)
  {
    AppMethodBeat.i(126559);
    ab.i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo onPreLoadSucc save_path = %s, url = %s", new Object[] { paramString2, paramString1 });
    paramString2 = this.hyd;
    HashMap localHashMap = new HashMap();
    localHashMap.put("resource", paramString1);
    paramString1 = new JSONObject(localHashMap).toString();
    new k.k().j(paramString2).AM(paramString1).aCj();
    AppMethodBeat.o(126559);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.g.1
 * JD-Core Version:    0.6.2
 */
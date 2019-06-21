package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class b$1
  implements JsApiAppBrandNFCBase.a
{
  b$1(b paramb, c paramc, int paramInt)
  {
  }

  public final void T(int paramInt, String paramString)
  {
    AppMethodBeat.i(137867);
    ab.i("MicroMsg.JsApiGetHCEState", "alvinluo checkIsSupport onResult errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    HashMap localHashMap = new HashMap();
    localHashMap.put("errCode", Integer.valueOf(paramInt));
    if (paramInt == 0)
    {
      this.hxc.M(this.eIl, this.hSa.j("ok", localHashMap));
      AppMethodBeat.o(137867);
    }
    while (true)
    {
      return;
      this.hxc.M(this.eIl, this.hSa.j("fail ".concat(String.valueOf(paramString)), localHashMap));
      AppMethodBeat.o(137867);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.b.1
 * JD-Core Version:    0.6.2
 */
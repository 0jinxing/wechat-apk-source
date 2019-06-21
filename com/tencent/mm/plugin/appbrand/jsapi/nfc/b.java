package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import org.json.JSONObject;

public final class b extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 358;
  public static final String NAME = "getHCEState";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(137868);
    a(new b.1(this, paramc, paramInt));
    AppMethodBeat.o(137868);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.b
 * JD-Core Version:    0.6.2
 */
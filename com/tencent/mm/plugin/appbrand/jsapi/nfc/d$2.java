package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.sdk.platformtools.ab;

final class d$2 extends g.c
{
  d$2(d paramd)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(137874);
    ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo AppBrandLifeCycle onDestroy");
    HCEEventLogic.eo(true);
    AppMethodBeat.o(137874);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.d.2
 * JD-Core Version:    0.6.2
 */
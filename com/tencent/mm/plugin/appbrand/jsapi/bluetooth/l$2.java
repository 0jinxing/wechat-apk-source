package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.b;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class l$2
  implements b
{
  l$2(l paraml, String paramString, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(94192);
    ab.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "appId:%s notifyBLECharacteristicValueChanged result:%s", new Object[] { this.val$appId, paramj });
    switch (paramj.errCode)
    {
    default:
      new HashMap().put("errCode", Integer.valueOf(paramj.errCode));
      this.hxc.M(this.eIl, this.hDA.j(paramj.aIm, null));
      c.kT(43);
      AppMethodBeat.o(94192);
    case 0:
    }
    while (true)
    {
      return;
      new HashMap().put("errCode", Integer.valueOf(0));
      this.hxc.M(this.eIl, this.hDA.j("ok", null));
      c.kT(42);
      AppMethodBeat.o(94192);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.2
 * JD-Core Version:    0.6.2
 */
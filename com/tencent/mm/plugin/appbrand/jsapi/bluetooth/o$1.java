package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.b;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class o$1
  implements b
{
  o$1(o paramo, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(94206);
    ab.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "[onScanResult]result:%s", new Object[] { paramj });
    switch (paramj.errCode)
    {
    default:
      HashMap localHashMap = new HashMap();
      localHashMap.put("errCode", Integer.valueOf(paramj.errCode));
      localHashMap.put("isDiscovering", Boolean.FALSE);
      this.hxc.M(this.eIl, this.hDH.j(paramj.aIm, localHashMap));
      c.kT(13);
      AppMethodBeat.o(94206);
    case 0:
    }
    while (true)
    {
      return;
      paramj = new HashMap();
      paramj.put("errCode", Integer.valueOf(0));
      paramj.put("isDiscovering", Boolean.TRUE);
      this.hxc.M(this.eIl, this.hDH.j("ok", paramj));
      c.kT(12);
      AppMethodBeat.o(94206);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o.1
 * JD-Core Version:    0.6.2
 */
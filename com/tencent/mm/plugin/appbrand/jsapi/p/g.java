package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.s.t.a;
import java.util.HashMap;
import java.util.Map;

final class g extends ah
{
  static final int CTRL_INDEX = 473;
  static final String NAME = "onDeviceOrientationChange";

  final void a(t.a parama)
  {
    AppMethodBeat.i(126385);
    String str = parama.name().replace("_", "");
    parama = new HashMap(2);
    parama.put("errMsg", "ok");
    parama.put("value", str);
    t(parama).aCj();
    AppMethodBeat.o(126385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.g
 * JD-Core Version:    0.6.2
 */
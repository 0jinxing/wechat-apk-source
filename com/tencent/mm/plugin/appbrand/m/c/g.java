package com.tencent.mm.plugin.appbrand.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.i;
import com.tencent.mm.plugin.appbrand.m.a.b;
import com.tencent.mm.plugin.appbrand.m.a.c;
import com.tencent.mm.plugin.appbrand.permission.d;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

public final class g extends b
{
  static void a(c paramc, int paramInt)
  {
    AppMethodBeat.i(102202);
    HashMap localHashMap = new HashMap();
    localHashMap.put("result", Integer.valueOf(paramInt));
    paramc.B(localHashMap);
    AppMethodBeat.o(102202);
  }

  public final void a(i parami, c paramc)
  {
    AppMethodBeat.i(102201);
    String str = parami.optString("apiName");
    parami = paramc.gMN;
    if (d.cK(parami.getAppId(), str))
    {
      a(paramc, 1);
      AppMethodBeat.o(102201);
    }
    while (true)
    {
      return;
      d.a(parami, str, new g.1(this, paramc));
      AppMethodBeat.o(102201);
    }
  }

  public final int aIT()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.c.g
 * JD-Core Version:    0.6.2
 */
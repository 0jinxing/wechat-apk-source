package com.tencent.mm.plugin.appbrand.m.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c.a;
import java.util.HashMap;
import java.util.Map;

final class c$1
  implements c.a
{
  c$1(c paramc)
  {
  }

  public final void a(String paramString, b paramb)
  {
    AppMethodBeat.i(102210);
    paramString = new HashMap();
    paramString.put("state", Integer.valueOf(paramb.ordinal()));
    this.iqo.D(paramString);
    AppMethodBeat.o(102210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.d.c.1
 * JD-Core Version:    0.6.2
 */
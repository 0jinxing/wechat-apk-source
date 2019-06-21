package com.tencent.mm.plugin.appbrand.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.m.a.e.a;
import com.tencent.mm.plugin.appbrand.m.d.a;
import com.tencent.mm.plugin.appbrand.m.d.b;
import com.tencent.mm.plugin.appbrand.m.d.c;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  private static final Map<Integer, com.tencent.mm.plugin.appbrand.m.a.e> ipX;

  static
  {
    AppMethodBeat.i(102184);
    ipX = new HashMap();
    AppMethodBeat.o(102184);
  }

  protected static void a(e.a parama, q paramq)
  {
    AppMethodBeat.i(102181);
    a(new a(parama, paramq));
    a(new c(parama, paramq));
    a(new b(parama, paramq));
    AppMethodBeat.o(102181);
  }

  private static final void a(com.tencent.mm.plugin.appbrand.m.a.e parame)
  {
    AppMethodBeat.i(102183);
    ipX.put(Integer.valueOf(parame.getType()), parame);
    AppMethodBeat.o(102183);
  }

  public static com.tencent.mm.plugin.appbrand.m.a.e pq(int paramInt)
  {
    AppMethodBeat.i(102182);
    com.tencent.mm.plugin.appbrand.m.a.e locale = (com.tencent.mm.plugin.appbrand.m.a.e)ipX.get(Integer.valueOf(paramInt));
    AppMethodBeat.o(102182);
    return locale;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.e
 * JD-Core Version:    0.6.2
 */
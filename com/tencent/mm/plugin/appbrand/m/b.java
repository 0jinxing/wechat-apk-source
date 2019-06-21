package com.tencent.mm.plugin.appbrand.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.m.c.c;
import com.tencent.mm.plugin.appbrand.m.c.d;
import com.tencent.mm.plugin.appbrand.m.c.e;
import com.tencent.mm.plugin.appbrand.m.c.f;
import com.tencent.mm.plugin.appbrand.m.c.g;
import com.tencent.mm.plugin.appbrand.m.c.h;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static final Map<Integer, com.tencent.mm.plugin.appbrand.m.a.a> ipQ;

  static
  {
    AppMethodBeat.i(102170);
    ipQ = new HashMap();
    a(new com.tencent.mm.plugin.appbrand.m.c.a());
    a(new d());
    a(new f());
    a(new h());
    a(new g());
    a(new c());
    a(new com.tencent.mm.plugin.appbrand.m.c.b());
    a(new e());
    AppMethodBeat.o(102170);
  }

  private static void a(com.tencent.mm.plugin.appbrand.m.a.a parama)
  {
    AppMethodBeat.i(102169);
    ipQ.put(Integer.valueOf(parama.aIT()), parama);
    AppMethodBeat.o(102169);
  }

  public static com.tencent.mm.plugin.appbrand.m.a.a pp(int paramInt)
  {
    AppMethodBeat.i(102168);
    com.tencent.mm.plugin.appbrand.m.a.a locala = (com.tencent.mm.plugin.appbrand.m.a.a)ipQ.get(Integer.valueOf(paramInt));
    AppMethodBeat.o(102168);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.b
 * JD-Core Version:    0.6.2
 */
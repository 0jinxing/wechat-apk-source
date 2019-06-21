package com.tencent.mm.plugin.appbrand.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

public final class a extends com.tencent.mm.plugin.appbrand.m.a.d
{
  public final int aIT()
  {
    return 2;
  }

  public final String b(com.tencent.mm.aa.i parami, com.tencent.mm.plugin.appbrand.m.a.c paramc)
  {
    AppMethodBeat.i(102192);
    q localq = paramc.gMN;
    parami = new HashMap();
    parami.put("state", Integer.valueOf(localq.getRuntime().gNN.gWy.awz().ordinal()));
    parami = paramc.B(parami);
    AppMethodBeat.o(102192);
    return parami;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.c.a
 * JD-Core Version:    0.6.2
 */
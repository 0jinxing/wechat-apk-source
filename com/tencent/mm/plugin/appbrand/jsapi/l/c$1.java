package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s;
import java.util.Map;

final class c$1
  implements b.a
{
  c$1(c paramc, s params, int paramInt)
  {
  }

  public final void a(int paramInt, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(131411);
    switch (paramInt)
    {
    default:
      this.hsj.M(this.eIl, this.hTO.j("fail", null));
      AppMethodBeat.o(131411);
    case 1:
    }
    while (true)
    {
      return;
      this.hsj.M(this.eIl, this.hTO.j("ok", null));
      AppMethodBeat.o(131411);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.c.1
 * JD-Core Version:    0.6.2
 */
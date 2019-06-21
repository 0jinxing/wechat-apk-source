package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.l.k.a;
import java.util.Map;

final class bp$1
  implements k.a
{
  public final void d(c paramc, String paramString)
  {
    AppMethodBeat.i(86967);
    bp.1.1 local1 = new bp.1.1(this, paramc, paramString);
    bp.hzA.put(paramString, local1);
    ((h)paramc).getRuntime().gNN.a(local1);
    AppMethodBeat.o(86967);
  }

  public final void e(c paramc, String paramString)
  {
    AppMethodBeat.i(86968);
    paramString = (c.a)bp.hzA.get(paramString);
    if (paramString != null)
    {
      paramc = ((h)paramc).getRuntime();
      if (paramc != null)
        paramc.gNN.b(paramString);
    }
    AppMethodBeat.o(86968);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bp.1
 * JD-Core Version:    0.6.2
 */
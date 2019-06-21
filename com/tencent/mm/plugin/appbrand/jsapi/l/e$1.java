package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import java.util.Map;

final class e$1
  implements b.a
{
  e$1(e parame, h paramh, int paramInt)
  {
  }

  public final void a(int paramInt, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(131415);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(131415);
      while (true)
      {
        return;
        this.hwr.M(this.eIl, this.hTQ.j("ok", null));
        AppMethodBeat.o(131415);
        continue;
        this.hwr.M(this.eIl, this.hTQ.j("fail:".concat(String.valueOf(paramString)), null));
        AppMethodBeat.o(131415);
      }
      this.hwr.M(this.eIl, this.hTQ.j("cancel", null));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.e.1
 * JD-Core Version:    0.6.2
 */
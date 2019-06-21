package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s;
import java.util.Map;

final class d$1
  implements b.a
{
  d$1(d paramd, s params, int paramInt)
  {
  }

  public final void a(int paramInt, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(131413);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(131413);
      while (true)
      {
        return;
        this.hsj.M(this.eIl, this.hTP.j("ok", null));
        AppMethodBeat.o(131413);
        continue;
        this.hsj.M(this.eIl, this.hTP.j("fail:".concat(String.valueOf(paramString)), null));
        AppMethodBeat.o(131413);
      }
      this.hsj.M(this.eIl, this.hTP.j("cancel", null));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.d.1
 * JD-Core Version:    0.6.2
 */
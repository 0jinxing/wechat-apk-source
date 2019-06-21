package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s;
import java.util.Map;

final class f$1
  implements b.a
{
  f$1(f paramf, s params, int paramInt)
  {
  }

  public final void a(int paramInt, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(131417);
    switch (paramInt)
    {
    default:
      this.hsj.M(this.eIl, this.hTR.j("fail:".concat(String.valueOf(paramString)), null));
      AppMethodBeat.o(131417);
    case 1:
    }
    while (true)
    {
      return;
      this.hsj.M(this.eIl, this.hTR.j("ok", paramMap));
      AppMethodBeat.o(131417);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.f.1
 * JD-Core Version:    0.6.2
 */
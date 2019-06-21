package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class h$1
  implements b.a
{
  h$1(h paramh, s params, int paramInt)
  {
  }

  public final void a(int paramInt, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(131421);
    switch (paramInt)
    {
    default:
      this.hsj.M(this.eIl, this.hTU.j("cancel", null));
      AppMethodBeat.o(131421);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.hsj.M(this.eIl, this.hTU.j("ok", null));
      AppMethodBeat.o(131421);
      continue;
      if (bo.isNullOrNil(paramString))
      {
        this.hsj.M(this.eIl, this.hTU.j("fail", null));
        AppMethodBeat.o(131421);
      }
      else
      {
        this.hsj.M(this.eIl, this.hTU.j(String.format("fail %s", new Object[] { paramString }), null));
        AppMethodBeat.o(131421);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.h.1
 * JD-Core Version:    0.6.2
 */
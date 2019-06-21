package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c.a;
import java.util.Map;

final class c$2
  implements c.a
{
  c$2(c paramc)
  {
  }

  public final void a(String paramString, b arg2)
  {
    AppMethodBeat.i(130817);
    if (??? == b.gWw)
      c.a(this.hBJ);
    while (true)
    {
      synchronized (c.awn())
      {
        c.awn().remove(paramString);
        AppMethodBeat.o(130817);
        return;
      }
      AppMethodBeat.o(130817);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.c.2
 * JD-Core Version:    0.6.2
 */
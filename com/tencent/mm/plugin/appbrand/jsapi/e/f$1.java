package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c.a;

final class f$1
  implements c.a
{
  f$1(f paramf)
  {
  }

  public final void a(String paramString, b paramb)
  {
    AppMethodBeat.i(74740);
    if (paramb == b.gWw)
    {
      this.hKN.hKK.quit();
      AppMethodBeat.o(74740);
    }
    while (true)
    {
      return;
      if (paramb == b.gWv)
      {
        this.hKN.hKK.sendMessage(3);
        AppMethodBeat.o(74740);
      }
      else
      {
        if (paramb == b.gWt)
          this.hKN.hKK.sendMessage(4);
        AppMethodBeat.o(74740);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.f.1
 * JD-Core Version:    0.6.2
 */
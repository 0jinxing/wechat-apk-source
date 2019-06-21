package com.tencent.mm.plugin.appbrand.game.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.a.a;
import com.tencent.mm.plugin.appbrand.config.a.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s;

final class b$1
  implements a.a
{
  b$1(b paramb, s params, int paramInt)
  {
  }

  public final void a(a.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(130191);
    s locals = this.hsj;
    int i = this.eIl;
    b localb = this.hsk;
    if (paramBoolean);
    for (paramb = "ok"; ; paramb = "fail")
    {
      locals.M(i, localb.j(paramb, null));
      AppMethodBeat.o(130191);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.b.1
 * JD-Core Version:    0.6.2
 */
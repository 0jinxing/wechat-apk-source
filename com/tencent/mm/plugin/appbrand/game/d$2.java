package com.tencent.mm.plugin.appbrand.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.g;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.s.l;
import com.tencent.mm.plugin.appbrand.s.m;
import com.tencent.mm.sdk.platformtools.ab;

final class d$2
  implements h
{
  d$2(d paramd, g paramg)
  {
  }

  public final void C(String paramString1, String paramString2)
  {
    AppMethodBeat.i(130039);
    ab.e("MicroMsg.WAGameJsContextInterface", "[WAGameJsException] hy: on exception! message: %s, stacktrace %s", new Object[] { paramString1, paramString2 });
    m.a(this.gMQ, "onError", String.format("{'message':'%s', 'stack': '%s'}", new Object[] { l.Ej(paramString1), l.Ej(paramString2) }));
    AppMethodBeat.o(130039);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.2
 * JD-Core Version:    0.6.2
 */
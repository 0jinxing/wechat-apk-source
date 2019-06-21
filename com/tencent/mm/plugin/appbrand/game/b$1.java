package com.tencent.mm.plugin.appbrand.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.jsapi.bo;
import com.tencent.mm.plugin.appbrand.report.quality.f;
import com.tencent.mm.plugin.appbrand.s.l;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements h
{
  b$1(b paramb)
  {
  }

  public final void C(String paramString1, String paramString2)
  {
    AppMethodBeat.i(130000);
    ab.e("MicroMsg.WAGameAppService", "[WAGameJsException] hy: wxa main context exception %s %s", new Object[] { paramString1, paramString2 });
    bo.a(this.hqr.aBx(), "onError", String.format("{'message':'%s', 'stack': '%s'}", new Object[] { l.Ej(paramString1), l.Ej(paramString2) }), 0);
    try
    {
      f.a(this.hqr, paramString1, paramString2);
      AppMethodBeat.o(130000);
      return;
    }
    catch (Throwable paramString1)
    {
      while (true)
        AppMethodBeat.o(130000);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.1
 * JD-Core Version:    0.6.2
 */
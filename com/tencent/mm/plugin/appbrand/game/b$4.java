package com.tencent.mm.plugin.appbrand.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$4
  implements n.a
{
  b$4(b paramb)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(130005);
    ab.i("MicroMsg.WAGameAppService", "fail");
    AppMethodBeat.o(130005);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(130004);
    ab.i("MicroMsg.WAGameAppService", "dl: it's ok");
    AppMethodBeat.o(130004);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.4
 * JD-Core Version:    0.6.2
 */
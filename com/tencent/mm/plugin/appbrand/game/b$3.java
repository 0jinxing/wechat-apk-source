package com.tencent.mm.plugin.appbrand.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$3
  implements n.a
{
  b$3(b paramb)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(130003);
    ab.e("MicroMsg.WAGameAppService", "Inject WAGame Library Script Failed: %s", new Object[] { paramString });
    AppMethodBeat.o(130003);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(130002);
    ab.i("MicroMsg.WAGameAppService", "Inject WAGame Library Script suc: %s", new Object[] { paramString });
    AppMethodBeat.o(130002);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.3
 * JD-Core Version:    0.6.2
 */
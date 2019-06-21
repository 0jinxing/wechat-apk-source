package com.tencent.mm.plugin.appbrand.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements n.a
{
  d$1(d paramd)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(130038);
    ab.i("MicroMsg.WAGameJsContextInterface", "Interface dl: fail");
    AppMethodBeat.o(130038);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(130037);
    ab.i("MicroMsg.WAGameJsContextInterface", "Interface dl: success");
    AppMethodBeat.o(130037);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.1
 * JD-Core Version:    0.6.2
 */
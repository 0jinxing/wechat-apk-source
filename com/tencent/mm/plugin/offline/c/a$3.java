package com.tencent.mm.plugin.offline.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.c;
import com.tencent.mm.network.e;

final class a$3
  implements bk.a
{
  public final void a(e parame)
  {
    AppMethodBeat.i(43648);
    if ((parame == null) || (parame.adg() == null))
      AppMethodBeat.o(43648);
    while (true)
    {
      return;
      if (a.access$000() != null)
        parame.adg().o("offline_token", a.access$000().getBytes());
      if (a.paZ != null)
        parame.adg().o("offline_token_V2", a.paZ.getBytes());
      if (a.pbc != null)
        parame.adg().o("offline_key_list", a.pbc.getBytes());
      AppMethodBeat.o(43648);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.c.a.3
 * JD-Core Version:    0.6.2
 */
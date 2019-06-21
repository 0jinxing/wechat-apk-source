package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.fts.a.a.a;

final class g$d extends a
{
  private g$d(g paramg)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136801);
    com.tencent.mm.kernel.g.RP().eJN.hY(null, "UPDATE rconversation SET unReadCount = 0;");
    AppMethodBeat.o(136801);
    return true;
  }

  public final String getName()
  {
    return "FTSClearUnReadCountTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.g.d
 * JD-Core Version:    0.6.2
 */
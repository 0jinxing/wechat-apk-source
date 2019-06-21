package com.tencent.mm.plugin.clean.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(18694);
    if (d.access$000() == 0)
    {
      ab.i("MicroMsg.CleanLogic", "clean data");
      d.hd(0L);
      d.u(null);
      AppMethodBeat.o(18694);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CleanLogic", "clean data is using");
      AppMethodBeat.o(18694);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.d.1
 * JD-Core Version:    0.6.2
 */
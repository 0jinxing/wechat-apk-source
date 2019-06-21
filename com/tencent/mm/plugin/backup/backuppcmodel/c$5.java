package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.c.a;

final class c$5
  implements Runnable
{
  c$5(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17503);
    b.aTD().aTa().stop();
    b.aTD().aSw();
    com.tencent.mm.plugin.backup.g.b.aTV();
    com.tencent.mm.plugin.backup.g.b.aTX();
    AppMethodBeat.o(17503);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.c.5
 * JD-Core Version:    0.6.2
 */
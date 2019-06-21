package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$4
  implements ap.a
{
  c$4(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(17249);
    if (!c.access$200())
    {
      ab.e("MicroMsg.BackupMoveRecoverServer", "try connect overtime failed.");
      if (c.c(this.jtN) != null)
        c.c(this.jtN).stopTimer();
      c.d(this.jtN);
    }
    AppMethodBeat.o(17249);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.c.4
 * JD-Core Version:    0.6.2
 */
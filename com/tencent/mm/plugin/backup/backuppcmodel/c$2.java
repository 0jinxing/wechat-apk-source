package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$2
  implements ap.a
{
  c$2(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(17500);
    if (!c.access$200())
    {
      ab.e("MicroMsg.BackupPcProcessMgr", "tryConnect overtime failed.");
      if (c.c(this.jwk) != null)
        c.c(this.jwk).stopTimer();
      c.d(this.jwk);
    }
    AppMethodBeat.o(17500);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.c.2
 * JD-Core Version:    0.6.2
 */
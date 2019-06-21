package com.tencent.mm.plugin.dbbackup;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class d$9$2
  implements Runnable
{
  d$9$2(d.9 param9, boolean paramBoolean, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18980);
    d.a(this.kJa.kIO, null);
    aw.ZK();
    long l1 = new com.tencent.mm.vfs.b(c.Rw()).length();
    long l2 = bo.dpD();
    if (l1 == 0L)
    {
      ab.i("MicroMsg.SubCoreDBBackup", "Invalid database size, backup canceled.");
      AppMethodBeat.o(18980);
    }
    while (true)
    {
      return;
      if ((l1 > d.f(this.kJa.kIO)) || (l1 > l2))
      {
        ab.i("MicroMsg.SubCoreDBBackup", "Not enough disk space, backup canceled.");
        h.pYm.e(11098, new Object[] { Integer.valueOf(10008), String.format("%d|%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) }) });
        AppMethodBeat.o(18980);
      }
      else
      {
        d.d(this.kJa.kIO, this.kJa.kIO.a(this.kHS, this.kIC));
        if (d.o(this.kJa.kIO))
          ab.i("MicroMsg.SubCoreDBBackup", "Auto database backup started.");
        AppMethodBeat.o(18980);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.9.2
 * JD-Core Version:    0.6.2
 */
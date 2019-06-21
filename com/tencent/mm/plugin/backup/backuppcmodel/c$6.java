package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.g.j.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class c$6
  implements j.a
{
  c$6(c paramc)
  {
  }

  public final void aTn()
  {
    AppMethodBeat.i(17504);
    int i = b.aTD().aTE().jwa;
    if ((1 == i) || (3 == i))
    {
      b.aTD().aTF().ru(b.aTD().aSu().jqW);
      AppMethodBeat.o(17504);
    }
    while (true)
    {
      return;
      if ((2 == i) || (4 == i))
        b.aTD().aTG().rj(b.aTD().aSu().jqW);
      AppMethodBeat.o(17504);
    }
  }

  public final void aTo()
  {
    AppMethodBeat.i(17506);
    int i = b.aTD().aSu().jqW;
    ab.e("MicroMsg.BackupPcProcessMgr", "speedOverTime callback, backupState[%d]", new Object[] { Integer.valueOf(i) });
    int j = b.aTD().aTE().jwa;
    if (((1 == j) || (3 == j)) && ((i == 14) || (i == 4)))
    {
      b.aTD().aTa().stop();
      b.aTD().aTF().cancel(true);
      h.pYm.a(400L, 9L, 1L, false);
      b.aTD().aTF().rt(18);
      b.aTD().aSu().jqW = -4;
      b.aTD().aTF().ru(-4);
      AppMethodBeat.o(17506);
    }
    while (true)
    {
      return;
      if (((2 == j) || (4 == j)) && ((i == 23) || (i == 4)))
      {
        b.aTD().aTa().stop();
        b.aTD().aTG().c(true, false, -4);
        h.pYm.a(400L, 17L, 1L, false);
        b.aTD().aTG().rt(18);
      }
      AppMethodBeat.o(17506);
    }
  }

  public final void ro(int paramInt)
  {
    AppMethodBeat.i(17505);
    int i = b.aTD().aSu().jqW;
    if (paramInt == 1)
      if (((1 == c.h(this.jwk)) || (3 == c.h(this.jwk))) && (i == 14))
      {
        ab.i("MicroMsg.BackupPcProcessMgr", "speedCallback is weak connect now.");
        b.aTD().aSu().jqW = 4;
        b.aTD().aTF().ru(4);
        AppMethodBeat.o(17505);
      }
    while (true)
    {
      return;
      if (((2 == c.h(this.jwk)) || (4 == c.h(this.jwk))) && (i == 23))
      {
        ab.i("MicroMsg.BackupPcProcessMgr", "speedCallback is weak connect now.");
        b.aTD().aSu().jqW = 4;
        b.aTD().aTG().rj(4);
        AppMethodBeat.o(17505);
        continue;
        if ((paramInt == 0) && (i == 4))
        {
          ab.i("MicroMsg.BackupPcProcessMgr", "speedCallback is normal speed now.");
          if ((1 == c.h(this.jwk)) || (3 == c.h(this.jwk)))
          {
            b.aTD().aSu().jqW = 14;
            b.aTD().aTF().ru(14);
            AppMethodBeat.o(17505);
            continue;
          }
          if ((2 == c.h(this.jwk)) || (4 == c.h(this.jwk)))
          {
            b.aTD().aSu().jqW = 23;
            b.aTD().aTG().rj(23);
          }
        }
      }
      else
      {
        AppMethodBeat.o(17505);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.c.6
 * JD-Core Version:    0.6.2
 */
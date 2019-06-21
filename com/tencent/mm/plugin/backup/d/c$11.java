package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.g.j.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class c$11
  implements j.a
{
  c$11(c paramc)
  {
  }

  public final void aTn()
  {
    AppMethodBeat.i(17256);
    this.jtN.rj(b.aSZ().aSu().jqW);
    AppMethodBeat.o(17256);
  }

  public final void aTo()
  {
    AppMethodBeat.i(17258);
    int i = b.aSZ().aSu().jqW;
    ab.e("MicroMsg.BackupMoveRecoverServer", "speedOverTime callback, backupState[%d]", new Object[] { Integer.valueOf(i) });
    if ((i == 23) || (i == 4))
    {
      this.jtN.c(true, false, -4);
      h.pYm.a(485L, 43L, 1L, false);
      this.jtN.rn(4);
      b.aSZ().aTa().stop();
    }
    AppMethodBeat.o(17258);
  }

  public final void ro(int paramInt)
  {
    AppMethodBeat.i(17257);
    int i = b.aSZ().aSu().jqW;
    if (paramInt == 1)
    {
      if (i != 23)
        break label137;
      ab.i("MicroMsg.BackupMoveRecoverServer", "speedCallback is weak connect now.");
      b.aSZ().aSu().jqW = 4;
      this.jtN.rj(4);
      h.pYm.e(11789, new Object[] { Integer.valueOf(8) });
      AppMethodBeat.o(17257);
    }
    while (true)
    {
      return;
      if ((paramInt == 0) && (i == 4))
      {
        ab.i("MicroMsg.BackupMoveRecoverServer", "speedCallback is normal speed now.");
        b.aSZ().aSu().jqW = 23;
        this.jtN.rj(23);
        h.pYm.e(11789, new Object[] { Integer.valueOf(9) });
      }
      label137: AppMethodBeat.o(17257);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.c.11
 * JD-Core Version:    0.6.2
 */
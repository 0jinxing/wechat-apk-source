package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.g.j.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$3
  implements j.a
{
  d$3(d paramd)
  {
  }

  public final void aTn()
  {
    AppMethodBeat.i(17286);
    this.juc.rj(b.aSZ().aSu().jqW);
    AppMethodBeat.o(17286);
  }

  public final void aTo()
  {
    AppMethodBeat.i(17288);
    int i = b.aSZ().aSu().jqW;
    ab.e("MicroMsg.BackupMoveServer", "speedOverTime callback, backupState[%d]", new Object[] { Integer.valueOf(i) });
    if ((i == 14) || (i == 4))
    {
      this.juc.cancel(true);
      b.aSZ().aTa().stop();
      b.aSZ().aSu().jqW = -4;
      this.juc.rj(-4);
    }
    AppMethodBeat.o(17288);
  }

  public final void ro(int paramInt)
  {
    AppMethodBeat.i(17287);
    int i = b.aSZ().aSu().jqW;
    if (paramInt == 1)
    {
      if (i != 14)
        break label95;
      ab.i("MicroMsg.BackupMoveServer", "speedCallback is weak connect now.");
      b.aSZ().aSu().jqW = 4;
      this.juc.rj(4);
      AppMethodBeat.o(17287);
    }
    while (true)
    {
      return;
      if ((paramInt == 0) && (i == 4))
      {
        ab.i("MicroMsg.BackupMoveServer", "speedCallback is normal speed now.");
        b.aSZ().aSu().jqW = 14;
        this.juc.rj(14);
      }
      label95: AppMethodBeat.o(17287);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.d.3
 * JD-Core Version:    0.6.2
 */
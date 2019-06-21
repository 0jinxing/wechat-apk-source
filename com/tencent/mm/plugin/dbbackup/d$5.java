package com.tencent.mm.plugin.dbbackup;

import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class d$5
  implements b
{
  int kIW = 0;

  d$5(d paramd, com.tencent.mm.vfs.b paramb, b paramb1, WakerLock paramWakerLock)
  {
  }

  public final void tL(int paramInt)
  {
    AppMethodBeat.i(18974);
    int i = paramInt;
    if (this.kIW > 0)
      ab.i("MicroMsg.SubCoreDBBackup", "Recovery stage %d result: %d", new Object[] { Integer.valueOf(this.kIW), Integer.valueOf(i) });
    if (i == 0)
    {
      this.kIX.delete();
      h.pYm.a(181L, 29L, 1L, true);
      if (this.kIC != null)
        this.kIC.tL(i);
      this.kIY.unLock();
      AppMethodBeat.o(18974);
    }
    while (true)
    {
      label99: return;
      if (i == -2)
      {
        this.kIX.delete();
        h.pYm.a(181L, 3L, 1L, true);
        if (this.kIC != null)
          this.kIC.tL(i);
        this.kIY.unLock();
        AppMethodBeat.o(18974);
      }
      else
      {
        paramInt = this.kIW + 1;
        this.kIW = paramInt;
        switch (paramInt)
        {
        default:
          this.kIX.delete();
          h.pYm.a(181L, 30L, 1L, true);
          if (this.kIC != null)
            this.kIC.tL(i);
          this.kIY.unLock();
          AppMethodBeat.o(18974);
        case 1:
        case 2:
        case 3:
        }
      }
    }
    ab.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: REPAIR", new Object[] { Integer.valueOf(this.kIW) });
    paramInt = this.kIO.b(null, this);
    while (true)
    {
      i = paramInt;
      if (paramInt != 0)
        break;
      AppMethodBeat.o(18974);
      break label99;
      ab.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: BACKUP RECOVER", new Object[] { Integer.valueOf(this.kIW) });
      paramInt = this.kIO.a(null, this);
      continue;
      ab.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: DUMP", new Object[] { Integer.valueOf(this.kIW) });
      paramInt = this.kIO.a(this);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.5
 * JD-Core Version:    0.6.2
 */
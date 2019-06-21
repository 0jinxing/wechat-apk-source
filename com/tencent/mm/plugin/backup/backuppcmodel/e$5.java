package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.plugin.backup.c.c;
import com.tencent.mm.plugin.backup.g.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Set;

final class e$5
  implements b.b
{
  e$5(e parame)
  {
  }

  public final void aSq()
  {
    AppMethodBeat.i(17551);
    h.pYm.a(400L, 11L, 1L, false);
    h localh = h.pYm;
    if (e.b(this.jwz) == null)
    {
      l = 0L;
      localh.a(400L, 12L, l, false);
      localh = h.pYm;
      if (e.b(this.jwz) != null)
        break label136;
    }
    label136: for (long l = 0L; ; l = e.b(this.jwz).aSH())
    {
      localh.a(400L, 13L, l, false);
      this.jwz.rt(0);
      b.rx(11);
      if (!e.f(this.jwz))
        this.jwz.rt(21);
      AppMethodBeat.o(17551);
      return;
      l = bo.gb(e.b(this.jwz).jrH) / 1000L;
      break;
    }
  }

  public final void aSr()
  {
    AppMethodBeat.i(17552);
    ab.i("MicroMsg.BackupPcServer", "onBackupPackAndSendCallback onCancel, isSelf[%b]", new Object[] { Boolean.FALSE });
    this.jwz.cancel(false);
    h.pYm.a(400L, 120L, 1L, false);
    AppMethodBeat.o(17552);
  }

  public final void rj(int paramInt)
  {
    AppMethodBeat.i(17550);
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(e.d(this.jwz));
    al.d(new e.5.1(this, localHashSet, paramInt));
    if (e.e(this.jwz) != null)
      al.d(new e.5.2(this, paramInt));
    AppMethodBeat.o(17550);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.e.5
 * JD-Core Version:    0.6.2
 */
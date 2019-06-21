package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.g.k;
import com.tencent.mm.plugin.backup.i.w;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class c$5
  implements f
{
  c$5(c paramc)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17250);
    c.access$202(true);
    h.pYm.a(485L, 42L, 1L, false);
    h.pYm.e(11787, new Object[] { Integer.valueOf(0) });
    com.tencent.mm.plugin.backup.g.b.b(1, c.e(this.jtN));
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd auth failed");
      b.aSZ().aSu().jqW = -5;
      this.jtN.rj(-5);
      this.jtN.rn(3);
      AppMethodBeat.o(17250);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd auth success");
      paramString = (a)paramm;
      if (paramString.jwY.Version >= com.tencent.mm.plugin.backup.b.c.jqG)
        break;
      ab.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd start old move, version:%d", new Object[] { Integer.valueOf(paramString.jwY.Version) });
      h.pYm.a(485L, 104L, 1L, false);
      b.aSZ().aSu().jqW = -12;
      this.jtN.rj(-12);
      AppMethodBeat.o(17250);
    }
    paramInt1 = paramString.jwY.jCt;
    paramm = this.jtN;
    boolean bool;
    if ((paramString.jwY.jCu & com.tencent.mm.plugin.backup.b.c.jqK) == 0)
    {
      bool = false;
      label230: c.a(paramm, bool);
      ab.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd start new move, version:%d, type:%d, isServerSupportKv:%b", new Object[] { Integer.valueOf(paramString.jwY.Version), Integer.valueOf(paramInt1), Boolean.valueOf(c.f(this.jtN)) });
      if ((paramInt1 != com.tencent.mm.plugin.backup.b.c.jqI) || (!c.aTe()))
        break label381;
      c.b(this.jtN, true);
      ab.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Resume Move!!!.");
    }
    while (true)
    {
      c.g(this.jtN);
      com.tencent.mm.plugin.backup.g.b.a(3, c.h(this.jtN));
      new k(b.aSZ().jqO).aUc();
      b.aSZ().aSu().jqW = 22;
      this.jtN.rj(22);
      AppMethodBeat.o(17250);
      break;
      bool = true;
      break label230;
      label381: this.jtN.aTf();
      c.b(this.jtN, false);
      ab.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Normal move.");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.c.5
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.i.w;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class c$3
  implements f
{
  c$3(c paramc)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17501);
    c.aMr();
    h.pYm.e(13736, new Object[] { Integer.valueOf(0), c.e(this.jwk), g.ds(ah.getContext()), Integer.valueOf(0), Integer.valueOf(b.aTD().aTE().jwg) });
    com.tencent.mm.plugin.backup.g.b.b(1, c.f(this.jwk));
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth failed, errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      switch (paramInt2)
      {
      case -2:
      default:
        h.pYm.a(400L, 116L, 1L, false);
      case -1:
      case -3:
      }
      while (true)
      {
        h.pYm.e(13737, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(c.g(this.jwk)) });
        b.aTD().aSu().jqW = -5;
        b.aTD().aTF().ru(-5);
        AppMethodBeat.o(17501);
        return;
        h.pYm.a(400L, 114L, 1L, false);
        continue;
        h.pYm.a(400L, 115L, 1L, false);
      }
    }
    paramString = (a)paramm;
    boolean bool1;
    label302: boolean bool2;
    label319: boolean bool3;
    if ((paramString.jwY.jCu & com.tencent.mm.plugin.backup.b.c.jqL) == 0)
    {
      bool1 = false;
      if ((paramString.jwY.jCu & com.tencent.mm.plugin.backup.b.c.jqM) != 0)
        break label438;
      bool2 = false;
      if ((paramString.jwY.jCu & com.tencent.mm.plugin.backup.b.c.jqN) != 0)
        break label444;
      bool3 = false;
      label336: ab.i("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth success, pcSupportTimeSelect[%b], pcSupportQuickBackup[%b], pcSupportReconnect[%b]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if (!bool3)
        break label468;
      if (paramString.jwY.jCw != null)
        break label450;
      paramString = null;
      label388: if (paramString == null)
        break label461;
      this.jwk.a(true, paramString);
    }
    while (true)
    {
      b.aTD().aTF().jwv = bool1;
      b.aTD().aTF().jww = bool2;
      AppMethodBeat.o(17501);
      break;
      bool1 = true;
      break label302;
      label438: bool2 = true;
      break label319;
      label444: bool3 = true;
      break label336;
      label450: paramString = paramString.jwY.jCw;
      break label388;
      label461: ab.e("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd pcSupportReconnect but token is null!");
      label468: this.jwk.a(false, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.c.3
 * JD-Core Version:    0.6.2
 */
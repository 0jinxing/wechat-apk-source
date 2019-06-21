package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.g.k;
import com.tencent.mm.plugin.backup.i.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class c$6
  implements f
{
  c$6(c paramc)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(17251);
    com.tencent.mm.plugin.backup.g.b.b(3, c.h(this.jtN));
    ab.i("MicroMsg.BackupMoveRecoverServer", "backupmove receive startrequest response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.BackupMoveRecoverServer", "start request failed, errMsg:".concat(String.valueOf(paramString)));
      b.aSZ().aSu().jqW = -5;
      this.jtN.rj(-5);
      AppMethodBeat.o(17251);
    }
    while (true)
    {
      return;
      paramString = (k)paramm;
      paramm = paramString.jyg;
      if (!b.aSZ().jqO.equals(paramm.ID))
      {
        ab.e("MicroMsg.BackupMoveRecoverServer", "start response not the same id");
        b.aSZ().aSu().jqW = -5;
        this.jtN.rj(-5);
        AppMethodBeat.o(17251);
      }
      else
      {
        b.aSZ().aSu().jrc = paramm.jBL;
        this.jtN.ceI = paramString.jyg.jBO.jBE;
        label221: label362: label382: long l;
        if (paramString.jyg.jBO.jBH.toLowerCase().contains("ios"))
        {
          c.a(this.jtN, 1);
          c.a(this.jtN, paramString.jyg.jBS);
          c.b(this.jtN, paramString.jyg.jBU);
          ab.i("MicroMsg.BackupMoveRecoverServer", "move recover totalCount[%d], totalSize[%d], and wait old mobile's pushData", new Object[] { Long.valueOf(paramString.jyg.jBR), Long.valueOf(paramString.jyg.jBS) });
          if ((c.i(this.jtN)) && (c.f(this.jtN)))
          {
            paramm = h.pYm;
            if ((!c.j(this.jtN)) && (c.k(this.jtN) != 1))
              break label601;
            paramInt1 = 66;
            label337: paramm.a(485L, paramInt1, 1L, false);
          }
          if (paramString.jyg.jBQ != 3)
            break label607;
          paramInt1 = 1;
          if (paramInt1 == 0)
            break label612;
          c.c(this.jtN, true);
          ab.i("MicroMsg.BackupMoveRecoverServer", "isQuickBackup!!!");
          paramString = new PLong();
          paramm = new PLong();
          aw.ZK();
          g.a(paramString, paramm, com.tencent.mm.model.c.getAccPath());
          l = c.l(this.jtN);
          if (c.l(this.jtN) * 0.1D <= 524288000.0D)
            break label624;
        }
        label601: label607: label612: label624: for (double d = 524288000.0D; ; d = c.l(this.jtN) * 0.1D)
        {
          l = ()d + l;
          this.jtN.jtJ = l;
          if (paramm.value >= l)
            break label641;
          ab.e("MicroMsg.BackupMoveRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d, dataSize:%d", new Object[] { Long.valueOf(paramm.value), Long.valueOf(l), Long.valueOf(c.l(this.jtN)) });
          h.pYm.e(11787, new Object[] { Integer.valueOf(5) });
          b.aSZ().aTa().stop();
          b.aSZ().aSu().jqW = -13;
          this.jtN.rj(-13);
          h.pYm.a(485L, 5L, 1L, false);
          AppMethodBeat.o(17251);
          break;
          c.a(this.jtN, 2);
          break label221;
          paramInt1 = 65;
          break label337;
          paramInt1 = 0;
          break label362;
          c.c(this.jtN, false);
          break label382;
        }
        label641: c.b(this.jtN, bo.anU());
        com.tencent.mm.plugin.backup.g.b.aTU();
        AppMethodBeat.o(17251);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.c.6
 * JD-Core Version:    0.6.2
 */
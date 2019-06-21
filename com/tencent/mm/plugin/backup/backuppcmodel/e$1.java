package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.plugin.backup.g.k;
import com.tencent.mm.plugin.backup.i.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class e$1
  implements f
{
  e$1(e parame)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17543);
    com.tencent.mm.plugin.backup.g.b.b(3, this.jwz.jtI);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp failed, errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      h.pYm.a(400L, 117L, 1L, false);
      b.aTD().aSu().jqW = -5;
      this.jwz.ru(-5);
      AppMethodBeat.o(17543);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp success, errMsg[%s]", new Object[] { paramString });
      paramString = ((k)paramm).jyg;
      if (!b.aTD().jqO.equals(paramString.ID))
      {
        ab.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp not the same id");
        h.pYm.a(400L, 118L, 1L, false);
        b.aTD().aSu().jqW = -5;
        this.jwz.ru(-5);
        AppMethodBeat.o(17543);
      }
      else
      {
        b.aTD().aSu().jrc = paramString.jBL;
        ab.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp BigDataSize[%d]", new Object[] { Long.valueOf(paramString.jBL) });
        aw.ZK();
        c.Ry().set(ac.a.xPH, Boolean.FALSE);
        com.tencent.mm.plugin.backup.g.b.aTU();
        e.a(this.jwz);
        AppMethodBeat.o(17543);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.e.1
 * JD-Core Version:    0.6.2
 */
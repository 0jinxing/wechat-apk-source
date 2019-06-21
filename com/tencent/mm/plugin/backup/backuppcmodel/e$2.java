package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.c.c;
import com.tencent.mm.plugin.backup.g.i;
import com.tencent.mm.plugin.backup.i.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class e$2
  implements f
{
  e$2(e parame)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17544);
    com.tencent.mm.plugin.backup.g.b.b(11, this.jwz.jwx);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.BackupPcServer", "requestSessionSceneEnd sessionName or timeInterval null or request session resp number error, errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      h.pYm.a(400L, 119L, 1L, false);
      this.jwz.cancel(false);
      b.aTD().aSu().jqW = -5;
      this.jwz.ru(-5);
      AppMethodBeat.o(17544);
    }
    while (true)
    {
      return;
      paramString = (i)paramm;
      paramString = g.b(paramString.jxU.jBx, paramString.jxU.jBy);
      ab.i("MicroMsg.BackupPcServer", "requestSessionSceneEnd receive requestsessionResp, backupSessionList size[%d]", new Object[] { Integer.valueOf(paramString.size()) });
      paramm = e.b(this.jwz);
      b.aTD().aTE();
      paramm.a(paramString, b.aTD().aSu().jrc, e.access$100());
      AppMethodBeat.o(17544);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.e.2
 * JD-Core Version:    0.6.2
 */
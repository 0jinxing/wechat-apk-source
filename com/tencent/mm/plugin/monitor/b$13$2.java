package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf.1;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class b$13$2
  implements Runnable
{
  b$13$2(b.13 param13, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84532);
    b.a(this.oEV.oEL, null);
    List localList = ((j)g.K(j.class)).Yo().bOv();
    if (bo.ek(localList))
      ab.i("MicroMsg.MsgInfoStorageLogic", "summerdel checkUnfinishedDeleteMsgTask all finished!");
    for (int i = 0; ; i = localList.size())
    {
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerdel checkUnfinishedDeleteMsgTask ret[%s]", new Object[] { Integer.valueOf(i) });
      if (i > 0)
        h.pYm.a(418L, 8L, 1L, true);
      b.a(this.oEV.oEL, b.a(this.oEV.oEL, this.oEW));
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan started[%s]", new Object[] { b.p(this.oEV.oEL) });
      AppMethodBeat.o(84532);
      return;
      d.post(new bf.1(localList), "checkUnfinishedDeleteMsgTask");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.13.2
 * JD-Core Version:    0.6.2
 */
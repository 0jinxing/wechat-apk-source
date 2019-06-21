package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Stack;

final class c$3
  implements ap.a
{
  private long frn = 0L;

  c$3(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(77853);
    long l = System.currentTimeMillis();
    if ((this.frl.frc) && (l - this.frn > 60000L))
    {
      ab.w("MicroMsg.AvatarService", "do scene TIMEOUT: %d", new Object[] { Long.valueOf(l - this.frn) });
      this.frl.frc = false;
    }
    if (this.frl.frc)
    {
      this.frl.frk.ae(1000L, 1000L);
      AppMethodBeat.o(77853);
    }
    while (true)
    {
      return false;
      this.frn = l;
      this.frl.frc = true;
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; (i < 5) && (this.frl.frf.size() > 0); i++)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(138L, 42L, 1L, true);
        localLinkedList.add(new bts().alV(bo.nullAsNil(((h)this.frl.frf.pop()).getUsername())));
      }
      g.Rg().a(new j(localLinkedList), 0);
      com.tencent.mm.plugin.report.service.h.pYm.a(138L, 44L, 1L, true);
      AppMethodBeat.o(77853);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.c.3
 * JD-Core Version:    0.6.2
 */
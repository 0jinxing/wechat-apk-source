package com.tencent.mm.plugin.qmessage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

final class a extends com.tencent.mm.sdk.b.c<ag>
{
  a()
  {
    AppMethodBeat.i(24069);
    this.xxI = ag.class.getName().hashCode();
    AppMethodBeat.o(24069);
  }

  private static boolean a(ag paramag)
  {
    AppMethodBeat.i(24070);
    if (!(paramag instanceof ag))
    {
      ab.f("MicroMsg.QMsg.EventListener", "not bind qq event");
      AppMethodBeat.o(24070);
    }
    while (true)
    {
      return false;
      if (paramag.ctc.cte == 0);
      try
      {
        int i = r.YK() | 0x20;
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(34, Integer.valueOf(i));
        aw.ZK();
        paramag = com.tencent.mm.model.c.XL();
        k localk = new com/tencent/mm/az/k;
        localk.<init>("", "", "", "", "", "", "", "", i, "", "");
        paramag.c(localk);
        g.ccc();
        ab.d("MicroMsg.QMsg.EventListener", "doClearQQOffLineMessageHelper succ ");
        AppMethodBeat.o(24070);
      }
      catch (Exception paramag)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.QMsg.EventListener", paramag, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.a.a
 * JD-Core Version:    0.6.2
 */
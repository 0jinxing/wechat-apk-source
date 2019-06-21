package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

final class b extends c<ag>
{
  b()
  {
    AppMethodBeat.i(67917);
    this.xxI = ag.class.getName().hashCode();
    AppMethodBeat.o(67917);
  }

  private static boolean a(ag paramag)
  {
    AppMethodBeat.i(67918);
    if (!(paramag instanceof ag))
    {
      ab.f("MicroMsg.QQMail.EventListener", "not bind qq event");
      AppMethodBeat.o(67918);
    }
    while (true)
    {
      return false;
      if (paramag.ctc.cte == 0);
      try
      {
        g.RP().Ry().set(17, Integer.valueOf(2));
        int i = r.YK() | 0x1;
        g.RP().Ry().set(34, Integer.valueOf(i));
        i locali = ((j)g.K(j.class)).XL();
        paramag = new com/tencent/mm/az/k;
        paramag.<init>("", "", "", "", "", "", "", "", i, "", "");
        locali.c(paramag);
        ac.ccE();
        ab.d("MicroMsg.QQMail.EventListener", "doClearQQMailHelper succ ");
        AppMethodBeat.o(67918);
      }
      catch (Exception paramag)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.QQMail.EventListener", paramag, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.b
 * JD-Core Version:    0.6.2
 */
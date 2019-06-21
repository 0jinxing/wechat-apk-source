package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.plugin.expt.roomexpt.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.d.a;

final class k$6
  implements Runnable
{
  k$6(k paramk, String paramString)
  {
  }

  public final void run()
  {
    boolean bool1 = false;
    AppMethodBeat.i(31349);
    if (!bo.isNullOrNil(this.yPn))
    {
      k.a(this.yPk, u.ac(this.yPn, t.fkP));
      ab.i("MicroMsg.ChattingUI.ChattingReportComponent", "dkchatmsg:name:%s unRead:%s entryTime:%s(%s)", new Object[] { this.yPn, Integer.valueOf(k.a(this.yPk)), bo.mw(k.b(this.yPk)), Long.valueOf(k.b(this.yPk)) });
      boolean bool2 = bool1;
      if (this.yPk.cgL.dFw())
      {
        bool2 = bool1;
        if (this.yPk.cgL.sRl.dua == 0)
          bool2 = true;
      }
      ((d)g.K(d.class)).aE(this.yPn, bool2);
    }
    AppMethodBeat.o(31349);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.k.6
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.qqmail.a.a;
import com.tencent.mm.pluginsdk.m;

final class c$2
  implements bk.a
{
  c$2(c paramc)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(68412);
    if (parame == null)
      AppMethodBeat.o(68412);
    while (true)
    {
      return;
      com.tencent.mm.network.c localc = parame.adg();
      int i = parame.adg().QF();
      localc.a(new byte[0], new byte[0], new byte[0], i);
      a.gkF.BS();
      AppMethodBeat.o(68412);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.c.2
 * JD-Core Version:    0.6.2
 */
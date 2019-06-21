package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.c;
import com.tencent.mm.network.e;

final class l$16
  implements bk.a
{
  l$16(l paraml)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(125147);
    if (parame == null)
      AppMethodBeat.o(125147);
    while (true)
    {
      return;
      parame = parame.adg();
      g.RN();
      int i = a.QF();
      parame.a(new byte[0], new byte[0], new byte[0], i);
      AppMethodBeat.o(125147);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.l.16
 * JD-Core Version:    0.6.2
 */
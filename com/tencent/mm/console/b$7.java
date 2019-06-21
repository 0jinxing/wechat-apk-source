package com.tencent.mm.console;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;

final class b$7
  implements bk.a
{
  public final void a(e parame)
  {
    AppMethodBeat.i(16087);
    if (parame == null)
      AppMethodBeat.o(16087);
    while (true)
    {
      return;
      parame = parame.adg();
      aw.ZK();
      int i = com.tencent.mm.model.c.QF();
      parame.a(new byte[0], new byte[0], new byte[0], i);
      AppMethodBeat.o(16087);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.7
 * JD-Core Version:    0.6.2
 */
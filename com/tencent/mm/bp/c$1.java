package com.tencent.mm.bp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.q;

final class c$1 extends a
{
  c$1(String paramString, q paramq)
  {
  }

  public final void execute(g paramg)
  {
    AppMethodBeat.i(114680);
    String str = this.vwC;
    q localq = this.vwD;
    d.a(str, c.vwA, c.vwB);
    paramg = localq;
    if (localq == null)
      paramg = new q(c.akt(str));
    q.a("plugin.".concat(String.valueOf(str)), paramg);
    AppMethodBeat.o(114680);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.c.1
 * JD-Core Version:    0.6.2
 */
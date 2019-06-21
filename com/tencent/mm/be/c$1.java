package com.tencent.mm.be;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$1
  implements ap.a
{
  c$1(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(78555);
    ab.w("MicroMsg.SenseWhereHttpUtil", "it is time up, has no sense where response.");
    if (c.a(this.fNL) != null)
      g.RO().eJo.c(c.a(this.fNL));
    c.b(this.fNL);
    c.c(this.fNL);
    synchronized (c.d(this.fNL))
    {
      c.d(this.fNL).notifyAll();
      AppMethodBeat.o(78555);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.be.c.1
 * JD-Core Version:    0.6.2
 */
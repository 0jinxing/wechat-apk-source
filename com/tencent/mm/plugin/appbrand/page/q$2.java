package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class q$2
  implements Runnable
{
  private boolean irt = false;

  q$2(q paramq, aq paramaq, boolean paramBoolean, n paramn)
  {
  }

  public final void run()
  {
    boolean bool1 = true;
    AppMethodBeat.i(87078);
    if (this.irt)
      AppMethodBeat.o(87078);
    while (true)
    {
      return;
      this.irt = true;
      if (this.irR.getPageCount() != 0)
        break;
      AppMethodBeat.o(87078);
    }
    n localn;
    if (q.b(this.irR).isEmpty())
    {
      localn = null;
      label58: if (q.d(this.irS))
        q.a(this.irR, localn);
      if ((this.irT) || (!q.e(this.irS)))
        break label164;
    }
    while (true)
    {
      boolean bool2 = q.f(this.irS);
      q.a(this.irR, localn, bool1, bool2);
      q.a(this.irR, this.irU, bool1);
      this.irR.a(localn, this.irU, this.irS);
      AppMethodBeat.o(87078);
      break;
      localn = (n)q.b(this.irR).getFirst();
      break label58;
      label164: bool1 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.q.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.u.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.a.he.b;

final class c$4
  implements Runnable
{
  c$4(c.a parama, he paramhe)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(80760);
    if ((this.pAB == null) || (this.pAD == null) || (this.pAD.cBX == null))
      AppMethodBeat.o(80760);
    while (true)
    {
      return;
      if (this.pAD.cBX.ret == 1)
      {
        this.pAB.jZ(true);
        AppMethodBeat.o(80760);
      }
      else
      {
        if (this.pAD.cBX.ret == 2)
          this.pAB.jZ(false);
        AppMethodBeat.o(80760);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.c.4
 * JD-Core Version:    0.6.2
 */
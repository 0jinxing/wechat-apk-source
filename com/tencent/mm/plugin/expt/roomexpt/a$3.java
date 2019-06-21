package com.tencent.mm.plugin.expt.roomexpt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ac;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;

final class a$3
  implements Runnable
{
  a$3(a parama, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(73562);
    com.tencent.mm.plugin.expt.a.a locala = (com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class);
    a.a locala1 = a.a.lFG;
    boolean bool;
    if (a.a(this.lOy) != null)
    {
      bool = a.a(this.lOy).cYq;
      if (locala.a(locala1, bool))
        break label66;
      AppMethodBeat.o(73562);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label66: int j = Math.min(a.b(this.lOy).length, 5);
      while (true)
      {
        if (i >= j)
          break label163;
        if (this.lOz.equals(a.b(this.lOy)[i]))
        {
          a.aF(this.lOz, this.kAS);
          a.a(this.lOy).cYn = 6L;
          a.a(this.lOy).eX("");
          a.c(this.lOy);
          AppMethodBeat.o(73562);
          break;
        }
        i++;
      }
      label163: AppMethodBeat.o(73562);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.a.3
 * JD-Core Version:    0.6.2
 */
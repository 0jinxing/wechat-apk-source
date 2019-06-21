package com.tencent.mm.plugin.offline.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.a.su.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.i;
import com.tencent.mm.plugin.offline.k;

final class d$1
  implements Runnable
{
  d$1(d paramd, su paramsu, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43500);
    if (g.RK())
      if (this.oZu.cOT.cOV)
      {
        k.bXg();
        i locali = k.bXj();
        int i = this.oZu.cOT.cOW;
        locali.eO(i, i);
        AppMethodBeat.o(43500);
      }
    while (true)
    {
      return;
      k.bXg();
      k.bXj().jF(this.oZv);
      AppMethodBeat.o(43500);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.d.1
 * JD-Core Version:    0.6.2
 */
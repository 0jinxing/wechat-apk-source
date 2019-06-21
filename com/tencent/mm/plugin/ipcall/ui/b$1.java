package com.tencent.mm.plugin.ipcall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.al;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21969);
    if (System.currentTimeMillis() - this.nAl.nAe >= 500L)
    {
      this.nAl.nAc = a.aE(this.nAl.crP, this.nAl.nAa + this.nAl.nAb);
      al.d(new b.1.1(this, i.bHw().OQ(this.nAl.nAc)));
      AppMethodBeat.o(21969);
    }
    while (true)
    {
      return;
      al.d(new b.1.2(this));
      AppMethodBeat.o(21969);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.scanner.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mf;
import com.tencent.mm.g.a.mf.b;

final class e$1
  implements Runnable
{
  e$1(e parame, mf parammf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81393);
    if ((this.qhD.getContext() == null) || (this.qhC.cIa == null))
      AppMethodBeat.o(81393);
    while (true)
    {
      return;
      if (this.qhC.cIa.ret == 1)
      {
        this.qhD.jZ(true);
        AppMethodBeat.o(81393);
      }
      else
      {
        if (this.qhC.cIa.ret == 2)
          this.qhD.jZ(false);
        AppMethodBeat.o(81393);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.e.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.ui.MMAppMgr;

final class n$1
  implements Runnable
{
  n$1(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18271);
    aw.hold();
    MMAppMgr.aAd();
    AppMethodBeat.o(18271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.n.1
 * JD-Core Version:    0.6.2
 */
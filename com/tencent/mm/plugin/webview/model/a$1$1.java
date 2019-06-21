package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1$1
  implements Runnable
{
  a$1$1(a.1 param1, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6561);
    if (this.ith)
    {
      a.a(this.ulG.ulF, true);
      ab.i("MicroMsg.AutoPlayLogic", "enableAutoPlay (true)");
      AppMethodBeat.o(6561);
    }
    while (true)
    {
      return;
      a.a(this.ulG.ulF, false);
      ab.i("MicroMsg.AutoPlayLogic", "enableAutoPlay (false)");
      AppMethodBeat.o(6561);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.a.1.1
 * JD-Core Version:    0.6.2
 */
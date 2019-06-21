package com.tencent.mm.plugin.appbrand.game.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.o;

final class e$2
  implements Runnable
{
  e$2(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130229);
    g.a(this.hsJ.getAppId(), g.d.gNn);
    this.hsJ.getRuntime().close();
    AppMethodBeat.o(130229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.e.2
 * JD-Core Version:    0.6.2
 */
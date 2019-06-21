package com.tencent.mm.plugin.appbrand.menu;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.aa;
import com.tencent.mm.plugin.appbrand.page.w;
import org.a.a;

final class d$2$1
  implements Runnable
{
  d$2$1(d.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132203);
    try
    {
      if ((this.imv.hIw.aJz() instanceof aa))
        a.ep(((aa)this.imv.hIw.aJz()).getX5WebViewExtension()).u("notifyMemoryPressure", new Object[] { Integer.valueOf(80) });
      AppMethodBeat.o(132203);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(132203);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.d.2.1
 * JD-Core Version:    0.6.2
 */
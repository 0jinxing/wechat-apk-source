package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class d$c$1
  implements Runnable
{
  d$c$1(d.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102259);
    Runnable localRunnable = (Runnable)d.aKu().pollFirst();
    if (localRunnable != null)
    {
      localRunnable.run();
      AppMethodBeat.o(102259);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, poll null from queue, all requests done");
      d.ey(false);
      AppMethodBeat.o(102259);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.d.c.1
 * JD-Core Version:    0.6.2
 */
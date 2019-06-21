package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class d$7
  implements Runnable
{
  d$7(Runnable paramRunnable, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102254);
    if (d.access$900())
    {
      d.aKu().add(this.iwC);
      ab.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, another request already running, put this in queue, appId %s, api %s", new Object[] { this.val$appId, this.iwA });
      AppMethodBeat.o(102254);
    }
    while (true)
    {
      return;
      d.ey(true);
      this.iwC.run();
      AppMethodBeat.o(102254);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.d.7
 * JD-Core Version:    0.6.2
 */
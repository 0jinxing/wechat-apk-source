package com.tencent.mm.plugin.appbrand.launching;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$4
  implements Runnable
{
  g$4(g paramg, HandlerThread paramHandlerThread)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131778);
    try
    {
      g.a(this.igR, this.igR.aHf());
      this.igS.quit();
      AppMethodBeat.o(131778);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", localException, "call() exp ", new Object[0]);
        ag.oZ(2131296708);
        g.a(this.igR, g.aHi());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.g.4
 * JD-Core Version:    0.6.2
 */
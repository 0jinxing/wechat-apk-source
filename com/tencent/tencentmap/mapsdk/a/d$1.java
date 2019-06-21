package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ag;
import com.tencent.tencentmap.mapsdk.maps.a.ax;

final class d$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(97772);
    ag.b(" db events to up on netConnectChange", new Object[0]);
    try
    {
      ax.a(true);
      AppMethodBeat.o(97772);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.a(localThrowable);
        AppMethodBeat.o(97772);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.d.1
 * JD-Core Version:    0.6.2
 */
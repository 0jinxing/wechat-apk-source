package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class an$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(98474);
    ag.b(" db events to up on app call", new Object[0]);
    try
    {
      ax.a(false);
      AppMethodBeat.o(98474);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.a(localThrowable);
        AppMethodBeat.o(98474);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.an.1
 * JD-Core Version:    0.6.2
 */
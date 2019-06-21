package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ao$3
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(98486);
    ag.f(" db events to up", new Object[0]);
    try
    {
      ax.a(false);
      AppMethodBeat.o(98486);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.a(localThrowable);
        AppMethodBeat.o(98486);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ao.3
 * JD-Core Version:    0.6.2
 */
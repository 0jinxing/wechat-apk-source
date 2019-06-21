package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class aw$1
  implements Runnable
{
  aw$1(aw paramaw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(98510);
    try
    {
      this.a.a();
      AppMethodBeat.o(98510);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.a(localThrowable);
        AppMethodBeat.o(98510);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.aw.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class at$1
  implements Runnable
{
  at$1(at paramat)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(98506);
    try
    {
      this.a.a();
      AppMethodBeat.o(98506);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.a(localThrowable);
        AppMethodBeat.o(98506);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.at.1
 * JD-Core Version:    0.6.2
 */
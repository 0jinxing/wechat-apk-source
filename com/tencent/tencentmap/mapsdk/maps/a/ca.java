package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ca
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(98613);
    try
    {
      bw.d();
      ce.a(bw.e(), bw.f());
      AppMethodBeat.o(98613);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(98613);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ca
 * JD-Core Version:    0.6.2
 */
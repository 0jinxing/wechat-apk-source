package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.cl;

class hx$2
  implements Runnable
{
  hx$2(hx paramhx)
  {
  }

  public void run()
  {
    AppMethodBeat.i(99640);
    try
    {
      if (hx.a(this.a) != null)
        hx.a(this.a).b();
      AppMethodBeat.o(99640);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        AppMethodBeat.o(99640);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hx.2
 * JD-Core Version:    0.6.2
 */
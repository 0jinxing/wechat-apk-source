package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class t$3
  implements Runnable
{
  t$3(s params, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(100544);
    this.a.a();
    if (this.b >= 3)
    {
      ag.e("query finished should notify", new Object[0]);
      this.a.b();
    }
    AppMethodBeat.o(100544);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.t.3
 * JD-Core Version:    0.6.2
 */
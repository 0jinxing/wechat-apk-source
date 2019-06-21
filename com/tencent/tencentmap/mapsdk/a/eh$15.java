package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener;

class eh$15
  implements aj.i
{
  eh$15(eh parameh, TencentMap.OnMapLoadedListener paramOnMapLoadedListener)
  {
  }

  public void a()
  {
    AppMethodBeat.i(101486);
    if (this.a != null)
      this.a.onMapLoaded();
    AppMethodBeat.o(101486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.15
 * JD-Core Version:    0.6.2
 */
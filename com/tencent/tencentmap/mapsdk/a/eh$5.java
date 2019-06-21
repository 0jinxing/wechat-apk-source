package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener;

class eh$5
  implements aj.k
{
  eh$5(eh parameh, TencentMap.OnMapPoiClickListener paramOnMapPoiClickListener)
  {
  }

  public void a(dd paramdd)
  {
    AppMethodBeat.i(101462);
    if (this.a != null)
      this.a.onClicked(ej.a(paramdd));
    AppMethodBeat.o(101462);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.5
 * JD-Core Version:    0.6.2
 */
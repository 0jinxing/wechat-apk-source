package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener;

class eh$17
  implements aj.l
{
  eh$17(eh parameh, TencentMap.OnMarkerClickListener paramOnMarkerClickListener)
  {
  }

  public boolean a(de paramde)
  {
    AppMethodBeat.i(101488);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.onMarkerClick(eh.a(this.b, paramde));
      AppMethodBeat.o(101488);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101488);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.17
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener;

class eh$4
  implements aj.j
{
  eh$4(eh parameh, TencentMap.OnMapLongClickListener paramOnMapLongClickListener)
  {
  }

  public void a(db paramdb)
  {
    AppMethodBeat.i(101461);
    if (this.a != null)
      this.a.onMapLongClick(ej.a(paramdb));
    AppMethodBeat.o(101461);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.4
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener;

class eh$14
  implements aj.m
{
  eh$14(eh parameh, TencentMap.OnMarkerDraggedListener paramOnMarkerDraggedListener)
  {
  }

  public void a(de paramde)
  {
    AppMethodBeat.i(101483);
    if (this.a != null)
      this.a.onMarkerDragStart(eh.a(this.b, paramde));
    AppMethodBeat.o(101483);
  }

  public void b(de paramde)
  {
    AppMethodBeat.i(101484);
    if (this.a != null)
      this.a.onMarkerDrag(eh.a(this.b, paramde));
    AppMethodBeat.o(101484);
  }

  public void c(de paramde)
  {
    AppMethodBeat.i(101485);
    if (this.a != null)
      this.a.onMarkerDragEnd(eh.a(this.b, paramde));
    AppMethodBeat.o(101485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.14
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class DragFeatureView$a
  implements Runnable
{
  final RecyclerView.v ahR;

  DragFeatureView$a(DragFeatureView paramDragFeatureView, RecyclerView.v paramv)
  {
    this.ahR = paramv;
  }

  public final void run()
  {
    AppMethodBeat.i(133901);
    if (this.ahR == null)
      AppMethodBeat.o(133901);
    int i;
    int j;
    while (true)
    {
      return;
      i = DragFeatureView.a(this.iYx);
      j = this.ahR.kj();
      if (j >= 0)
        break;
      AppMethodBeat.o(133901);
    }
    if (DragFeatureView.b(this.iYx) != this.ahR);
    for (boolean bool = true; ; bool = false)
    {
      c localc = DragFeatureView.c(this.iYx);
      this.iYx.getRecyclerView();
      DragFeatureView.b(this.iYx);
      ab.i("MicroMsg.DragFeatureView", "alvinluo move run %b, onMove: %b, from: %d, to: %d", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(localc.R(this.ahR)), Integer.valueOf(i), Integer.valueOf(j) });
      if (DragFeatureView.b(this.iYx) != this.ahR)
      {
        localc = DragFeatureView.c(this.iYx);
        this.iYx.getRecyclerView();
        DragFeatureView.b(this.iYx);
        if (localc.R(this.ahR))
        {
          DragFeatureView.c(this.iYx).a(this.iYx.getRecyclerView(), DragFeatureView.b(this.iYx), this.ahR, i, j);
          DragFeatureView.a(this.iYx, j);
        }
      }
      AppMethodBeat.o(133901);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView.a
 * JD-Core Version:    0.6.2
 */
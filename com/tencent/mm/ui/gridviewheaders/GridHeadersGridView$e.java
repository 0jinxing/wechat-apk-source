package com.tencent.mm.ui.gridviewheaders;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GridHeadersGridView$e extends GridHeadersGridView.f
  implements Runnable
{
  int zyT;

  private GridHeadersGridView$e(GridHeadersGridView paramGridHeadersGridView)
  {
    super(paramGridHeadersGridView, (byte)0);
  }

  public final void run()
  {
    AppMethodBeat.i(107365);
    if (this.zyQ.ysL)
      AppMethodBeat.o(107365);
    while (true)
    {
      return;
      if ((this.zyQ.zyN != null) && (this.zyQ.zyN.getCount() > 0) && (this.zyT != -1) && (this.zyT < this.zyQ.zyN.getCount()) && (dJl()))
      {
        View localView = this.zyQ.PE(this.zyT);
        if (localView != null)
        {
          GridHeadersGridView localGridHeadersGridView = this.zyQ;
          GridHeadersGridView.a(this.zyQ, this.zyT);
          if (localGridHeadersGridView.zyJ != null)
          {
            localGridHeadersGridView.playSoundEffect(0);
            if (localView != null)
              localView.sendAccessibilityEvent(1);
            localGridHeadersGridView.zyJ.de(localView);
          }
        }
      }
      AppMethodBeat.o(107365);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.e
 * JD-Core Version:    0.6.2
 */
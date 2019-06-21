package com.tencent.mm.ui.gridviewheaders;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GridHeadersGridView$2
  implements Runnable
{
  GridHeadersGridView$2(GridHeadersGridView paramGridHeadersGridView, View paramView, GridHeadersGridView.e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107362);
    this.zyQ.ath = -1;
    this.zyR.setPressed(false);
    this.zyQ.setPressed(false);
    if (!this.zyQ.ysL)
      this.zyS.run();
    AppMethodBeat.o(107362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.2
 * JD-Core Version:    0.6.2
 */
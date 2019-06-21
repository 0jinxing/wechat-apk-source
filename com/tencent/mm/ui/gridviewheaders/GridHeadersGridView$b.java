package com.tencent.mm.ui.gridviewheaders;

import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class GridHeadersGridView$b
  implements Runnable
{
  GridHeadersGridView$b(GridHeadersGridView paramGridHeadersGridView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107364);
    if (this.zyQ.ath == 0)
    {
      this.zyQ.ath = 1;
      View localView = this.zyQ.PE(this.zyQ.zyO);
      if ((localView != null) && (!localView.hasFocusable()))
        if (!this.zyQ.ysL)
        {
          localView.setPressed(true);
          this.zyQ.setPressed(true);
          this.zyQ.refreshDrawableState();
          int i = ViewConfiguration.getLongPressTimeout();
          if (this.zyQ.isLongClickable())
          {
            if (this.zyQ.zyx == null)
              this.zyQ.zyx = new GridHeadersGridView.a(this.zyQ, (byte)0);
            this.zyQ.zyx.dJk();
            GridHeadersGridView.d(this.zyQ).postDelayed(this.zyQ.zyx, i);
            AppMethodBeat.o(107364);
          }
        }
    }
    while (true)
    {
      return;
      this.zyQ.ath = 2;
      AppMethodBeat.o(107364);
      continue;
      this.zyQ.ath = 2;
      AppMethodBeat.o(107364);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.b
 * JD-Core Version:    0.6.2
 */
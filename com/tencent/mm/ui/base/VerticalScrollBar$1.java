package com.tencent.mm.ui.base;

import android.graphics.Paint;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class VerticalScrollBar$1
  implements Runnable
{
  VerticalScrollBar$1(VerticalScrollBar paramVerticalScrollBar, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107087);
    if (this.yAY.nBS.length <= 0)
      AppMethodBeat.o(107087);
    while (true)
    {
      return;
      int i = (int)VerticalScrollBar.a(this.yAY).measureText(this.yAY.nBS[(this.yAY.nBS.length - 1)]);
      int j = a.fromDPToPix(this.yAY.getContext(), 16) + i;
      int k = (int)(this.yAY.nBS.length * VerticalScrollBar.b(this.yAY) * this.yAY.nBQ);
      if (k <= this.mU)
      {
        i = k;
        if (k != 0);
      }
      else
      {
        i = this.mU;
      }
      k = j;
      if (j > this.nBY)
        k = this.nBY;
      ViewGroup.LayoutParams localLayoutParams = this.yAY.getLayoutParams();
      localLayoutParams.width = k;
      localLayoutParams.height = i;
      this.yAY.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(107087);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.VerticalScrollBar.1
 * JD-Core Version:    0.6.2
 */
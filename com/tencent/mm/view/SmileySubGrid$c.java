package com.tencent.mm.view;

import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.view.popview.AbstractPopView;

final class SmileySubGrid$c
  implements Runnable
{
  private SmileySubGrid$c(SmileySubGrid paramSmileySubGrid)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62957);
    if (!SmileySubGrid.c(this.Abc))
    {
      SmileySubGrid.e(this.Abc).addView(SmileySubGrid.d(this.Abc), SmileySubGrid.d(this.Abc).getWindowLayoutParams());
      SmileySubGrid.f(this.Abc);
    }
    AppMethodBeat.o(62957);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileySubGrid.c
 * JD-Core Version:    0.6.2
 */
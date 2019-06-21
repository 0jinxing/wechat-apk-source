package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMTagPanelScrollView$1
  implements Runnable
{
  MMTagPanelScrollView$1(MMTagPanelScrollView paramMMTagPanelScrollView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106856);
    this.yxR.scrollTo(0, this.yxR.getBottom());
    AppMethodBeat.o(106856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanelScrollView.1
 * JD-Core Version:    0.6.2
 */
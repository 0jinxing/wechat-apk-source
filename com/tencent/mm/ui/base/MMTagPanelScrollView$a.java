package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMTagPanelScrollView$a
  implements Runnable
{
  public MMTagPanel yxS;

  public final void run()
  {
    AppMethodBeat.i(106857);
    if (this.yxS != null)
      this.yxS.dAc();
    this.yxS = null;
    AppMethodBeat.o(106857);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanelScrollView.a
 * JD-Core Version:    0.6.2
 */
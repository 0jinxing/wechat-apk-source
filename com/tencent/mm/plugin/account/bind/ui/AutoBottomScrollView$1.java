package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AutoBottomScrollView$1
  implements Runnable
{
  AutoBottomScrollView$1(AutoBottomScrollView paramAutoBottomScrollView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(13330);
    this.gqg.smoothScrollTo(0, this.gqg.getBottom());
    AppMethodBeat.o(13330);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.AutoBottomScrollView.1
 * JD-Core Version:    0.6.2
 */
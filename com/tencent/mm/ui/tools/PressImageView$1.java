package com.tencent.mm.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class PressImageView$1
  implements Runnable
{
  PressImageView$1(PressImageView paramPressImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107746);
    this.zGI.setPressed(false);
    this.zGI.invalidate();
    AppMethodBeat.o(107746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.PressImageView.1
 * JD-Core Version:    0.6.2
 */
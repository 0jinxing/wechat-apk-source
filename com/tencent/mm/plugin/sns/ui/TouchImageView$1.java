package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class TouchImageView$1
  implements Runnable
{
  TouchImageView$1(TouchImageView paramTouchImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39895);
    this.rDY.setPressed(false);
    this.rDY.invalidate();
    AppMethodBeat.o(39895);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.TouchImageView.1
 * JD-Core Version:    0.6.2
 */
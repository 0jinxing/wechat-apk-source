package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MaskImageView$1
  implements Runnable
{
  MaskImageView$1(MaskImageView paramMaskImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38307);
    this.rks.setPressed(false);
    this.rks.invalidate();
    AppMethodBeat.o(38307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.MaskImageView.1
 * JD-Core Version:    0.6.2
 */
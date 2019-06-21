package com.tencent.mm.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MaskImageButton$1
  implements Runnable
{
  MaskImageButton$1(MaskImageButton paramMaskImageButton)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107741);
    this.zGl.setPressed(false);
    this.zGl.invalidate();
    AppMethodBeat.o(107741);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MaskImageButton.1
 * JD-Core Version:    0.6.2
 */
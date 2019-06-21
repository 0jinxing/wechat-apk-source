package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MaskLinearLayout$1
  implements Runnable
{
  MaskLinearLayout$1(MaskLinearLayout paramMaskLinearLayout)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38314);
    this.rkt.setPressed(false);
    MaskLinearLayout.a(this.rkt);
    this.rkt.invalidate();
    AppMethodBeat.o(38314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.MaskLinearLayout.1
 * JD-Core Version:    0.6.2
 */
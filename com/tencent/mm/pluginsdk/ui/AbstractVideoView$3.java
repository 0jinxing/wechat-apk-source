package com.tencent.mm.pluginsdk.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AbstractVideoView$3
  implements Runnable
{
  AbstractVideoView$3(AbstractVideoView paramAbstractVideoView, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117936);
    this.vgH.vgw = true;
    this.vgH.ru(this.vgI);
    this.vgH.e(this.vgI, true);
    this.vgH.vgw = false;
    AppMethodBeat.o(117936);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AbstractVideoView.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.pluginsdk.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AbstractVideoView$2
  implements Runnable
{
  AbstractVideoView$2(AbstractVideoView paramAbstractVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117935);
    try
    {
      this.vgH.ru(0);
      AbstractVideoView.a(this.vgH, this.vgH.isPlaying());
      AppMethodBeat.o(117935);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(117935);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AbstractVideoView.2
 * JD-Core Version:    0.6.2
 */
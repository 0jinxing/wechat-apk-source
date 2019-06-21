package com.tencent.mm.pluginsdk.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class AbstractVideoView$1
  implements ap.a
{
  AbstractVideoView$1(AbstractVideoView paramAbstractVideoView)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(117934);
    if (!this.vgH.isPlaying())
      AppMethodBeat.o(117934);
    while (true)
    {
      return bool;
      if (this.vgH.vgs)
      {
        if (this.vgH.rcd != null)
          this.vgH.rcd.cs(this.vgH.getSessionId(), this.vgH.getMediaId());
        this.vgH.vgs = false;
      }
      this.vgH.ru(this.vgH.getCurrPosSec());
      AbstractVideoView.a(this.vgH, this.vgH.isPlaying());
      bool = true;
      AppMethodBeat.o(117934);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AbstractVideoView.1
 * JD-Core Version:    0.6.2
 */
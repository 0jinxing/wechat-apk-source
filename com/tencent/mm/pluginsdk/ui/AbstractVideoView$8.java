package com.tencent.mm.pluginsdk.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AbstractVideoView$8
  implements Runnable
{
  AbstractVideoView$8(AbstractVideoView paramAbstractVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117941);
    if ((this.vgH.mqj != null) && (this.vgH.mqj.getVisibility() != 0))
    {
      ab.i(this.vgH.TAG, "%s show loading", new Object[] { this.vgH.aZk() });
      this.vgH.mqj.setVisibility(0);
      if (this.vgH.rcd != null)
        this.vgH.rcd.ct(this.vgH.getSessionId(), this.vgH.getMediaId());
    }
    AppMethodBeat.o(117941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AbstractVideoView.8
 * JD-Core Version:    0.6.2
 */
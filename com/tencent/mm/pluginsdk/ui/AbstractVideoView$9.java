package com.tencent.mm.pluginsdk.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AbstractVideoView$9
  implements Runnable
{
  AbstractVideoView$9(AbstractVideoView paramAbstractVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117942);
    if ((this.vgH.mqj != null) && (this.vgH.mqj.getVisibility() != 8))
    {
      ab.i(this.vgH.TAG, "%s hide loading", new Object[] { this.vgH.aZk() });
      this.vgH.mqj.setVisibility(8);
      if (this.vgH.rcd != null)
        this.vgH.rcd.cu(this.vgH.getSessionId(), this.vgH.getMediaId());
    }
    AppMethodBeat.o(117942);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AbstractVideoView.9
 * JD-Core Version:    0.6.2
 */
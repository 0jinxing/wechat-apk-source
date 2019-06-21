package com.tencent.mm.plugin.sns.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class OfflineVideoView$6
  implements Runnable
{
  OfflineVideoView$6(OfflineVideoView paramOfflineVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38365);
    if ((OfflineVideoView.d(this.rld) != null) && (OfflineVideoView.d(this.rld).getVisibility() != 8))
    {
      ab.i("MicroMsg.OfflineVideoView", "%d hide loading.", new Object[] { Integer.valueOf(this.rld.hashCode()) });
      OfflineVideoView.d(this.rld).setVisibility(8);
    }
    AppMethodBeat.o(38365);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OfflineVideoView.6
 * JD-Core Version:    0.6.2
 */
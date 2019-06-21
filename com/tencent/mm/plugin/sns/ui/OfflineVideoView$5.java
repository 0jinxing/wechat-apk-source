package com.tencent.mm.plugin.sns.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class OfflineVideoView$5
  implements Runnable
{
  OfflineVideoView$5(OfflineVideoView paramOfflineVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38364);
    ab.i("MicroMsg.OfflineVideoView", "%d show loading. downloadMode %d", new Object[] { Integer.valueOf(this.rld.hashCode()), Integer.valueOf(this.rld.hashCode()) });
    if ((OfflineVideoView.d(this.rld) != null) && (OfflineVideoView.d(this.rld).getVisibility() != 0))
      OfflineVideoView.d(this.rld).setVisibility(0);
    AppMethodBeat.o(38364);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OfflineVideoView.5
 * JD-Core Version:    0.6.2
 */
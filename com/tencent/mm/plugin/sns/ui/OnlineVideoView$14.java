package com.tencent.mm.plugin.sns.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class OnlineVideoView$14
  implements Runnable
{
  OnlineVideoView$14(OnlineVideoView paramOnlineVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38403);
    if ((OnlineVideoView.h(this.rly) != null) && (OnlineVideoView.h(this.rly).getVisibility() != 8))
    {
      ab.i("MicroMsg.OnlineVideoView", "%d hide loading.", new Object[] { Integer.valueOf(this.rly.hashCode()) });
      OnlineVideoView.h(this.rly).setVisibility(8);
    }
    if ((OnlineVideoView.i(this.rly) != null) && (OnlineVideoView.i(this.rly).getVisibility() != 8))
    {
      ab.i("MicroMsg.OnlineVideoView", "%d hide progress.", new Object[] { Integer.valueOf(this.rly.hashCode()) });
      OnlineVideoView.i(this.rly).setVisibility(8);
    }
    AppMethodBeat.o(38403);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.14
 * JD-Core Version:    0.6.2
 */
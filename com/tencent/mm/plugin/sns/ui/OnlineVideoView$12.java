package com.tencent.mm.plugin.sns.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class OnlineVideoView$12
  implements Runnable
{
  OnlineVideoView$12(OnlineVideoView paramOnlineVideoView, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38401);
    if ((OnlineVideoView.h(this.rly) != null) && (OnlineVideoView.h(this.rly).getVisibility() != 8))
      OnlineVideoView.h(this.rly).setVisibility(8);
    if (OnlineVideoView.i(this.rly) != null)
    {
      if (OnlineVideoView.i(this.rly).getVisibility() != 0)
        OnlineVideoView.i(this.rly).setVisibility(0);
      ab.i("MicroMsg.OnlineVideoView", "%d update progress %d %d", new Object[] { Integer.valueOf(this.rly.hashCode()), Integer.valueOf(this.fzv), Integer.valueOf(this.fFn) });
      if ((OnlineVideoView.i(this.rly).getMax() != this.fFn) && (this.fFn > 0))
        OnlineVideoView.i(this.rly).setMax(this.fFn);
      OnlineVideoView.i(this.rly).setProgress(this.fzv);
    }
    AppMethodBeat.o(38401);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.12
 * JD-Core Version:    0.6.2
 */
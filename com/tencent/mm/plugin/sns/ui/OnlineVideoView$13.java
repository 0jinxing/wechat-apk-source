package com.tencent.mm.plugin.sns.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class OnlineVideoView$13
  implements Runnable
{
  OnlineVideoView$13(OnlineVideoView paramOnlineVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38402);
    ab.i("MicroMsg.OnlineVideoView", "%d show loading. downloadMode %d", new Object[] { Integer.valueOf(this.rly.hashCode()), Integer.valueOf(OnlineVideoView.j(this.rly)) });
    if (OnlineVideoView.j(this.rly) == 1)
    {
      if ((OnlineVideoView.h(this.rly) != null) && (OnlineVideoView.h(this.rly).getVisibility() != 0))
        OnlineVideoView.h(this.rly).setVisibility(0);
      if ((OnlineVideoView.i(this.rly) != null) && (OnlineVideoView.i(this.rly).getVisibility() != 8))
        OnlineVideoView.i(this.rly).setVisibility(8);
    }
    if (OnlineVideoView.j(this.rly) == 2)
    {
      if ((OnlineVideoView.i(this.rly) != null) && (OnlineVideoView.i(this.rly).getVisibility() != 0))
        OnlineVideoView.i(this.rly).setVisibility(0);
      if ((OnlineVideoView.h(this.rly) != null) && (OnlineVideoView.h(this.rly).getVisibility() != 8))
        OnlineVideoView.h(this.rly).setVisibility(8);
    }
    if (OnlineVideoView.j(this.rly) == 3)
    {
      if ((OnlineVideoView.i(this.rly) != null) && (OnlineVideoView.i(this.rly).getVisibility() != 0))
      {
        OnlineVideoView.i(this.rly).setVisibility(0);
        OnlineVideoView.i(this.rly).dKB();
      }
      if ((OnlineVideoView.h(this.rly) != null) && (OnlineVideoView.h(this.rly).getVisibility() != 8))
        OnlineVideoView.h(this.rly).setVisibility(8);
    }
    AppMethodBeat.o(38402);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.13
 * JD-Core Version:    0.6.2
 */
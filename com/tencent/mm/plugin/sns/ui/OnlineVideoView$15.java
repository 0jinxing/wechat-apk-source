package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ap;

final class OnlineVideoView$15
  implements Runnable
{
  OnlineVideoView$15(OnlineVideoView paramOnlineVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38404);
    if ((OnlineVideoView.d(this.rly) != null) && (OnlineVideoView.k(this.rly) != null))
    {
      int i = OnlineVideoView.d(this.rly).getCurrentPosition() / 1000;
      OnlineVideoView.k(this.rly).mm(i);
    }
    OnlineVideoView.l(this.rly).ae(500L, 500L);
    AppMethodBeat.o(38404);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.15
 * JD-Core Version:    0.6.2
 */
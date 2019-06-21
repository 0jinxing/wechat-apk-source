package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.re;
import com.tencent.mm.g.a.re.a;
import com.tencent.mm.sdk.platformtools.bo;

final class OnlineVideoView$4$1
  implements Runnable
{
  OnlineVideoView$4$1(OnlineVideoView.4 param4, re paramre)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38389);
    if (bo.isEqual(this.rlA.cNj.czD, OnlineVideoView.a(this.rlB.rly)))
      if (!OnlineVideoView.q(this.rlB.rly))
      {
        OnlineVideoView.a(this.rlB.rly, true);
        this.rlB.rly.onResume();
        AppMethodBeat.o(38389);
      }
    while (true)
    {
      return;
      this.rlB.rly.requestLayout();
      AppMethodBeat.o(38389);
      continue;
      OnlineVideoView.a(this.rlB.rly, false);
      this.rlB.rly.csc();
      this.rlB.rly.onDestroy();
      AppMethodBeat.o(38389);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.4.1
 * JD-Core Version:    0.6.2
 */
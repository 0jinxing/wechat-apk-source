package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ap.a;

final class OnlineVideoView$17
  implements ap.a
{
  OnlineVideoView$17(OnlineVideoView paramOnlineVideoView)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(38406);
    boolean bool;
    if (OnlineVideoView.d(this.rly) == null)
    {
      bool = false;
      AppMethodBeat.o(38406);
    }
    while (true)
    {
      return bool;
      if (((View)OnlineVideoView.d(this.rly)).getAlpha() < 1.0F)
        OnlineVideoView.m(this.rly);
      if (OnlineVideoView.d(this.rly).isPlaying())
      {
        OnlineVideoView.n(this.rly);
        OnlineVideoView.d(this.rly).getCurrentPosition();
      }
      bool = true;
      AppMethodBeat.o(38406);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.17
 * JD-Core Version:    0.6.2
 */
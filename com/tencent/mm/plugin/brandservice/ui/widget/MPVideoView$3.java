package com.tencent.mm.plugin.brandservice.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class MPVideoView$3
  implements d.e
{
  MPVideoView$3(MPVideoView paramMPVideoView)
  {
  }

  public final void onVisibilityChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(14488);
    MPVideoView.E(this.jZz);
    MMActivity localMMActivity;
    if ((MPVideoView.B(this.jZz)) && ((this.jZz.getContext() instanceof MMActivity)) && (MPVideoView.H(this.jZz) != null) && (!MPVideoView.H(this.jZz).isFullScreen()))
    {
      localMMActivity = (MMActivity)this.jZz.getContext();
      if ((paramBoolean) || (!MPVideoView.i(this.jZz).isPlaying()))
      {
        localMMActivity.mController.showTitleView();
        AppMethodBeat.o(14488);
      }
    }
    while (true)
    {
      return;
      localMMActivity.mController.hideTitleView();
      AppMethodBeat.o(14488);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.3
 * JD-Core Version:    0.6.2
 */
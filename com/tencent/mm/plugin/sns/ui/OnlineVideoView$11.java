package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class OnlineVideoView$11
  implements Runnable
{
  OnlineVideoView$11(OnlineVideoView paramOnlineVideoView, boolean paramBoolean, float paramFloat)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38400);
    ab.i("MicroMsg.OnlineVideoView", "%d switch video model isVideoPlay %b %f", new Object[] { Integer.valueOf(this.rly.hashCode()), Boolean.valueOf(this.klz), Float.valueOf(this.rle) });
    View localView = (View)OnlineVideoView.d(this.rly);
    if (this.klz)
    {
      OnlineVideoView.f(this.rly).setAlpha(this.rle);
      OnlineVideoView.f(this.rly).setVisibility(0);
      localView.setAlpha(this.rle);
      localView.setVisibility(0);
      if (this.rle < 1.0D)
        break label162;
      OnlineVideoView.g(this.rly).setVisibility(8);
      AppMethodBeat.o(38400);
    }
    while (true)
    {
      return;
      OnlineVideoView.f(this.rly).setVisibility(8);
      localView.setVisibility(8);
      OnlineVideoView.g(this.rly).setVisibility(0);
      label162: AppMethodBeat.o(38400);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.11
 * JD-Core Version:    0.6.2
 */
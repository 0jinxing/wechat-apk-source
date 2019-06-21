package com.tencent.mm.plugin.brandservice.ui.widget;

import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.d;

final class MPVideoView$4
  implements d.d
{
  MPVideoView$4(MPVideoView paramMPVideoView)
  {
  }

  public final void dd(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14489);
    if (paramInt2 <= 0)
    {
      AppMethodBeat.o(14489);
      return;
    }
    if (paramInt1 < 0)
      paramInt1 = 0;
    while (true)
    {
      int i = paramInt1;
      if (paramInt1 > paramInt2)
        i = paramInt2;
      paramInt1 = i * MPVideoView.I(this.jZz).getWidth() / paramInt2;
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)MPVideoView.J(this.jZz).getLayoutParams();
      localLayoutParams.width = paramInt1;
      MPVideoView.J(this.jZz).setLayoutParams(localLayoutParams);
      MPVideoView.J(this.jZz).requestLayout();
      AppMethodBeat.o(14489);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.4
 * JD-Core Version:    0.6.2
 */
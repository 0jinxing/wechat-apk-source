package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandVideoView$7
  implements d.d
{
  AppBrandVideoView$7(AppBrandVideoView paramAppBrandVideoView)
  {
  }

  public final void dd(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126448);
    if (paramInt2 <= 0)
    {
      AppMethodBeat.o(126448);
      return;
    }
    if (paramInt1 < 0)
      paramInt1 = 0;
    while (true)
    {
      int i = paramInt1;
      if (paramInt1 > paramInt2)
        i = paramInt2;
      paramInt1 = i * AppBrandVideoView.E(this.hZx).getWidth() / paramInt2;
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)AppBrandVideoView.F(this.hZx).getLayoutParams();
      localLayoutParams.width = paramInt1;
      AppBrandVideoView.F(this.hZx).setLayoutParams(localLayoutParams);
      AppBrandVideoView.F(this.hZx).requestLayout();
      AppMethodBeat.o(126448);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.7
 * JD-Core Version:    0.6.2
 */
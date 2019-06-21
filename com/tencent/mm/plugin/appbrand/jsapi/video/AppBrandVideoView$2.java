package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandVideoView$2
  implements View.OnClickListener
{
  AppBrandVideoView$2(AppBrandVideoView paramAppBrandVideoView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(126442);
    if (AppBrandVideoView.b(this.hZx).isPlaying())
    {
      this.hZx.pause();
      AppMethodBeat.o(126442);
    }
    while (true)
    {
      return;
      this.hZx.start();
      AppMethodBeat.o(126442);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.2
 * JD-Core Version:    0.6.2
 */
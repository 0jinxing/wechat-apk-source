package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandVideoView$4
  implements View.OnClickListener
{
  AppBrandVideoView$4(AppBrandVideoView paramAppBrandVideoView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(126445);
    paramView = this.hZx;
    if (!AppBrandVideoView.D(this.hZx));
    for (boolean bool = true; ; bool = false)
    {
      paramView.setMute(bool);
      AppMethodBeat.o(126445);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.4
 * JD-Core Version:    0.6.2
 */
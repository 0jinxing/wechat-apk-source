package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandVideoView$3
  implements d.h
{
  AppBrandVideoView$3(AppBrandVideoView paramAppBrandVideoView)
  {
  }

  public final int aFg()
  {
    AppMethodBeat.i(126443);
    int i = AppBrandVideoView.b(this.hZx).getCacheTimeSec();
    AppMethodBeat.o(126443);
    return i;
  }

  public final int aFh()
  {
    AppMethodBeat.i(126444);
    int i = AppBrandVideoView.b(this.hZx).getVideoDurationSec();
    AppMethodBeat.o(126444);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.3
 * JD-Core Version:    0.6.2
 */
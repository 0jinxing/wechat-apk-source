package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class AppBrandVideoViewControlBar$3
  implements ap.a
{
  AppBrandVideoViewControlBar$3(AppBrandVideoViewControlBar paramAppBrandVideoViewControlBar)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(131536);
    this.hZW.setVisibility(8);
    AppBrandVideoViewControlBar.c(this.hZW).stopTimer();
    AppMethodBeat.o(131536);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoViewControlBar.3
 * JD-Core Version:    0.6.2
 */
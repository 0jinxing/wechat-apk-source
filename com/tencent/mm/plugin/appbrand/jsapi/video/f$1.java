package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.an;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1
  implements an
{
  f$1(f paramf, AppBrandVideoView paramAppBrandVideoView)
  {
  }

  public final void aDI()
  {
    AppMethodBeat.i(126549);
    AppBrandVideoView localAppBrandVideoView = this.iam;
    ab.i("MicroMsg.AppBrandVideoView", "onExitFullScreen");
    if (localAppBrandVideoView.hYP.aFI())
      localAppBrandVideoView.hYP.aDF();
    localAppBrandVideoView.er(false);
    AppMethodBeat.o(126549);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.f.1
 * JD-Core Version:    0.6.2
 */
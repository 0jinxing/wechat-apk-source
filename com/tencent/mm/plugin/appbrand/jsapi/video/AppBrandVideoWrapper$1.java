package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandVideoWrapper$1
  implements AppBrandVideoView.b
{
  public final AppBrandVideoView cM(Context paramContext)
  {
    AppMethodBeat.i(131585);
    AppBrandVideoWrapper localAppBrandVideoWrapper = new AppBrandVideoWrapper(paramContext);
    AppBrandVideoView localAppBrandVideoView = new AppBrandVideoView(paramContext, localAppBrandVideoWrapper);
    paramContext = new AppBrandVideoViewControlBar(paramContext);
    localAppBrandVideoView.a(paramContext);
    localAppBrandVideoWrapper.setVideoFooterView(paramContext);
    AppMethodBeat.o(131585);
    return localAppBrandVideoView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper.1
 * JD-Core Version:    0.6.2
 */
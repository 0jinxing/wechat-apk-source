package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.media.ThumbnailUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class AppBrandVideoView$8
  implements Runnable
{
  AppBrandVideoView$8(AppBrandVideoView paramAppBrandVideoView, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126450);
    al.d(new AppBrandVideoView.8.1(this, ThumbnailUtils.createVideoThumbnail(this.hPW, 1)));
    AppMethodBeat.o(126450);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.8
 * JD-Core Version:    0.6.2
 */
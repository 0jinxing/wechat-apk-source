package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandVideoView$8$1
  implements Runnable
{
  AppBrandVideoView$8$1(AppBrandVideoView.8 param8, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126449);
    if ((this.val$bitmap != null) && (!this.val$bitmap.isRecycled()))
      AppBrandVideoView.a(this.hZy.hZx).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(126449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.8.1
 * JD-Core Version:    0.6.2
 */
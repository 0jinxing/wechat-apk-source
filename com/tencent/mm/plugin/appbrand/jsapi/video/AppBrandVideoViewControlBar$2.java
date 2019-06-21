package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandVideoViewControlBar$2
  implements View.OnClickListener
{
  AppBrandVideoViewControlBar$2(AppBrandVideoViewControlBar paramAppBrandVideoViewControlBar, d.f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(131535);
    AppBrandVideoViewControlBar.a(this.hZW);
    if (this.hZX != null)
      this.hZX.es(AppBrandVideoViewControlBar.b(this.hZW));
    AppMethodBeat.o(131535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoViewControlBar.2
 * JD-Core Version:    0.6.2
 */
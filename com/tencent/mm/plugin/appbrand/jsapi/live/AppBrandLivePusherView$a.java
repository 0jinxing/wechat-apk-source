package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandLivePusherView$a
  implements Runnable
{
  int hLq;
  int number = 0;

  AppBrandLivePusherView$a(AppBrandLivePusherView paramAppBrandLivePusherView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(96057);
    this.number += 1;
    ab.i("MicroMsg.AppBrandLivePusherView", "[CheckRotateTask] number=" + this.number + "  senorAngle=" + this.hLq);
    int i = AppBrandLivePusherView.c(this.hLo);
    if (i == this.hLq)
    {
      AppBrandLivePusherView.a(this.hLo, i);
      AppMethodBeat.o(96057);
    }
    while (true)
    {
      return;
      if (this.number < 8)
        AppBrandLivePusherView.b(this.hLo).postDelayed(this, 250L);
      AppMethodBeat.o(96057);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView.a
 * JD-Core Version:    0.6.2
 */
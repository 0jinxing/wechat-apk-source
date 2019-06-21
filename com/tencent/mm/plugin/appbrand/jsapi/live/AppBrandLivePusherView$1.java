package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.t.a;
import com.tencent.mm.plugin.appbrand.s.t.b;

final class AppBrandLivePusherView$1
  implements t.b
{
  AppBrandLivePusherView$1(AppBrandLivePusherView paramAppBrandLivePusherView)
  {
  }

  public final void a(t.a parama1, t.a parama2)
  {
    AppMethodBeat.i(96055);
    int i;
    switch (AppBrandLivePusherView.2.hLp[parama2.ordinal()])
    {
    default:
      i = 0;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      parama1 = AppBrandLivePusherView.a(this.hLo);
      parama1.number = 0;
      AppBrandLivePusherView.b(parama1.hLo).removeCallbacks(parama1);
      AppBrandLivePusherView.a(this.hLo).hLq = i;
      parama1 = AppBrandLivePusherView.a(this.hLo);
      AppBrandLivePusherView.b(parama1.hLo).postDelayed(parama1, 250L);
      AppMethodBeat.o(96055);
      return;
      i = 1;
      continue;
      i = 0;
      continue;
      i = 2;
      continue;
      i = 3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView.1
 * JD-Core Version:    0.6.2
 */
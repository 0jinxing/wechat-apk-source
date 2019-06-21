package com.tencent.mm.plugin.appbrand.widget.desktop;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandDesktopView$e$1
  implements RecentAppBrandView.b
{
  AppBrandDesktopView$e$1(AppBrandDesktopView.e parame)
  {
  }

  public final void a(AppBrandDesktopView.c paramc, int paramInt)
  {
    AppMethodBeat.i(133842);
    AppBrandDesktopView.a(this.iXX.iXS, true);
    AppBrandDesktopView.x(this.iXX.iXS);
    AppBrandDesktopView.y(this.iXX.iXS);
    this.iXX.iXS.setLayoutFrozen(true);
    if (paramc != null)
      AppBrandDesktopView.a(this.iXX.iXS, 1089, 2, paramc.iXW, paramInt);
    AppMethodBeat.o(133842);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.e.1
 * JD-Core Version:    0.6.2
 */
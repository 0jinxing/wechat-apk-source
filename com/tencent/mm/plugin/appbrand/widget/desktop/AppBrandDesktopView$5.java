package com.tencent.mm.plugin.appbrand.widget.desktop;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandDesktopView$5
  implements Runnable
{
  AppBrandDesktopView$5(AppBrandDesktopView paramAppBrandDesktopView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133831);
    if (this.iXS.jz())
    {
      this.iXS.post(new AppBrandDesktopView.5.1(this));
      AppMethodBeat.o(133831);
    }
    while (true)
    {
      return;
      if (AppBrandDesktopView.f(this.iXS) != null)
        AppBrandDesktopView.f(this.iXS).aPw();
      AppMethodBeat.o(133831);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.5
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandDesktopView$4
  implements Runnable
{
  AppBrandDesktopView$4(AppBrandDesktopView paramAppBrandDesktopView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133829);
    if (this.iXS.jz())
    {
      this.iXS.post(new AppBrandDesktopView.4.1(this));
      AppMethodBeat.o(133829);
    }
    while (true)
    {
      return;
      if (AppBrandDesktopView.j(this.iXS) != null)
        AppBrandDesktopView.j(this.iXS).aop.notifyChanged();
      AppMethodBeat.o(133829);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.4
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandDesktopView$4$1
  implements Runnable
{
  AppBrandDesktopView$4$1(AppBrandDesktopView.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133828);
    if (AppBrandDesktopView.j(this.iXU.iXS) != null)
      AppBrandDesktopView.j(this.iXU.iXS).aop.notifyChanged();
    AppMethodBeat.o(133828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.4.1
 * JD-Core Version:    0.6.2
 */
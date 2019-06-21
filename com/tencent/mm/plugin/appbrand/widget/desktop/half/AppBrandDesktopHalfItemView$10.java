package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.f;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import com.tencent.mm.plugin.appbrand.widget.recentview.c;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopHalfItemView$10 extends c
{
  AppBrandDesktopHalfItemView$10(AppBrandDesktopHalfItemView paramAppBrandDesktopHalfItemView)
  {
  }

  public final void L(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(134135);
    ab.i("MicroMsg.AppBrandDesktopHalfItemView", "alvinluo onScrollPageChanged currentPage: %d, isAuto: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    b localb;
    if ((AppBrandDesktopHalfItemView.f(this.jaE) != null) && (!paramBoolean))
      if (AppBrandDesktopHalfItemView.a(this.jaE) == AppBrandRecentView.f.jmH)
      {
        localb = AppBrandDesktopHalfItemView.f(this.jaE);
        ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo scrollRecentList");
        localb.jmP += 1;
        AppMethodBeat.o(134135);
      }
    while (true)
    {
      return;
      if (AppBrandDesktopHalfItemView.a(this.jaE) == AppBrandRecentView.f.jmI)
      {
        localb = AppBrandDesktopHalfItemView.f(this.jaE);
        ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo scrollStarList");
        localb.jmY += 1;
      }
      AppMethodBeat.o(134135);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfItemView.10
 * JD-Core Version:    0.6.2
 */
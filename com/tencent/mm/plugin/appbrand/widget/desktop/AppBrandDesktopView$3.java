package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopView$3 extends RecyclerView.m
{
  AppBrandDesktopView$3(AppBrandDesktopView paramAppBrandDesktopView)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133827);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    if (AppBrandDesktopView.P(this.iXS))
    {
      AppBrandDesktopView.Q(this.iXS);
      if (AppBrandDesktopView.l(this.iXS) != null)
      {
        paramInt1 = AppBrandDesktopView.R(this.iXS) - AppBrandDesktopView.l(this.iXS).iQ();
        if ((paramInt1 >= 0) && (paramInt1 < this.iXS.getChildCount()))
        {
          paramInt1 = this.iXS.getChildAt(paramInt1).getTop();
          this.iXS.scrollBy(0, paramInt1);
        }
      }
    }
    AppMethodBeat.o(133827);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(133826);
    super.c(paramRecyclerView, paramInt);
    ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onScrollStateChanged %d, needScroll: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(AppBrandDesktopView.F(this.iXS)) });
    if ((!AppBrandDesktopView.G(this.iXS)) && ((AppBrandDesktopView.F(this.iXS)) || (paramInt == 0)))
    {
      AppBrandDesktopView.H(this.iXS);
      AppBrandDesktopView.I(this.iXS);
    }
    if (paramInt == 0)
    {
      if (!AppBrandDesktopView.J(this.iXS))
        break label196;
      AppBrandDesktopView.K(this.iXS);
      if ((!AppBrandDesktopView.N(this.iXS)) || (AppBrandDesktopView.O(this.iXS)))
        break label228;
      if (AppBrandDesktopView.c(this.iXS) != null)
      {
        paramRecyclerView = AppBrandDesktopView.c(this.iXS);
        paramRecyclerView.jnl += 1;
        ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo showSearchView %d", new Object[] { Integer.valueOf(paramRecyclerView.jnl) });
      }
      AppBrandDesktopView.b(this.iXS, true);
    }
    while (true)
    {
      AppBrandDesktopView.h(this.iXS, paramInt);
      AppMethodBeat.o(133826);
      return;
      label196: if ((AppBrandDesktopView.L(this.iXS) != 1) && (AppBrandDesktopView.L(this.iXS) != 2))
        break;
      AppBrandDesktopView.M(this.iXS);
      break;
      label228: AppBrandDesktopView.b(this.iXS, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.3
 * JD-Core Version:    0.6.2
 */
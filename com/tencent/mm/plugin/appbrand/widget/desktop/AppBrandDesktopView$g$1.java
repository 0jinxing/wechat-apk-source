package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundGLSurfaceView;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView.j;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import com.tencent.mm.plugin.websearch.api.j;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopView$g$1
  implements View.OnClickListener
{
  AppBrandDesktopView$g$1(AppBrandDesktopView.g paramg, AppBrandDesktopView paramAppBrandDesktopView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133851);
    AppBrandDesktopView.a(this.iYc.iXS, false);
    AppBrandDesktopView.x(this.iYc.iXS);
    AppBrandDesktopView.y(this.iYc.iXS);
    AppBrandDesktopView localAppBrandDesktopView = this.iYc.iXS;
    if ((localAppBrandDesktopView.iVo != null) && (localAppBrandDesktopView.iXF))
    {
      paramView = (DynamicBackgroundGLSurfaceView)localAppBrandDesktopView.iVo.getBackgroundGLSurfaceView();
      if (paramView != null)
      {
        paramView.iZQ.onPause();
        localAppBrandDesktopView.iXJ = true;
        localAppBrandDesktopView.iXO = true;
      }
    }
    ab.i("MicroMsg.AppBrandDesktopView", "alvinluo AppbrandDesktop search jump to AppBrandSearchUI");
    long l = System.currentTimeMillis();
    if ((AppBrandDesktopView.c(this.iYc.iXS) != null) && ((AppBrandDesktopView.g.a(this.iYc) == 0L) || (l - AppBrandDesktopView.g.a(this.iYc) > 1000L)))
    {
      AppBrandDesktopView.g.a(this.iYc, l);
      paramView = AppBrandDesktopView.c(this.iYc.iXS);
      paramView.jnm += 1;
      ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo clickSearchView %d", new Object[] { Integer.valueOf(paramView.jnm) });
    }
    paramView = (j)g.K(j.class);
    if (paramView != null)
      paramView.aa(AppBrandDesktopView.k(this.iYc.iXS), 42);
    AppMethodBeat.o(133851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.g.1
 * JD-Core Version:    0.6.2
 */
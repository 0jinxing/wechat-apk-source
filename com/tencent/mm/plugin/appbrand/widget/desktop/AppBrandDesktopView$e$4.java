package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandDesktopView$e$4
  implements View.OnClickListener
{
  AppBrandDesktopView$e$4(AppBrandDesktopView.e parame, AppBrandDesktopView.c paramc, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133844);
    AppBrandDesktopView.a(this.iXX.iXS, true);
    AppBrandDesktopView.x(this.iXX.iXS);
    AppBrandDesktopView.y(this.iXX.iXS);
    this.iXX.iXS.setLayoutFrozen(true);
    AppBrandDesktopView.a(this.iXX.iXS, 1104, 1, this.iXY.iXW, this.sN);
    AppMethodBeat.o(133844);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.e.4
 * JD-Core Version:    0.6.2
 */
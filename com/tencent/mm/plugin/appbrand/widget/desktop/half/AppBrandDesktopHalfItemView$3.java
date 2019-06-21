package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.support.v7.widget.RecyclerView.v;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c;

final class AppBrandDesktopHalfItemView$3
  implements Runnable
{
  AppBrandDesktopHalfItemView$3(AppBrandDesktopHalfItemView paramAppBrandDesktopHalfItemView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134127);
    if (AppBrandDesktopHalfItemView.g(this.jaE) != null)
    {
      AppBrandDesktopHalfItemView.a locala = AppBrandDesktopHalfItemView.g(this.jaE);
      if ((locala.jaG != null) && (locala.jaG.apJ != null) && ((locala.jaG instanceof BaseAppBrandRecentView.c)) && (((BaseAppBrandRecentView.c)locala.jaG).iYe != null))
        ((BaseAppBrandRecentView.c)locala.jaG).iYe.animate().alpha(1.0F).scaleX(1.2F).scaleY(1.2F).setListener(null).setDuration(150L).withEndAction(new AppBrandDesktopHalfItemView.a.1(locala)).start();
    }
    AppMethodBeat.o(134127);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfItemView.3
 * JD-Core Version:    0.6.2
 */
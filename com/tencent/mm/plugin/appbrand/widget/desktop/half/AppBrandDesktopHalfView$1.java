package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.e;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopHalfView$1
  implements AppBrandRecentView.e
{
  AppBrandDesktopHalfView$1(AppBrandDesktopHalfView paramAppBrandDesktopHalfView)
  {
  }

  public final void qs(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(134160);
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo refresh RecentData onDone size: %d", new Object[] { Integer.valueOf(paramInt) });
    AppBrandDesktopHalfView.a(this.jaW);
    AppBrandDesktopHalfView.b(this.jaW);
    if (paramInt <= AppBrandDesktopHalfView.c(this.jaW).getRecentView().getCustomItemCount())
      AppBrandDesktopHalfView.d(this.jaW).setVisibility(8);
    while (true)
    {
      if (AppBrandDesktopHalfView.f(this.jaW) != null)
      {
        AppBrandRecentView.e locale = AppBrandDesktopHalfView.f(this.jaW);
        if (paramInt - AppBrandDesktopHalfView.d(this.jaW).getRecentView().getCustomItemCount() > 0)
          i = paramInt - AppBrandDesktopHalfView.d(this.jaW).getRecentView().getCustomItemCount();
        locale.qs(i);
      }
      AppMethodBeat.o(134160);
      return;
      if (AppBrandDesktopHalfView.e(this.jaW).getVisibility() != 0)
        AppBrandDesktopHalfView.e(this.jaW).setVisibility(0);
      if (AppBrandDesktopHalfView.d(this.jaW).getVisibility() != 0)
        AppBrandDesktopHalfView.d(this.jaW).setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfView.1
 * JD-Core Version:    0.6.2
 */
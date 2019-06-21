package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.support.v7.widget.RecyclerView.a;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.e;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopHalfView$20
  implements AppBrandRecentView.e
{
  AppBrandDesktopHalfView$20(AppBrandDesktopHalfView paramAppBrandDesktopHalfView)
  {
  }

  public final void qs(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(134180);
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo refresh CollectionData onDone size: %d", new Object[] { Integer.valueOf(paramInt) });
    AppBrandDesktopHalfView.j(this.jaW);
    AppBrandDesktopHalfView.b(this.jaW);
    if (paramInt <= AppBrandDesktopHalfView.c(this.jaW).getRecentView().getCustomItemCount())
      AppBrandDesktopHalfView.c(this.jaW).setVisibility(8);
    while (true)
    {
      if (AppBrandDesktopHalfView.k(this.jaW) != null)
      {
        AppBrandRecentView.e locale = AppBrandDesktopHalfView.k(this.jaW);
        if (paramInt - AppBrandDesktopHalfView.c(this.jaW).getRecentView().getCustomItemCount() > 0)
          i = paramInt - AppBrandDesktopHalfView.c(this.jaW).getRecentView().getCustomItemCount();
        locale.qs(i);
      }
      i = AppBrandDesktopHalfView.c(this.jaW).getRecentView().getAdapter().getItemCount();
      AppBrandDesktopHalfView.c(this.jaW).getRecentView().getAdapter().ar(paramInt - 1, i - paramInt);
      AppMethodBeat.o(134180);
      return;
      AppBrandDesktopHalfView.e(this.jaW).setVisibility(0);
      AppBrandDesktopHalfView.c(this.jaW).setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfView.20
 * JD-Core Version:    0.6.2
 */
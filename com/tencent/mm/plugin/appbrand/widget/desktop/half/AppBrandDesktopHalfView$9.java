package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopHalfView$9
  implements Runnable
{
  AppBrandDesktopHalfView$9(AppBrandDesktopHalfView paramAppBrandDesktopHalfView, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134168);
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo notifyMoveToFirstAnimation last page need notifyItemRangeChanged");
    AppBrandDesktopHalfView.c(this.jaW).getRecentView().getAdapter().ar(this.sN, 5);
    AppMethodBeat.o(134168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfView.9
 * JD-Core Version:    0.6.2
 */
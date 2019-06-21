package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;

final class AppBrandDesktopHalfView$6$1
  implements Runnable
{
  AppBrandDesktopHalfView$6$1(AppBrandDesktopHalfView.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134165);
    if (AppBrandDesktopHalfView.n(this.jaY.jaW) != null)
      AppBrandDesktopHalfView.c(this.jaY.jaW).getRecentView().setItemAnimator(AppBrandDesktopHalfView.n(this.jaY.jaW));
    AppMethodBeat.o(134165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfView.6.1
 * JD-Core Version:    0.6.2
 */
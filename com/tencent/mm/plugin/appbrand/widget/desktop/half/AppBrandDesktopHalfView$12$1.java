package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.e.b;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopHalfView$12$1
  implements e.b
{
  AppBrandDesktopHalfView$12$1(AppBrandDesktopHalfView.12 param12)
  {
  }

  public final void aQe()
  {
    AppMethodBeat.i(134171);
    if ((AppBrandDesktopHalfView.c(this.jba.jaW) != null) && (AppBrandDesktopHalfView.c(this.jba.jaW).getPreviewList() != null) && (AppBrandDesktopHalfView.c(this.jba.jaW).getRecentView() != null) && (AppBrandDesktopHalfView.c(this.jba.jaW).getRecentView().getAdapter() != null))
    {
      ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo moveToFirst onScrollEnd notifyItemInserted startIndex: %d", new Object[] { Integer.valueOf(AppBrandDesktopHalfView.l(this.jba.jaW)) });
      AppBrandDesktopHalfView.a(this.jba.jaW, this.jba.jaX);
    }
    AppMethodBeat.o(134171);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfView.12.1
 * JD-Core Version:    0.6.2
 */
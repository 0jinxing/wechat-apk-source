package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView.a;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopHalfItemView$11
  implements ConversationAppBrandRecentView.a
{
  AppBrandDesktopHalfItemView$11(AppBrandDesktopHalfItemView paramAppBrandDesktopHalfItemView)
  {
  }

  public final void a(BaseAppBrandRecentView.c paramc, int paramInt)
  {
    AppMethodBeat.i(134136);
    if ((AppBrandDesktopHalfItemView.g(this.jaE) != null) && (AppBrandDesktopHalfItemView.g(this.jaE).ape == paramInt) && (AppBrandDesktopHalfItemView.h(this.jaE)) && (paramc != null) && (paramc.apJ != null))
    {
      ab.i("MicroMsg.AppBrandDesktopHalfItemView", "alvinluo ScaleAndAlphaAnimation set to default position: %d", new Object[] { Integer.valueOf(paramInt) });
      AppBrandDesktopHalfItemView.g(this.jaE).jaG = paramc;
      AppBrandDesktopHalfItemView.i(this.jaE);
    }
    AppMethodBeat.o(134136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfItemView.11
 * JD-Core Version:    0.6.2
 */
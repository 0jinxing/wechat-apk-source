package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.af.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.c;
import java.util.List;

final class AppBrandDesktopHalfItemView$4
  implements AppBrandRecentView.c
{
  AppBrandDesktopHalfItemView$4(AppBrandDesktopHalfItemView paramAppBrandDesktopHalfItemView)
  {
  }

  public final List qr(int paramInt)
  {
    AppMethodBeat.i(134128);
    List localList = ((af)g.K(af.class)).a(paramInt, af.a.haK);
    AppMethodBeat.o(134128);
    return localList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfItemView.4
 * JD-Core Version:    0.6.2
 */
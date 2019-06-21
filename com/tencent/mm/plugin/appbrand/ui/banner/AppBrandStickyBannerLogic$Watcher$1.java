package com.tencent.mm.plugin.appbrand.ui.banner;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandStickyBannerLogic$Watcher$1
  implements f
{
  AppBrandStickyBannerLogic$Watcher$1(AppBrandStickyBannerLogic.Watcher paramWatcher)
  {
  }

  public final void bg(String paramString, int paramInt)
  {
    AppMethodBeat.i(133305);
    this.iKU.iKR = paramString;
    this.iKU.iKS = paramInt;
    AppBrandStickyBannerLogic.Watcher.a(this.iKU);
    AppMethodBeat.o(133305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.Watcher.1
 * JD-Core Version:    0.6.2
 */
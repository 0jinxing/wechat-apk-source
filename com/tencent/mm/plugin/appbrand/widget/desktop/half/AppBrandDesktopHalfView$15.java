package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopHalfView$15
  implements Runnable
{
  AppBrandDesktopHalfView$15(AppBrandDesktopHalfView paramAppBrandDesktopHalfView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134175);
    try
    {
      long l = System.currentTimeMillis();
      b.f(AppBrandDesktopHalfView.d(this.jaW).getPreviewList(), AppBrandDesktopHalfView.c(this.jaW).getPreviewList());
      ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo computeNameDuplicatedResults cost: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(134175);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandDesktopHalfView", localException, "alvinluo checkReportNameDuplicated", new Object[0]);
        AppMethodBeat.o(134175);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfView.15
 * JD-Core Version:    0.6.2
 */
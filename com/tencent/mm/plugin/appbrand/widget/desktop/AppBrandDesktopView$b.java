package com.tencent.mm.plugin.appbrand.widget.desktop;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopView$b
  implements k.a
{
  boolean iXG = false;
  private int mType;

  public AppBrandDesktopView$b(AppBrandDesktopView paramAppBrandDesktopView, int paramInt)
  {
    this.mType = paramInt;
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(133840);
    ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onNotifyChange type: %d, ignore: %b, eventId: %d", new Object[] { Integer.valueOf(this.mType), Boolean.valueOf(this.iXG), Integer.valueOf(paramm.hsh) });
    if (paramm.hsh == -1)
    {
      ab.w("MicroMsg.AppBrandDesktopView", "alvinluo AppBrandDesktopView onNotifyChange pass eventId: %d", new Object[] { Integer.valueOf(paramm.hsh) });
      AppMethodBeat.o(133840);
    }
    while (true)
    {
      return;
      if (this.iXG)
      {
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo AppBrandDesktopView onNotifyChange ignoreNotify");
        this.iXG = false;
        AppMethodBeat.o(133840);
      }
      else
      {
        AppBrandDesktopView.i(this.iXS);
        AppMethodBeat.o(133840);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.b
 * JD-Core Version:    0.6.2
 */
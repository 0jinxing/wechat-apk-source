package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class AppBrandDesktopView$7
  implements g
{
  AppBrandDesktopView$7(AppBrandDesktopView paramAppBrandDesktopView)
  {
  }

  public final int computeVerticalScrollOffset()
  {
    AppMethodBeat.i(133834);
    int i;
    if (this.iXS.getChildCount() == 0)
    {
      AppMethodBeat.o(133834);
      i = 0;
      return i;
    }
    label366: 
    while (true)
    {
      try
      {
        int j = AppBrandDesktopView.l(this.iXS).iQ();
        i = -(int)AppBrandDesktopView.l(this.iXS).bW(j).getY();
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo compute offsetY: %d", new Object[] { Integer.valueOf(i) });
        int k = 0;
        if (k < j)
        {
          AppBrandDesktopView.c localc = (AppBrandDesktopView.c)AppBrandDesktopView.o(this.iXS).get(k);
          if (localc == null)
            break label366;
          int m = localc.type;
          ab.i("MicroMsg.AppBrandDesktopView", "alvinluo compute type: %d, i: %d", new Object[] { Integer.valueOf(m), Integer.valueOf(k) });
          if ((m == 10) || (m == 11))
          {
            ab.i("MicroMsg.AppBrandDesktopView", "alvinluo compute title add height: %s", new Object[] { Integer.valueOf(AppBrandDesktopView.p(this.iXS)) });
            i = AppBrandDesktopView.p(this.iXS) + i;
            k++;
            continue;
          }
          if (m == 6)
          {
            ab.i("MicroMsg.AppBrandDesktopView", "alvinluo compute search add height: %s", new Object[] { Integer.valueOf(AppBrandDesktopView.q(this.iXS)) });
            i = AppBrandDesktopView.q(this.iXS) + i;
            continue;
          }
          if (m == 2)
          {
            ab.i("MicroMsg.AppBrandDesktopView", "alvinluo compute recent add height: %s", new Object[] { Integer.valueOf(AppBrandDesktopView.r(this.iXS)) });
            i = AppBrandDesktopView.r(this.iXS) + i;
            continue;
          }
          if ((m != 1) || ((k - AppBrandDesktopView.g(this.iXS)) % 4 != 0))
            break label366;
          ab.i("MicroMsg.AppBrandDesktopView", "alvinluo compute collection item add height: %s", new Object[] { Integer.valueOf(AppBrandDesktopView.r(this.iXS)) });
          m = AppBrandDesktopView.r(this.iXS);
          i = m + i;
          continue;
        }
        AppMethodBeat.o(133834);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandDesktopView", localException, "alvinluo compute exception", new Object[0]);
        AppMethodBeat.o(133834);
        i = 0;
      }
      break;
    }
  }

  public final int computeVerticalScrollRange()
  {
    AppMethodBeat.i(133833);
    int i = AppBrandDesktopView.m(this.iXS);
    int j = AppBrandDesktopView.n(this.iXS);
    AppMethodBeat.o(133833);
    return i + j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.7
 * JD-Core Version:    0.6.2
 */
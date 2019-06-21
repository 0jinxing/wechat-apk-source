package com.tencent.mm.plugin.appbrand.widget.desktop;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import java.util.ArrayList;
import java.util.List;

final class AppBrandDesktopView$10
  implements Runnable
{
  AppBrandDesktopView$10(AppBrandDesktopView paramAppBrandDesktopView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133837);
    if ((AppBrandDesktopView.t(this.iXS)) && (AppBrandDesktopView.u(this.iXS)))
      if (AppBrandDesktopView.f(this.iXS) == null)
        AppMethodBeat.o(133837);
    while (true)
    {
      return;
      Object localObject1 = AppBrandDesktopView.f(this.iXS).getShowList();
      ArrayList localArrayList = new ArrayList();
      Object localObject2;
      for (int i = 0; i < ((List)localObject1).size(); i++)
      {
        localObject2 = (AppBrandDesktopView.c)((List)localObject1).get(i);
        if ((localObject2 != null) && (((AppBrandDesktopView.c)localObject2).iXW != null))
        {
          localObject2 = new a(((AppBrandDesktopView.c)localObject2).iXW);
          ((a)localObject2).position = i;
          localArrayList.add(localObject2);
        }
      }
      localObject1 = new ArrayList();
      for (i = AppBrandDesktopView.g(this.iXS); i < AppBrandDesktopView.o(this.iXS).size(); i++)
      {
        localObject2 = (AppBrandDesktopView.c)AppBrandDesktopView.o(this.iXS).get(i);
        if ((localObject2 != null) && (((AppBrandDesktopView.c)localObject2).type == 1))
        {
          localObject2 = new a(((AppBrandDesktopView.c)localObject2).iXW);
          ((a)localObject2).position = i;
          ((List)localObject1).add(localObject2);
        }
      }
      b.f(localArrayList, (List)localObject1);
      AppMethodBeat.o(133837);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.10
 * JD-Core Version:    0.6.2
 */
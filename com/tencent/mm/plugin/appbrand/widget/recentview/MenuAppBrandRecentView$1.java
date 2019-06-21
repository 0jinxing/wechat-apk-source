package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;

final class MenuAppBrandRecentView$1
  implements AppBrandRecentView.b
{
  MenuAppBrandRecentView$1(MenuAppBrandRecentView paramMenuAppBrandRecentView)
  {
  }

  public final boolean a(View paramView, a parama, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(134382);
    if (MenuAppBrandRecentView.a(this.joh) != null);
    for (boolean bool = MenuAppBrandRecentView.a(this.joh).a(paramView, parama, paramFloat1, paramFloat2); ; bool = false)
    {
      if (bool)
      {
        bool = true;
        AppMethodBeat.o(134382);
      }
      while (true)
      {
        return bool;
        if (parama.type != 2)
        {
          paramView = new AppBrandStatObject();
          paramView.scene = 1090;
          ((e)g.K(e.class)).a(this.joh.getContext(), parama.iXW.username, null, parama.iXW.har, -1, null, paramView);
        }
        AppMethodBeat.o(134382);
        bool = false;
      }
    }
  }

  public final boolean b(View paramView, a parama, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(134383);
    boolean bool = false;
    if (MenuAppBrandRecentView.a(this.joh) != null)
      bool = MenuAppBrandRecentView.a(this.joh).b(paramView, parama, paramFloat1, paramFloat2);
    AppMethodBeat.o(134383);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.MenuAppBrandRecentView.1
 * JD-Core Version:    0.6.2
 */
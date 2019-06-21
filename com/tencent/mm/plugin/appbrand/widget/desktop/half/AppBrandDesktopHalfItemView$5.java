package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.a.a.b;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.f;

final class AppBrandDesktopHalfItemView$5
  implements View.OnClickListener
{
  AppBrandDesktopHalfItemView$5(AppBrandDesktopHalfItemView paramAppBrandDesktopHalfItemView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134129);
    if (AppBrandDesktopHalfItemView.a(this.jaE) == AppBrandRecentView.f.jmI)
    {
      ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).cB(this.jaE.getContext());
      if (AppBrandDesktopHalfItemView.b(this.jaE) == null)
        break label122;
      AppBrandDesktopHalfItemView.b(this.jaE).aQg();
      AppMethodBeat.o(134129);
    }
    while (true)
    {
      return;
      if (AppBrandDesktopHalfItemView.a(this.jaE) == AppBrandRecentView.f.jmH)
      {
        ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).C(this.jaE.getContext(), 3);
        if (AppBrandDesktopHalfItemView.b(this.jaE) != null)
          AppBrandDesktopHalfItemView.b(this.jaE).aQh();
      }
      label122: AppMethodBeat.o(134129);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfItemView.5
 * JD-Core Version:    0.6.2
 */
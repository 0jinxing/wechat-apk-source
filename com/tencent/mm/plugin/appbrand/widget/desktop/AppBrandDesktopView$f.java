package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class AppBrandDesktopView$f extends RecyclerView.v
{
  public AppBrandDesktopView$f(AppBrandDesktopView paramAppBrandDesktopView, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(133850);
    int i = AppBrandDesktopView.r(this.iXS);
    int j = i;
    if (i == 0)
    {
      j = i;
      if (this.apJ != null)
      {
        this.apJ.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo MyAppBrandEmptyViewHolder itemHeight: %d, itemWidth: %d", new Object[] { Integer.valueOf(this.apJ.getMeasuredHeight()), Integer.valueOf(this.apJ.getMeasuredWidth()) });
        j = this.apJ.getMeasuredHeight();
      }
    }
    paramAppBrandDesktopView = new RecyclerView.LayoutParams(-1, -2);
    paramAppBrandDesktopView.setMargins(paramAppBrandDesktopView.leftMargin + AppBrandDesktopView.w(this.iXS), paramAppBrandDesktopView.topMargin - j, paramAppBrandDesktopView.rightMargin + AppBrandDesktopView.w(this.iXS), paramAppBrandDesktopView.bottomMargin);
    if (this.apJ != null)
      this.apJ.setLayoutParams(paramAppBrandDesktopView);
    AppMethodBeat.o(133850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.f
 * JD-Core Version:    0.6.2
 */
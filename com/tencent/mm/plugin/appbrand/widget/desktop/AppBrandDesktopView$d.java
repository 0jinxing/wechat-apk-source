package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class AppBrandDesktopView$d extends RecyclerView.v
{
  public AppBrandDesktopView$d(AppBrandDesktopView paramAppBrandDesktopView, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(133841);
    if ((AppBrandDesktopView.E(paramAppBrandDesktopView) == 0) && (this.apJ != null))
    {
      this.apJ.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
      ab.i("MicroMsg.AppBrandDesktopView", "alvinluo FullEmptyViewHolder itemHeight: %d, itemWidth: %d", new Object[] { Integer.valueOf(this.apJ.getMeasuredHeight()), Integer.valueOf(this.apJ.getMeasuredWidth()) });
      AppBrandDesktopView.g(paramAppBrandDesktopView, this.apJ.getMeasuredHeight());
    }
    AppMethodBeat.o(133841);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.d
 * JD-Core Version:    0.6.2
 */
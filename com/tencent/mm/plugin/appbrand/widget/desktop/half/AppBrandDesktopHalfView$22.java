package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.support.v7.widget.RecyclerView.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandDesktopHalfView$22 extends RecyclerView.c
{
  AppBrandDesktopHalfView$22(AppBrandDesktopHalfView paramAppBrandDesktopHalfView)
  {
  }

  public final void ax(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134182);
    super.ax(paramInt1, paramInt2);
    if (AppBrandDesktopHalfView.c(this.jaW).getDataCount() <= AppBrandDesktopHalfView.c(this.jaW).getCustomCount())
      AppBrandDesktopHalfView.c(this.jaW).setVisibility(8);
    AppMethodBeat.o(134182);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfView.22
 * JD-Core Version:    0.6.2
 */
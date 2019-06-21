package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.support.v7.widget.RecyclerView.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandDesktopHalfView$16 extends RecyclerView.c
{
  AppBrandDesktopHalfView$16(AppBrandDesktopHalfView paramAppBrandDesktopHalfView)
  {
  }

  public final void ax(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134176);
    super.ax(paramInt1, paramInt2);
    if (AppBrandDesktopHalfView.d(this.jaW).getDataCount() <= AppBrandDesktopHalfView.d(this.jaW).getCustomCount())
      AppBrandDesktopHalfView.d(this.jaW).setVisibility(8);
    AppMethodBeat.o(134176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfView.16
 * JD-Core Version:    0.6.2
 */
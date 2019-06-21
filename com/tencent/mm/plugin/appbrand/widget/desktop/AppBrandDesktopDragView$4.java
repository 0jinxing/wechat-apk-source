package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.a;

final class AppBrandDesktopDragView$4
  implements a
{
  AppBrandDesktopDragView$4(AppBrandDesktopDragView paramAppBrandDesktopDragView)
  {
  }

  public final boolean O(RecyclerView.v paramv)
  {
    boolean bool = true;
    if (paramv.apN == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean P(RecyclerView.v paramv)
  {
    return false;
  }

  public final void a(int paramInt1, int paramInt2, Object paramObject, boolean paramBoolean)
  {
    AppMethodBeat.i(133750);
    if (AppBrandDesktopDragView.c(this.iWO) != null)
      AppBrandDesktopDragView.c(this.iWO).e(paramInt1, paramInt2, paramObject);
    AppMethodBeat.o(133750);
  }

  public final void a(RecyclerView.v paramv, View paramView, Object paramObject, int paramInt)
  {
  }

  public final boolean a(RecyclerView.v paramv, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramv.apN != 1)
      if (paramv.apN != 7)
        break label28;
    label28: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public final View b(RecyclerView paramRecyclerView, RecyclerView.v paramv)
  {
    AppMethodBeat.i(133749);
    paramRecyclerView = this.iWO.a((e)paramv);
    AppMethodBeat.o(133749);
    return paramRecyclerView;
  }

  public final void by(Object paramObject)
  {
    AppMethodBeat.i(133751);
    if (((paramObject instanceof AppBrandDesktopView.c)) && (AppBrandDesktopDragView.c(this.iWO) != null))
      AppBrandDesktopDragView.c(this.iWO).bJ(paramObject);
    AppMethodBeat.o(133751);
  }

  public final void cu(View paramView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.4
 * JD-Core Version:    0.6.2
 */
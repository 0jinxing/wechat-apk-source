package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.o;
import android.support.v7.widget.RecyclerView.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopView$j extends GridLayoutManager
{
  public AppBrandDesktopView$j(AppBrandDesktopView paramAppBrandDesktopView, int paramInt)
  {
    super(paramInt, (byte)0);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(133856);
    paramRecyclerView = new AppBrandDesktopView.i(this.iXS, AppBrandDesktopView.k(this.iXS));
    paramRecyclerView.ape = paramInt;
    a(paramRecyclerView);
    AppMethodBeat.o(133856);
  }

  public final void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(133855);
    try
    {
      super.c(paramo, params);
      AppMethodBeat.o(133855);
      return;
    }
    catch (IndexOutOfBoundsException paramo)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandDesktopView", "[onLayoutChildren] IndexOutOfBoundsException!!");
        AppMethodBeat.o(133855);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.j
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.o;
import android.support.v7.widget.RecyclerView.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class AppBrandLauncherRecentsList$3 extends LinearLayoutManager
{
  AppBrandLauncherRecentsList$3(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
    super(1);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(133332);
    paramRecyclerView = new q(this.iMV.getActivity(), AppBrandLauncherRecentsList.q(this.iMV));
    paramRecyclerView.ape = paramInt;
    a(paramRecyclerView);
    AppMethodBeat.o(133332);
  }

  public final int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    int i = 0;
    AppMethodBeat.i(138699);
    try
    {
      int j = super.b(paramInt, paramo, params);
      paramInt = j;
      AppMethodBeat.o(138699);
      return paramInt;
    }
    catch (IndexOutOfBoundsException paramo)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandLauncherRecentsList", paramo, "scrollVerticallyBy(%d, %s)", new Object[] { Integer.valueOf(paramInt), params });
        AppMethodBeat.o(138699);
        paramInt = i;
      }
    }
  }

  public final void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(133333);
    try
    {
      super.c(paramo, params);
      AppMethodBeat.o(133333);
      return;
    }
    catch (IndexOutOfBoundsException paramo)
    {
      while (true)
      {
        ab.w("MicroMsg.AppBrandLauncherRecentsList", "onLayoutChildren IndexOutOfBoundsException retry notifyDataSetChanged");
        try
        {
          AppBrandLauncherRecentsList.b(this.iMV).aop.notifyChanged();
          AppMethodBeat.o(133333);
        }
        catch (IllegalStateException paramo)
        {
          ab.w("MicroMsg.AppBrandLauncherRecentsList", "onLayoutChildren retry notifyDataSetChanged e=%s", new Object[] { paramo });
          if (bo.nullAsNil(paramo.getMessage()).contains("computing a layout or scrolling"))
          {
            paramo = new AppBrandLauncherRecentsList.3.1(this);
            AppBrandLauncherRecentsList.e(this.iMV).sendMessage(AppBrandLauncherRecentsList.e(this.iMV).obtainMessage(2, paramo));
          }
          AppMethodBeat.o(133333);
        }
      }
    }
  }

  public final boolean iE()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.3
 * JD-Core Version:    0.6.2
 */
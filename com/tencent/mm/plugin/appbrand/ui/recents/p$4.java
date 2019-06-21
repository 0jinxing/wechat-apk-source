package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v7.widget.av;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class p$4 extends y
{
  p$4(p paramp, AppBrandLauncherRecentsList.e parame, w paramw)
  {
  }

  public final void aA(View paramView)
  {
    AppMethodBeat.i(133510);
    this.iPh.a(null);
    this.iPg.m(this.iPi);
    this.iPg.iOW.remove(this.iPi);
    p.a(this.iPg);
    AppMethodBeat.o(133510);
  }

  public final void aB(View paramView)
  {
    AppMethodBeat.i(133511);
    if (paramView == null)
      AppMethodBeat.o(133511);
    while (true)
    {
      return;
      s.d(paramView, 0.0F);
      s.e(paramView, 1.0F);
      AppMethodBeat.o(133511);
    }
  }

  public final void az(View paramView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.p.4
 * JD-Core Version:    0.6.2
 */
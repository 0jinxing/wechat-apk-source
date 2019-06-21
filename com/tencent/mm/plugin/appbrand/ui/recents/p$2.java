package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class p$2 extends y
{
  p$2(p paramp, RecyclerView.v paramv, w paramw)
  {
  }

  public final void aA(View paramView)
  {
    AppMethodBeat.i(133505);
    if (paramView == null)
      AppMethodBeat.o(133505);
    while (true)
    {
      return;
      ((RecentsRecyclerView)paramView.getParent()).cz(paramView);
      this.iPh.a(null);
      s.d(paramView, 0.0F);
      this.iPg.B(this.ahD);
      this.iPg.iOS.remove(this.ahD);
      p.a(this.iPg);
      AppMethodBeat.o(133505);
    }
  }

  public final void aB(View paramView)
  {
    AppMethodBeat.i(133506);
    if (paramView == null)
      AppMethodBeat.o(133506);
    while (true)
    {
      return;
      s.d(paramView, 0.0F);
      s.e(paramView, 1.0F);
      AppMethodBeat.o(133506);
    }
  }

  public final void az(View paramView)
  {
    AppMethodBeat.i(133504);
    ((RecentsRecyclerView)paramView.getParent()).cy(paramView);
    this.iPg.D(this.ahD);
    AppMethodBeat.o(133504);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.p.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.widget.a;

import android.support.design.widget.BottomSheetBehavior.a;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$2 extends BottomSheetBehavior.a
{
  d$2(d paramd)
  {
  }

  public final void O(int paramInt)
  {
  }

  public final void h(float paramFloat)
  {
    AppMethodBeat.i(112648);
    if ((d.i(this.zQE) != null) && (!d.j(this.zQE)))
      if ((d.k(this.zQE).canScrollVertically(-1)) && (d.l(this.zQE)) && (paramFloat != 0.0F))
      {
        d.i(this.zQE).setVisibility(0);
        AppMethodBeat.o(112648);
      }
    while (true)
    {
      return;
      d.i(this.zQE).setVisibility(4);
      AppMethodBeat.o(112648);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.d.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MRecyclerView$3
  implements c
{
  MRecyclerView$3(MRecyclerView paramMRecyclerView)
  {
  }

  public final boolean K(View paramView, int paramInt)
  {
    AppMethodBeat.i(77493);
    boolean bool;
    if (MRecyclerView.c(this.joO) != null)
    {
      bool = MRecyclerView.c(this.joO).L(paramView, paramInt);
      AppMethodBeat.o(77493);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77493);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.3
 * JD-Core Version:    0.6.2
 */
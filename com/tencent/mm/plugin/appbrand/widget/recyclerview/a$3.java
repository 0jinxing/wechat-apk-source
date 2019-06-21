package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$3
  implements View.OnLongClickListener
{
  a$3(a parama, RecyclerView.v paramv, int paramInt)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(77463);
    boolean bool;
    if (a.c(this.joE) != null)
    {
      bool = a.c(this.joE).K(this.ahD.apJ, this.joF);
      AppMethodBeat.o(77463);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77463);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recyclerview.a.3
 * JD-Core Version:    0.6.2
 */
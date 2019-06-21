package com.tencent.mm.plugin.appbrand.widget.desktop.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1
  implements Runnable
{
  d$1(d paramd, RecyclerView paramRecyclerView, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134210);
    this.jbi.getAdapter().ch(this.jbj);
    AppMethodBeat.o(134210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.d.1
 * JD-Core Version:    0.6.2
 */
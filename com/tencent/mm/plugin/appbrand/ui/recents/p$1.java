package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.widget.RecyclerView.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;

final class p$1
  implements RecyclerView.f.a
{
  p$1(p paramp)
  {
  }

  public final void jT()
  {
    AppMethodBeat.i(133503);
    Iterator localIterator = this.iPg.iOP.iterator();
    while (localIterator.hasNext())
      ((RecyclerView.f.a)localIterator.next()).jT();
    this.iPg.iPf = false;
    AppMethodBeat.o(133503);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.p.1
 * JD-Core Version:    0.6.2
 */
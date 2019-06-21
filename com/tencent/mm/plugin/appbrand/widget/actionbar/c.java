package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;

public final class c
{
  HashSet<View.OnClickListener> iUS;
  HashSet<View.OnClickListener> iUT;

  public c()
  {
    AppMethodBeat.i(87482);
    this.iUS = new HashSet();
    this.iUT = new HashSet();
    AppMethodBeat.o(87482);
  }

  public final boolean cA(View paramView)
  {
    AppMethodBeat.i(87483);
    boolean bool;
    if (this.iUT.isEmpty())
    {
      bool = false;
      AppMethodBeat.o(87483);
    }
    while (true)
    {
      return bool;
      Iterator localIterator = this.iUT.iterator();
      while (localIterator.hasNext())
        ((View.OnClickListener)localIterator.next()).onClick(paramView);
      bool = true;
      AppMethodBeat.o(87483);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.c
 * JD-Core Version:    0.6.2
 */
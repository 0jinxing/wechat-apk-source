package com.tencent.mm.plugin.appbrand.widget.base;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

public final class b
  implements Iterator<View>
{
  private int counter = 0;
  private final ViewGroup eAl;

  public b(ViewGroup paramViewGroup)
  {
    this.eAl = paramViewGroup;
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(77397);
    boolean bool;
    if (this.counter < this.eAl.getChildCount())
    {
      bool = true;
      AppMethodBeat.o(77397);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77397);
    }
  }

  public final void remove()
  {
    AppMethodBeat.i(77398);
    this.eAl.removeViewAt(this.counter - 1);
    AppMethodBeat.o(77398);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.base.b
 * JD-Core Version:    0.6.2
 */
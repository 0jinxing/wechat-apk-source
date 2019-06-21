package com.tencent.mm.plugin.appbrand.widget.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;

final class e$4$1
  implements Runnable
{
  e$4$1(e.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(77406);
    this.jcc.jbZ.removeView(this.jcc.jcb);
    Iterator localIterator = this.jcc.jbZ.jbT.iterator();
    while (localIterator.hasNext())
      ((e.a)localIterator.next()).CV();
    AppMethodBeat.o(77406);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.e.4.1
 * JD-Core Version:    0.6.2
 */
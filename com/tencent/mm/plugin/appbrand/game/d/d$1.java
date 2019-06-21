package com.tencent.mm.plugin.appbrand.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Queue;

public final class d$1
  implements Runnable
{
  public d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130173);
    Iterator localIterator = d.a(this.hrM).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      d.b(this.hrM).log(str);
    }
    d.a(this.hrM).clear();
    AppMethodBeat.o(130173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.d.1
 * JD-Core Version:    0.6.2
 */
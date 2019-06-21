package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.a.i;
import java.util.Iterator;
import java.util.Vector;

final class j$3
  implements Runnable
{
  j$3(j paramj, int paramInt, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135677);
    Iterator localIterator = j.a(this.pJL).iterator();
    while (localIterator.hasNext())
      ((d)localIterator.next()).a(this.bVv, this.pJM);
    AppMethodBeat.o(135677);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.j.3
 * JD-Core Version:    0.6.2
 */
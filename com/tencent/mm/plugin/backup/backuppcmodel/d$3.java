package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.c;
import java.util.Iterator;
import java.util.Set;

final class d$3
  implements Runnable
{
  d$3(d paramd, Set paramSet, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17523);
    Iterator localIterator = this.jwt.iterator();
    while (localIterator.hasNext())
      ((b.c)localIterator.next()).rj(this.jtO);
    AppMethodBeat.o(17523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.d.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.c;
import java.util.Iterator;
import java.util.Set;

final class d$2
  implements Runnable
{
  d$2(d paramd, Set paramSet)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17522);
    Iterator localIterator = this.jwt.iterator();
    while (localIterator.hasNext())
      ((b.c)localIterator.next()).aSs();
    AppMethodBeat.o(17522);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.d.2
 * JD-Core Version:    0.6.2
 */
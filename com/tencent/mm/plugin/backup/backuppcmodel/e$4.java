package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.c;
import java.util.Iterator;
import java.util.Set;

final class e$4
  implements Runnable
{
  e$4(e parame, Set paramSet)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17547);
    Iterator localIterator = this.jwt.iterator();
    while (localIterator.hasNext())
      ((b.c)localIterator.next()).aSs();
    AppMethodBeat.o(17547);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.e.4
 * JD-Core Version:    0.6.2
 */
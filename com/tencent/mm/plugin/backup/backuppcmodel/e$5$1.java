package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.c;
import java.util.Iterator;
import java.util.Set;

final class e$5$1
  implements Runnable
{
  e$5$1(e.5 param5, Set paramSet, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17548);
    Iterator localIterator = this.jwt.iterator();
    while (localIterator.hasNext())
      ((b.c)localIterator.next()).rj(this.jtO);
    AppMethodBeat.o(17548);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.e.5.1
 * JD-Core Version:    0.6.2
 */
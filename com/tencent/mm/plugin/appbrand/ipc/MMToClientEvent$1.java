package com.tencent.mm.plugin.appbrand.ipc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class MMToClientEvent$1
  implements Runnable
{
  MMToClientEvent$1(MMToClientEvent paramMMToClientEvent, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86936);
    Iterator localIterator = this.hvB.iterator();
    while (localIterator.hasNext())
      ((MMToClientEvent.c)localIterator.next()).bk(MMToClientEvent.a(this.hvC));
    AppMethodBeat.o(86936);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.1
 * JD-Core Version:    0.6.2
 */
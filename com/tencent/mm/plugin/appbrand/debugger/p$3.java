package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class p$3
  implements Runnable
{
  p$3(p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101859);
    LinkedList localLinkedList = new LinkedList();
    synchronized (p.a(this.hks).mLock)
    {
      localLinkedList.addAll(p.b(this.hks));
      p.b(this.hks).clear();
      p.c(this.hks);
      p.a(this.hks, localLinkedList);
      AppMethodBeat.o(101859);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.p.3
 * JD-Core Version:    0.6.2
 */
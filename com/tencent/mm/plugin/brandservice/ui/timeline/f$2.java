package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

final class f$2
  implements Runnable
{
  f$2(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14171);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.jOh.jOf.entrySet().iterator();
    while (localIterator.hasNext())
      localLinkedList.add((f.a)((Map.Entry)localIterator.next()).getValue());
    com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.brandservice.b.g(localLinkedList, this.jOh.jOd, this.jOh.jOe, this.jOh.ctE), 0);
    AppMethodBeat.o(14171);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.f.2
 * JD-Core Version:    0.6.2
 */
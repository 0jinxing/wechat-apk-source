package com.tencent.mm.plugin.brandservice.ui.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.storage.q;
import java.util.Iterator;
import java.util.List;

final class c$2
  implements Runnable
{
  c$2(List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14451);
    Iterator localIterator = this.ibp.iterator();
    while (localIterator.hasNext())
    {
      q localq = (q)localIterator.next();
      if (localq.drC())
        ((a)g.K(a.class)).b(localq.field_msgId, localq.field_content);
    }
    AppMethodBeat.o(14451);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.b.c.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.d;
import java.util.Iterator;
import java.util.List;

final class i$10
  implements Runnable
{
  i$10(i parami, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25856);
    synchronized (this.syV.callbacks)
    {
      Iterator localIterator = this.syV.callbacks.iterator();
      if (localIterator.hasNext())
        ((d)localIterator.next()).aU(this.nKY, this.nKZ);
    }
    AppMethodBeat.o(25856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.i.10
 * JD-Core Version:    0.6.2
 */
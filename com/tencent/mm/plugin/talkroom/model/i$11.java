package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class i$11
  implements Runnable
{
  i$11(i parami, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25857);
    synchronized (this.syV.callbacks)
    {
      Iterator localIterator = this.syV.callbacks.iterator();
      if (localIterator.hasNext())
        localIterator.next();
    }
    AppMethodBeat.o(25857);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.i.11
 * JD-Core Version:    0.6.2
 */
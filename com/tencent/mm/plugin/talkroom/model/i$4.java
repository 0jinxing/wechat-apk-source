package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.d;
import java.util.Iterator;
import java.util.List;

final class i$4
  implements Runnable
{
  i$4(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25850);
    synchronized (this.syV.callbacks)
    {
      Iterator localIterator = this.syV.callbacks.iterator();
      if (localIterator.hasNext())
        ((d)localIterator.next()).akH();
    }
    AppMethodBeat.o(25850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.i.4
 * JD-Core Version:    0.6.2
 */
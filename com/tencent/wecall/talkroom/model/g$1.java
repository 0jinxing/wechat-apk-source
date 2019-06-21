package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class g$1
  implements Runnable
{
  g$1(g paramg, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127948);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).ze(this.AKJ);
    }
    AppMethodBeat.o(127948);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.1
 * JD-Core Version:    0.6.2
 */
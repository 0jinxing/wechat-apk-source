package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class g$15
  implements Runnable
{
  g$15(g paramg, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127962);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).Sn(this.AKN);
    }
    AppMethodBeat.o(127962);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.15
 * JD-Core Version:    0.6.2
 */
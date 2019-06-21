package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class g$11
  implements Runnable
{
  g$11(g paramg, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127958);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).cr(this.AKM);
    }
    AppMethodBeat.o(127958);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.11
 * JD-Core Version:    0.6.2
 */
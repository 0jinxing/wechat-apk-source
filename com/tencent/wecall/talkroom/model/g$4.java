package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class g$4
  implements Runnable
{
  g$4(g paramg, int paramInt, Object paramObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127951);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).k(this.crd, this.roS);
    }
    AppMethodBeat.o(127951);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.4
 * JD-Core Version:    0.6.2
 */
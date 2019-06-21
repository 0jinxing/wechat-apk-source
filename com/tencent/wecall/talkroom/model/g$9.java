package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class g$9
  implements Runnable
{
  g$9(g paramg, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127956);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).onStateChanged(this.nx);
    }
    AppMethodBeat.o(127956);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.9
 * JD-Core Version:    0.6.2
 */
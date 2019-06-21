package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class g$3
  implements Runnable
{
  g$3(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127950);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).akC();
    }
    AppMethodBeat.o(127950);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.3
 * JD-Core Version:    0.6.2
 */
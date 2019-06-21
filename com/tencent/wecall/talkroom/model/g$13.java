package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class g$13
  implements Runnable
{
  g$13(g paramg, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127960);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).eS(this.kAC, this.crd);
    }
    AppMethodBeat.o(127960);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.13
 * JD-Core Version:    0.6.2
 */
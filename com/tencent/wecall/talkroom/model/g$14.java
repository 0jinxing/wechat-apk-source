package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class g$14
  implements Runnable
{
  g$14(g paramg, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127961);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).jg(this.kAS);
    }
    AppMethodBeat.o(127961);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.14
 * JD-Core Version:    0.6.2
 */
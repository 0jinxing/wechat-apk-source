package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.Iterator;
import java.util.List;

final class g$5
  implements Runnable
{
  g$5(g paramg, MultiTalkGroup paramMultiTalkGroup)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127952);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).g(this.oGE);
    }
    AppMethodBeat.o(127952);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.5
 * JD-Core Version:    0.6.2
 */
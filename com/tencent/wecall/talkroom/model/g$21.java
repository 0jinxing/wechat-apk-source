package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.Iterator;
import java.util.List;

final class g$21
  implements Runnable
{
  g$21(g paramg, int paramInt, MultiTalkGroup paramMultiTalkGroup)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127968);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).a(this.gdi, this.oGE);
    }
    AppMethodBeat.o(127968);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.21
 * JD-Core Version:    0.6.2
 */
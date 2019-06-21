package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class g$17
  implements Runnable
{
  g$17(g paramg, String paramString, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127964);
    synchronized (this.AKK.callbacks)
    {
      Iterator localIterator = this.AKK.callbacks.iterator();
      if (localIterator.hasNext())
        ((g.a)localIterator.next()).H(this.kAC, this.AKO);
    }
    AppMethodBeat.o(127964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.17
 * JD-Core Version:    0.6.2
 */
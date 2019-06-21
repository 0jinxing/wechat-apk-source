package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class g$8
  implements Runnable
{
  g$8(g paramg, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127955);
    synchronized (this.AKK.callbacks)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(this.AKK.callbacks);
      ??? = localArrayList.iterator();
      if (((Iterator)???).hasNext())
        ((g.a)((Iterator)???).next()).cq(this.kAC, this.AKL);
    }
    AppMethodBeat.o(127955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g.8
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.d;
import java.util.Iterator;
import java.util.List;

final class i$9
  implements Runnable
{
  i$9(i parami, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25855);
    synchronized (this.syV.callbacks)
    {
      Iterator localIterator = this.syV.callbacks.iterator();
      if (localIterator.hasNext())
        ((d)localIterator.next()).g(this.crc, this.crd, this.syZ);
    }
    AppMethodBeat.o(25855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.i.9
 * JD-Core Version:    0.6.2
 */
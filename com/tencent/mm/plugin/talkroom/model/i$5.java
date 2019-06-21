package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.d;
import java.util.Iterator;
import java.util.List;

final class i$5
  implements Runnable
{
  i$5(i parami, String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25851);
    synchronized (this.syV.callbacks)
    {
      Iterator localIterator = this.syV.callbacks.iterator();
      if (localIterator.hasNext())
        ((d)localIterator.next()).l(this.syW, this.syX, this.syY);
    }
    AppMethodBeat.o(25851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.i.5
 * JD-Core Version:    0.6.2
 */
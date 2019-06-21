package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;

final class j$2
  implements Runnable
{
  j$2(j paramj, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111248);
    synchronized (j.bEh())
    {
      Iterator localIterator = j.bEh().iterator();
      if (localIterator.hasNext())
        ((j.a)localIterator.next()).f(this.val$event, this.val$packageName, this.mVV);
    }
    AppMethodBeat.o(111248);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.j.2
 * JD-Core Version:    0.6.2
 */
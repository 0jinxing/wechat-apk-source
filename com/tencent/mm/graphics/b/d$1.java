package com.tencent.mm.graphics.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimerTask;

public final class d$1 extends TimerTask
{
  public d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57086);
    synchronized (d.a(this.eCT))
    {
      if (d.b(this.eCT))
      {
        Iterator localIterator = d.c(this.eCT).values().iterator();
        if (!localIterator.hasNext())
          break label89;
        ((a)localIterator.next()).Px();
      }
    }
    ab.w("MicroMsg.PerformanceMonitor", "hy: already stopped");
    cancel();
    label89: AppMethodBeat.o(57086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.b.d.1
 * JD-Core Version:    0.6.2
 */
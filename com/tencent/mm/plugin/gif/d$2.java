package com.tencent.mm.plugin.gif;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$2
  implements Runnable
{
  d$2(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62381);
    if (((this.npc.isRunning()) || (d.b(this.npc) == 0)) && (SystemClock.uptimeMillis() >= d.c(this.npc)))
    {
      d.a(this.npc, System.currentTimeMillis());
      d.d(this.npc);
      this.npc.invalidateSelf();
      if (d.a(this.npc) != null)
        d.a(this.npc).invalidate();
    }
    AppMethodBeat.o(62381);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.d.2
 * JD-Core Version:    0.6.2
 */
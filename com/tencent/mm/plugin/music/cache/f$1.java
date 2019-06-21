package com.tencent.mm.plugin.music.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.f.c.b;

final class f$1
  implements Runnable
{
  f$1(f paramf, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137421);
    long l = this.val$currentTime;
    if (e.bTG())
      ((c)b.ar(c.class)).jm(l);
    f.a(this.oLd);
    AppMethodBeat.o(137421);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.f.1
 * JD-Core Version:    0.6.2
 */
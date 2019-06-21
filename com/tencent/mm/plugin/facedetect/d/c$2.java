package com.tencent.mm.plugin.facedetect.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.TimerTask;

final class c$2 extends TimerTask
{
  c$2(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(299);
    synchronized (c.b(this.lVp))
    {
      if (!c.c(this.lVp))
      {
        ab.w(c.access$300(), "hy: already stopped");
        cancel();
      }
      c.2.1 local1 = new com/tencent/mm/plugin/facedetect/d/c$2$1;
      local1.<init>(this);
      al.d(local1);
      AppMethodBeat.o(299);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.c.2
 * JD-Core Version:    0.6.2
 */
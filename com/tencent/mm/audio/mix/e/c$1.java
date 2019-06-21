package com.tencent.mm.audio.mix.e;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.f.d;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

final class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137087);
    Process.setThreadPriority(-19);
    if (this.cmN.DB())
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixController", "stop and exit");
      AppMethodBeat.o(137087);
    }
    while (true)
    {
      return;
      label33: System.nanoTime();
      List localList = this.cmN.DY();
      com.tencent.mm.audio.mix.a.b localb;
      d locald;
      if (localList.size() > 0)
      {
        long l1 = System.nanoTime();
        localb = this.cmN.cmq.I(localList);
        long l2 = System.nanoTime();
        ??? = this.cmN;
        ((c)???).cmI += 1;
        this.cmN.cmJ = (l2 - l1 + this.cmN.cmJ);
        if (localb != null)
        {
          ??? = this.cmN;
          localb.ckw.addAll(((c)???).ckw);
          ((c)???).ckw.clear();
          locald = ((c)???).cmr;
          if (!locald.cnw.get())
            break label218;
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixPlayerImpl", "exit, not to add MixBuff queue");
        }
      }
      while (true)
      {
        c.H(localList);
        localList.clear();
        if (this.cmN.DB())
          break label324;
        this.cmN.DV();
        if (!this.cmN.DB())
          break label33;
        AppMethodBeat.o(137087);
        break;
        label218: synchronized (locald.cny)
        {
          while (true)
            if (locald.cnx.size() >= 2)
            {
              boolean bool = locald.cnw.get();
              if (!bool)
                try
                {
                  locald.cny.wait();
                }
                catch (InterruptedException localInterruptedException)
                {
                  com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", localInterruptedException, "enqueueMixBuffer", new Object[0]);
                }
            }
        }
        locald.cnx.add(localb);
        locald.cny.notifyAll();
      }
      label324: com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "mix thread stop and exit");
      AppMethodBeat.o(137087);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.c.1
 * JD-Core Version:    0.6.2
 */
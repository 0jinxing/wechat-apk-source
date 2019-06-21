package com.tencent.mm.audio.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

final class d$a
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(55774);
    while (true)
    {
      synchronized (this.crD)
      {
        boolean bool = this.crD.cro;
        ab.d("MicroMsg.SpeexWriter", "ThreadSpeex in: " + bool + " queueLen: " + this.crD.crn.size());
        if (bool)
          if (this.crD.crn.isEmpty())
            break;
      }
      try
      {
        ??? = (g.a)this.crD.crn.poll(200L, TimeUnit.MILLISECONDS);
        if (??? != null)
          break label159;
        ab.e("MicroMsg.SpeexWriter", "poll byteBuf is null, " + this.crD.crp);
        continue;
        localObject2 = finally;
        AppMethodBeat.o(55774);
        throw localObject2;
      }
      catch (InterruptedException localInterruptedException)
      {
        ab.i("MicroMsg.SpeexWriter", "ThreadSpeex poll null");
      }
      continue;
      label159: this.crD.a(localInterruptedException, 0, false);
    }
    AppMethodBeat.o(55774);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.d.d.a
 * JD-Core Version:    0.6.2
 */
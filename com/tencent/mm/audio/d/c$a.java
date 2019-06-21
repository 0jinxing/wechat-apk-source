package com.tencent.mm.audio.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public final class c$a
  implements Runnable
{
  private c$a(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55765);
    ab.i("MicroMsg.SilkWriter", "Silk Thread start run");
    label166: int i;
    while (true)
    {
      boolean bool;
      synchronized (this.crA)
      {
        bool = c.a(this.crA);
        ab.d("MicroMsg.SilkWriter", "ThreadSilk in :" + bool + " cnt :" + c.b(this.crA).size());
        if (bool)
          if (c.b(this.crA).isEmpty())
            break label288;
      }
      try
      {
        g.a locala = (g.a)c.b(this.crA).poll(200L, TimeUnit.MILLISECONDS);
        if (locala != null)
          break label166;
        ab.i("MicroMsg.SilkWriter", "poll byte null file:" + c.c(this.crA));
        continue;
        localObject = finally;
        AppMethodBeat.o(55765);
        throw localObject;
      }
      catch (InterruptedException localInterruptedException)
      {
        ab.i("MicroMsg.SilkWriter", "ThreadAmr poll null");
      }
      continue;
      i = c.b(this.crA).size();
      if ((i > 10) || (bool))
      {
        ab.w("MicroMsg.SilkWriter", "speed up silkcodec queue:" + i + " stop:" + bool);
        i = 0;
      }
    }
    while (true)
    {
      int j = i;
      if (c.Fi().count >= 10)
      {
        j = i;
        if (c.Fi().crk > 240L)
          j = 0;
      }
      this.crA.a(localInterruptedException, j, false);
      break;
      if (i < 9)
      {
        i = 1;
        continue;
        label288: AppMethodBeat.o(55765);
      }
      else
      {
        i = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.d.c.a
 * JD-Core Version:    0.6.2
 */
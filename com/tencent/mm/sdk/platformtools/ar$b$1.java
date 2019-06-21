package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class ar$b$1
  implements Runnable
{
  ar$b$1(ar.b paramb, ar.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(93419);
    try
    {
      this.xAe.xAl.await();
      AppMethodBeat.o(93419);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        AppMethodBeat.o(93419);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ar.b.1
 * JD-Core Version:    0.6.2
 */
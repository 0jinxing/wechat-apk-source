package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Deprecated
class ba
{
  private static final ConcurrentLinkedQueue<Runnable> xBa;
  private static ExecutorService xBb;

  static
  {
    AppMethodBeat.i(93590);
    xBa = new ConcurrentLinkedQueue();
    xBb = null;
    AppMethodBeat.o(93590);
  }

  public static void ah(Runnable paramRunnable)
  {
    AppMethodBeat.i(93588);
    xBa.add(paramRunnable);
    AppMethodBeat.o(93588);
  }

  public static void ai(Runnable paramRunnable)
  {
    AppMethodBeat.i(93589);
    xBa.remove(paramRunnable);
    AppMethodBeat.o(93589);
  }

  public static ExecutorService dph()
  {
    AppMethodBeat.i(93587);
    try
    {
      if (xBb == null)
        xBb = Executors.newSingleThreadExecutor();
      ExecutorService localExecutorService = xBb;
      return localExecutorService;
    }
    finally
    {
      AppMethodBeat.o(93587);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ba
 * JD-Core Version:    0.6.2
 */
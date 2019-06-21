package kotlinx.coroutines;

import a.f.b.j;
import a.h.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "_thread", "Ljava/lang/Thread;", "_thread$annotations", "debugStatus", "isCompleted", "", "()Z", "isShutdownRequested", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "isCorrectThread", "notifyStartup", "run", "shutdown", "timeout", "thread", "unpark", "kotlinx-coroutines-core"})
public final class ag extends at
  implements Runnable
{
  private static final long BPT;
  private static volatile Thread BPU;
  private static volatile int BPV;
  public static final ag BPW;

  static
  {
    AppMethodBeat.i(118461);
    BPW = new ag();
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    try
    {
      Long localLong1 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
      j.o(localLong1, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
      BPT = localTimeUnit.toNanos(localLong1.longValue());
      AppMethodBeat.o(118461);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
        Long localLong2 = Long.valueOf(1000L);
    }
  }

  private static boolean elb()
  {
    int i = BPV;
    if ((i == 2) || (i == 3));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private final Thread elc()
  {
    AppMethodBeat.i(118456);
    Thread localThread1 = BPU;
    Thread localThread2 = localThread1;
    if (localThread1 == null)
      localThread2 = eld();
    AppMethodBeat.o(118456);
    return localThread2;
  }

  private final Thread eld()
  {
    try
    {
      AppMethodBeat.i(118457);
      Thread localThread1 = BPU;
      Thread localThread2 = localThread1;
      if (localThread1 == null)
      {
        localThread2 = new java/lang/Thread;
        localThread2.<init>((Runnable)this, "kotlinx.coroutines.DefaultExecutor");
        BPU = localThread2;
        localThread2.setDaemon(true);
        localThread2.start();
      }
      AppMethodBeat.o(118457);
      return localThread2;
    }
    finally
    {
    }
  }

  private final boolean elf()
  {
    try
    {
      AppMethodBeat.i(118459);
      boolean bool;
      if (elb())
      {
        bool = false;
        AppMethodBeat.o(118459);
      }
      while (true)
      {
        return bool;
        BPV = 1;
        ((Object)this).notifyAll();
        AppMethodBeat.o(118459);
        bool = true;
      }
    }
    finally
    {
    }
  }

  private final void elg()
  {
    try
    {
      AppMethodBeat.i(118460);
      if (!elb())
        AppMethodBeat.o(118460);
      while (true)
      {
        return;
        BPV = 3;
        this.BQj = null;
        this.BQl = null;
        ((Object)this).notifyAll();
        AppMethodBeat.o(118460);
      }
    }
    finally
    {
    }
  }

  protected final void ele()
  {
    AppMethodBeat.i(118458);
    bs.elC().unpark(elc());
    AppMethodBeat.o(118458);
  }

  public final void run()
  {
    AppMethodBeat.i(118455);
    bs.elC();
    while (true)
    {
      try
      {
        boolean bool = elf();
        if (!bool)
        {
          return;
          Object localObject1;
          bs.elC().parkNanos(this, localObject1);
          Object localObject2;
          l3 = localObject2;
          Thread.interrupted();
          long l4 = elo();
          long l1 = l4;
          long l2 = l3;
          if (l4 == 9223372036854775807L)
          {
            if (l3 != 9223372036854775807L)
              continue;
            l2 = bs.elC().nanoTime();
            l1 = l3;
            if (l3 == 9223372036854775807L)
            {
              l3 = BPT;
              l1 = l3 + l2;
            }
            l3 = l1 - l2;
            if (l3 <= 0L)
            {
              BPU = null;
              elg();
              bs.elC();
              if (!isEmpty())
                elc();
              AppMethodBeat.o(118455);
              continue;
            }
            l3 = e.aj(l4, l3);
            l2 = l1;
            l1 = l3;
          }
          l3 = l2;
          if (l1 <= 0L)
            continue;
          bool = elb();
          if (!bool)
            continue;
          BPU = null;
          elg();
          bs.elC();
          if (!isEmpty())
            elc();
          AppMethodBeat.o(118455);
          continue;
          l1 = e.aj(l4, BPT);
          l2 = l3;
          continue;
        }
      }
      finally
      {
        BPU = null;
        elg();
        bs.elC();
        if (!isEmpty())
          elc();
        AppMethodBeat.o(118455);
      }
      long l3 = 9223372036854775807L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.ag
 * JD-Core Version:    0.6.2
 */
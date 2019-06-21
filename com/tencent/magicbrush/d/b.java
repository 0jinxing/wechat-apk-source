package com.tencent.magicbrush.d;

import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class b
  implements Runnable
{
  public final FutureTask<?> bUA;

  public b(Runnable paramRunnable)
  {
    AppMethodBeat.i(116009);
    this.bUA = new FutureTask(paramRunnable, Integer.valueOf(0));
    AppMethodBeat.o(116009);
  }

  public <T> b(Callable<T> paramCallable)
  {
    AppMethodBeat.i(116010);
    this.bUA = new FutureTask(paramCallable);
    AppMethodBeat.o(116010);
  }

  public final <T> T get()
  {
    AppMethodBeat.i(116011);
    try
    {
      Object localObject1 = this.bUA.get();
      AppMethodBeat.o(116011);
      return localObject1;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        c.c.a("MagicBrush.SyncTask", localInterruptedException, "await failed", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(116011);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
        c.c.a("MagicBrush.SyncTask", localExecutionException, "execute failed", new Object[0]);
    }
  }

  public void run()
  {
    AppMethodBeat.i(116012);
    this.bUA.run();
    AppMethodBeat.o(116012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.d.b
 * JD-Core Version:    0.6.2
 */
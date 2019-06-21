package com.bumptech.glide.c.b.c;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a
  implements ExecutorService
{
  private static volatile int aDA;
  private static final long aDz;
  private final ExecutorService aDB;

  static
  {
    AppMethodBeat.i(92025);
    aDz = TimeUnit.SECONDS.toMillis(10L);
    AppMethodBeat.o(92025);
  }

  private a(ExecutorService paramExecutorService)
  {
    this.aDB = paramExecutorService;
  }

  public static a nb()
  {
    AppMethodBeat.i(92006);
    Object localObject = a.b.aDJ;
    localObject = new a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.a("disk-cache", (a.b)localObject, true)));
    AppMethodBeat.o(92006);
    return localObject;
  }

  public static a nc()
  {
    AppMethodBeat.i(92007);
    int i = nf();
    Object localObject = a.b.aDJ;
    localObject = new a(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.a("source", (a.b)localObject, false)));
    AppMethodBeat.o(92007);
    return localObject;
  }

  public static a nd()
  {
    AppMethodBeat.i(92008);
    a locala = new a(new ThreadPoolExecutor(0, 2147483647, aDz, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.a("source-unlimited", a.b.aDJ, false)));
    AppMethodBeat.o(92008);
    return locala;
  }

  public static a ne()
  {
    AppMethodBeat.i(92009);
    if (nf() >= 4);
    for (int i = 2; ; i = 1)
    {
      Object localObject = a.b.aDJ;
      localObject = new a(new ThreadPoolExecutor(0, i, aDz, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.a("animation", (a.b)localObject, true)));
      AppMethodBeat.o(92009);
      return localObject;
    }
  }

  private static int nf()
  {
    AppMethodBeat.i(92024);
    if (aDA == 0)
      aDA = Math.min(4, b.availableProcessors());
    int i = aDA;
    AppMethodBeat.o(92024);
    return i;
  }

  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
  {
    AppMethodBeat.i(92022);
    boolean bool = this.aDB.awaitTermination(paramLong, paramTimeUnit);
    AppMethodBeat.o(92022);
    return bool;
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(92010);
    this.aDB.execute(paramRunnable);
    AppMethodBeat.o(92010);
  }

  public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection)
  {
    AppMethodBeat.i(92012);
    paramCollection = this.aDB.invokeAll(paramCollection);
    AppMethodBeat.o(92012);
    return paramCollection;
  }

  public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    AppMethodBeat.i(92013);
    paramCollection = this.aDB.invokeAll(paramCollection, paramLong, paramTimeUnit);
    AppMethodBeat.o(92013);
    return paramCollection;
  }

  public final <T> T invokeAny(Collection<? extends Callable<T>> paramCollection)
  {
    AppMethodBeat.i(92014);
    paramCollection = this.aDB.invokeAny(paramCollection);
    AppMethodBeat.o(92014);
    return paramCollection;
  }

  public final <T> T invokeAny(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    AppMethodBeat.i(92015);
    paramCollection = this.aDB.invokeAny(paramCollection, paramLong, paramTimeUnit);
    AppMethodBeat.o(92015);
    return paramCollection;
  }

  public final boolean isShutdown()
  {
    AppMethodBeat.i(92020);
    boolean bool = this.aDB.isShutdown();
    AppMethodBeat.o(92020);
    return bool;
  }

  public final boolean isTerminated()
  {
    AppMethodBeat.i(92021);
    boolean bool = this.aDB.isTerminated();
    AppMethodBeat.o(92021);
    return bool;
  }

  public final void shutdown()
  {
    AppMethodBeat.i(92018);
    this.aDB.shutdown();
    AppMethodBeat.o(92018);
  }

  public final List<Runnable> shutdownNow()
  {
    AppMethodBeat.i(92019);
    List localList = this.aDB.shutdownNow();
    AppMethodBeat.o(92019);
    return localList;
  }

  public final Future<?> submit(Runnable paramRunnable)
  {
    AppMethodBeat.i(92011);
    paramRunnable = this.aDB.submit(paramRunnable);
    AppMethodBeat.o(92011);
    return paramRunnable;
  }

  public final <T> Future<T> submit(Runnable paramRunnable, T paramT)
  {
    AppMethodBeat.i(92016);
    paramRunnable = this.aDB.submit(paramRunnable, paramT);
    AppMethodBeat.o(92016);
    return paramRunnable;
  }

  public final <T> Future<T> submit(Callable<T> paramCallable)
  {
    AppMethodBeat.i(92017);
    paramCallable = this.aDB.submit(paramCallable);
    AppMethodBeat.o(92017);
    return paramCallable;
  }

  public final String toString()
  {
    AppMethodBeat.i(92023);
    String str = this.aDB.toString();
    AppMethodBeat.o(92023);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.c.a
 * JD-Core Version:    0.6.2
 */
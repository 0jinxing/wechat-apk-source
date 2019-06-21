package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class bv
  implements ThreadFactory
{
  private static final AtomicInteger a;
  private final ThreadGroup b;
  private final AtomicInteger c;
  private final String d;

  static
  {
    AppMethodBeat.i(98587);
    a = new AtomicInteger(1);
    AppMethodBeat.o(98587);
  }

  public bv(String paramString)
  {
    AppMethodBeat.i(98585);
    this.c = new AtomicInteger(1);
    Object localObject = System.getSecurityManager();
    if (localObject != null);
    for (localObject = ((SecurityManager)localObject).getThreadGroup(); ; localObject = Thread.currentThread().getThreadGroup())
    {
      this.b = ((ThreadGroup)localObject);
      this.d = (paramString + "_" + a.getAndIncrement() + "_thread_");
      AppMethodBeat.o(98585);
      return;
    }
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(98586);
    Thread localThread = new Thread(this.b, paramRunnable, this.d + this.c.getAndIncrement(), 0L);
    if (localThread.isDaemon())
      localThread.setDaemon(false);
    try
    {
      localThread.setPriority(5);
      label63: AppMethodBeat.o(98586);
      return localThread;
    }
    catch (Exception paramRunnable)
    {
      break label63;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bv
 * JD-Core Version:    0.6.2
 */
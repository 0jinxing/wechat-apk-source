package com.tencent.mm.at.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.h;
import com.tencent.mm.sdk.g.d;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a
{
  public static h cs(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116064);
    Object localObject = new com.tencent.mm.at.a.e.a();
    if (d.xDC)
    {
      localObject = new a.c(paramInt1, paramInt1, TimeUnit.MILLISECONDS, (BlockingQueue)localObject, w(paramInt2, "image_loader_"));
      AppMethodBeat.o(116064);
    }
    while (true)
    {
      return localObject;
      localObject = new a.a(paramInt1, paramInt1, (BlockingQueue)localObject);
      AppMethodBeat.o(116064);
    }
  }

  private static ThreadFactory w(int paramInt, String paramString)
  {
    AppMethodBeat.i(116065);
    paramString = new b(paramInt, paramString);
    AppMethodBeat.o(116065);
    return paramString;
  }

  static final class b
    implements ThreadFactory
  {
    private static final AtomicInteger eRB;
    private final ThreadGroup cme;
    private final AtomicInteger cmf;
    private final String cmg;
    private final int eRC;

    static
    {
      AppMethodBeat.i(116057);
      eRB = new AtomicInteger(1);
      AppMethodBeat.o(116057);
    }

    b(int paramInt, String paramString)
    {
      AppMethodBeat.i(116055);
      this.cmf = new AtomicInteger(1);
      this.eRC = paramInt;
      Object localObject = System.getSecurityManager();
      if (localObject != null);
      for (localObject = ((SecurityManager)localObject).getThreadGroup(); ; localObject = Thread.currentThread().getThreadGroup())
      {
        this.cme = ((ThreadGroup)localObject);
        this.cmg = (paramString + eRB.getAndIncrement() + "-thread-");
        AppMethodBeat.o(116055);
        return;
      }
    }

    public final Thread newThread(Runnable paramRunnable)
    {
      AppMethodBeat.i(116056);
      paramRunnable = new Thread(this.cme, paramRunnable, this.cmg + this.cmf.getAndIncrement(), 0L);
      if (paramRunnable.isDaemon())
        paramRunnable.setDaemon(false);
      paramRunnable.setPriority(this.eRC);
      AppMethodBeat.o(116056);
      return paramRunnable;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.a.a
 * JD-Core Version:    0.6.2
 */
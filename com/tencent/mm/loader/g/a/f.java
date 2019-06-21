package com.tencent.mm.loader.g.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class f
  implements ThreadFactory
{
  private static final AtomicInteger eRB = new AtomicInteger(1);
  private final ThreadGroup cme;
  private final AtomicInteger cmf = new AtomicInteger(1);
  private final String cmg;
  private final int eRC;

  public f(int paramInt, String paramString)
  {
    this.eRC = paramInt;
    Object localObject = System.getSecurityManager();
    if (localObject != null);
    for (localObject = ((SecurityManager)localObject).getThreadGroup(); ; localObject = Thread.currentThread().getThreadGroup())
    {
      this.cme = ((ThreadGroup)localObject);
      this.cmg = (paramString + eRB.getAndIncrement() + "-thread-");
      return;
    }
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(this.cme, paramRunnable, this.cmg + this.cmf.getAndIncrement(), 0L);
    if (paramRunnable.isDaemon())
      paramRunnable.setDaemon(false);
    paramRunnable.setPriority(this.eRC);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.g.a.f
 * JD-Core Version:    0.6.2
 */
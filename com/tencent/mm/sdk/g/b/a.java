package com.tencent.mm.sdk.g.b;

import java.util.concurrent.Executor;

public abstract interface a extends Executor
{
  public abstract int getCorePoolSize();

  public abstract void p(Runnable paramRunnable, long paramLong);

  public abstract boolean remove(Runnable paramRunnable);

  public abstract void reset();

  public abstract void shutdown();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.b.a
 * JD-Core Version:    0.6.2
 */
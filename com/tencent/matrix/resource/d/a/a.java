package com.tencent.matrix.resource.d.a;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T>
{
  public final AtomicReference<T> bXP = new AtomicReference();
  public final CountDownLatch bXQ = new CountDownLatch(1);

  public final boolean a(TimeUnit paramTimeUnit)
  {
    try
    {
      boolean bool = this.bXQ.await(5L, paramTimeUnit);
      return bool;
    }
    catch (InterruptedException paramTimeUnit)
    {
    }
    throw new RuntimeException("Did not expect thread to be interrupted", paramTimeUnit);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.d.a.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.loader.g.a;

import com.tencent.mm.loader.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class b extends ThreadPoolExecutor
  implements a
{
  private ReentrantLock eRw = new ReentrantLock();
  private Condition eRx = this.eRw.newCondition();
  private BlockingQueue<Runnable> eRy;
  private boolean isPaused;

  public b(int paramInt1, int paramInt2, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, ThreadFactory paramThreadFactory)
  {
    super(paramInt1, paramInt2, 0L, paramTimeUnit, paramBlockingQueue, paramThreadFactory);
    this.eRy = paramBlockingQueue;
  }

  protected final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    super.beforeExecute(paramThread, paramRunnable);
    this.eRw.lock();
    try
    {
      while (this.isPaused)
        this.eRx.await();
    }
    catch (Exception paramRunnable)
    {
      paramThread.interrupt();
      ab.w("MicroMsg.Loader.imageloader.DefaultThreadPoolExecutor", "[cpan] before execute exception:%s", new Object[] { paramRunnable.toString() });
      while (true)
      {
        return;
        this.eRw.unlock();
      }
    }
    finally
    {
      this.eRw.unlock();
    }
    throw paramThread;
  }

  public final void execute(Runnable paramRunnable)
  {
    super.execute(paramRunnable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.g.a.b
 * JD-Core Version:    0.6.2
 */
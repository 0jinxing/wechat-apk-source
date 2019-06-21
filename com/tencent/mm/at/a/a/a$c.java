package com.tencent.mm.at.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

final class a$c extends ThreadPoolExecutor
  implements h
{
  private ReentrantLock eRw;
  private Condition eRx;
  private BlockingQueue<Runnable> eRy;
  private boolean isPaused;

  public a$c(int paramInt1, int paramInt2, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, ThreadFactory paramThreadFactory)
  {
    super(paramInt1, paramInt2, 0L, paramTimeUnit, paramBlockingQueue, paramThreadFactory);
    AppMethodBeat.i(116058);
    this.eRw = new ReentrantLock();
    this.eRx = this.eRw.newCondition();
    this.eRy = paramBlockingQueue;
    AppMethodBeat.o(116058);
  }

  public final boolean DA()
  {
    return this.isPaused;
  }

  protected final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    AppMethodBeat.i(116059);
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
      ab.w("MicroMsg.imageloader.DefaultThreadPoolExecutor", "[cpan] before execute exception:%s", new Object[] { paramRunnable.toString() });
      while (true)
      {
        return;
        this.eRw.unlock();
        AppMethodBeat.o(116059);
      }
    }
    finally
    {
      this.eRw.unlock();
      AppMethodBeat.o(116059);
    }
    throw paramThread;
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(116062);
    super.execute(paramRunnable);
    AppMethodBeat.o(116062);
  }

  public final void pause()
  {
    AppMethodBeat.i(116060);
    this.eRw.lock();
    try
    {
      this.isPaused = true;
      return;
    }
    finally
    {
      this.eRw.unlock();
      AppMethodBeat.o(116060);
    }
  }

  public final void remove(Object paramObject)
  {
    AppMethodBeat.i(116063);
    if (this.eRy != null)
      this.eRy.remove(paramObject);
    AppMethodBeat.o(116063);
  }

  public final void resume()
  {
    AppMethodBeat.i(116061);
    this.eRw.lock();
    try
    {
      this.isPaused = false;
      this.eRx.signalAll();
      return;
    }
    finally
    {
      this.eRw.unlock();
      AppMethodBeat.o(116061);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.a.a.c
 * JD-Core Version:    0.6.2
 */
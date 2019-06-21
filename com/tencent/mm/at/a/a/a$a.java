package com.tencent.mm.at.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.h;
import com.tencent.mm.sdk.g.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

final class a$a extends c
  implements h
{
  private ReentrantLock eRw;
  private Condition eRx;
  private BlockingQueue<Runnable> eRy;
  private boolean isPaused;

  public a$a(int paramInt1, int paramInt2, BlockingQueue<Runnable> paramBlockingQueue)
  {
    super("image_loader_", paramInt1, paramInt2, paramBlockingQueue);
    AppMethodBeat.i(116048);
    this.eRw = new ReentrantLock();
    this.eRx = this.eRw.newCondition();
    this.eRy = paramBlockingQueue;
    AppMethodBeat.o(116048);
  }

  public final boolean DA()
  {
    return this.isPaused;
  }

  public final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    AppMethodBeat.i(116049);
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
        AppMethodBeat.o(116049);
      }
    }
    finally
    {
      this.eRw.unlock();
      AppMethodBeat.o(116049);
    }
    throw paramThread;
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(116052);
    super.execute(paramRunnable);
    AppMethodBeat.o(116052);
  }

  public final boolean isShutdown()
  {
    AppMethodBeat.i(116054);
    boolean bool = super.isShutdown();
    AppMethodBeat.o(116054);
    return bool;
  }

  public final void pause()
  {
    AppMethodBeat.i(116050);
    this.eRw.lock();
    try
    {
      this.isPaused = true;
      return;
    }
    finally
    {
      this.eRw.unlock();
      AppMethodBeat.o(116050);
    }
  }

  public final void remove(Object paramObject)
  {
    AppMethodBeat.i(116053);
    if (this.eRy != null)
      this.eRy.remove(paramObject);
    AppMethodBeat.o(116053);
  }

  public final void resume()
  {
    AppMethodBeat.i(116051);
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
      AppMethodBeat.o(116051);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.a.a.a
 * JD-Core Version:    0.6.2
 */
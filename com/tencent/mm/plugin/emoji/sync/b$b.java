package com.tencent.mm.plugin.emoji.sync;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.h;
import com.tencent.mm.sdk.g.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class b$b extends c
  implements h
{
  private ReentrantLock eRw;
  private Condition eRx;
  private boolean isPaused;

  public b$b(int paramInt1, int paramInt2, BlockingQueue<Runnable> paramBlockingQueue)
  {
    super("bkg_loader_", paramInt1, paramInt2, paramBlockingQueue);
    AppMethodBeat.i(53174);
    this.eRw = new ReentrantLock();
    this.eRx = this.eRw.newCondition();
    AppMethodBeat.o(53174);
  }

  public final boolean DA()
  {
    return this.isPaused;
  }

  public final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    AppMethodBeat.i(53175);
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
        AppMethodBeat.o(53175);
      }
    }
    finally
    {
      this.eRw.unlock();
      AppMethodBeat.o(53175);
    }
    throw paramThread;
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(53178);
    super.execute(paramRunnable);
    AppMethodBeat.o(53178);
  }

  public final boolean isShutdown()
  {
    AppMethodBeat.i(53179);
    boolean bool = super.isShutdown();
    AppMethodBeat.o(53179);
    return bool;
  }

  public final void pause()
  {
    AppMethodBeat.i(53176);
    this.eRw.lock();
    try
    {
      this.isPaused = true;
      return;
    }
    finally
    {
      this.eRw.unlock();
      AppMethodBeat.o(53176);
    }
  }

  public final void remove(Object paramObject)
  {
  }

  public final void resume()
  {
    AppMethodBeat.i(53177);
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
      AppMethodBeat.o(53177);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.sync.b.b
 * JD-Core Version:    0.6.2
 */
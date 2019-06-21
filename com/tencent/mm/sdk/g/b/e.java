package com.tencent.mm.sdk.g.b;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.b;
import com.tencent.mm.sdk.g.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final class e
  implements a
{
  public a xEB;

  public e(b paramb, d.a parama)
  {
    AppMethodBeat.i(52668);
    a locala = new a((byte)0);
    int j = Runtime.getRuntime().availableProcessors() * 6;
    if (j > 42)
      j = i;
    while (true)
    {
      LinkedBlockingQueue localLinkedBlockingQueue = new LinkedBlockingQueue(j * 2);
      ab.i("MicroMsg.ThreadPoolExecutorProxy", "isHandlerThreadPool:%s coreSize:%s", new Object[] { Boolean.TRUE, Integer.valueOf(j) });
      this.xEB = new b.1(j, Math.round(0.8F * j), localLinkedBlockingQueue, c.xEI, locala, parama, paramb);
      AppMethodBeat.o(52668);
      return;
      if (j < 28)
        j = 28;
    }
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(52669);
    this.xEB.execute(paramRunnable);
    AppMethodBeat.o(52669);
  }

  public final int getCorePoolSize()
  {
    AppMethodBeat.i(52674);
    int i = this.xEB.getCorePoolSize();
    AppMethodBeat.o(52674);
    return i;
  }

  public final void p(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(52673);
    this.xEB.p(paramRunnable, paramLong);
    AppMethodBeat.o(52673);
  }

  public final boolean remove(Runnable paramRunnable)
  {
    AppMethodBeat.i(52670);
    boolean bool = this.xEB.remove(paramRunnable);
    AppMethodBeat.o(52670);
    return bool;
  }

  public final void reset()
  {
    AppMethodBeat.i(52672);
    this.xEB.reset();
    AppMethodBeat.o(52672);
  }

  public final void shutdown()
  {
    AppMethodBeat.i(52671);
    this.xEB.shutdown();
    AppMethodBeat.o(52671);
  }

  final class a
    implements d.b, RejectedExecutionHandler
  {
    public HandlerThread xEC;
    Handler xED;

    private a()
    {
      AppMethodBeat.i(52664);
      this.xEC = c.anN("ThreadPool#FallBackExecutor");
      this.xED = null;
      AppMethodBeat.o(52664);
    }

    private void au(Runnable paramRunnable)
    {
      AppMethodBeat.i(52665);
      if (this.xED == null);
      synchronized (this.xEC)
      {
        if (this.xED == null)
        {
          if (!this.xEC.isAlive())
            this.xEC.start();
          Handler localHandler = new android/os/Handler;
          localHandler.<init>(this.xEC.getLooper());
          this.xED = localHandler;
        }
        this.xED.post(paramRunnable);
        AppMethodBeat.o(52665);
        return;
      }
    }

    public final void at(Runnable paramRunnable)
    {
      AppMethodBeat.i(52666);
      au(paramRunnable);
      AppMethodBeat.o(52666);
    }

    public final void rejectedExecution(Runnable paramRunnable, ThreadPoolExecutor paramThreadPoolExecutor)
    {
      AppMethodBeat.i(52667);
      au(paramRunnable);
      AppMethodBeat.o(52667);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.b.e
 * JD-Core Version:    0.6.2
 */
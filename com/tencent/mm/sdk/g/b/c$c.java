package com.tencent.mm.sdk.g.b;

import android.os.Build.VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d.b;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

final class c$c extends AbstractQueuedSynchronizer
  implements b
{
  volatile int id;
  Runnable xEq;
  volatile long xEr;

  c$c(c paramc, Runnable paramRunnable)
  {
    AppMethodBeat.i(52595);
    setState(-1);
    this.xEq = paramRunnable;
    AppMethodBeat.o(52595);
  }

  public static boolean dqj()
  {
    AppMethodBeat.i(52596);
    boolean bool;
    if (Build.VERSION.SDK_INT >= 23)
    {
      bool = Looper.myLooper().getQueue().isIdle();
      AppMethodBeat.o(52596);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52596);
    }
  }

  public final String getKey()
  {
    AppMethodBeat.i(52602);
    String str = "ForkThreadPool#" + c.a(this.xEp) + this.id;
    AppMethodBeat.o(52602);
    return str;
  }

  protected final boolean isHeldExclusively()
  {
    AppMethodBeat.i(52598);
    boolean bool;
    if (getState() != 0)
    {
      bool = true;
      AppMethodBeat.o(52598);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52598);
    }
  }

  public final boolean isLocked()
  {
    AppMethodBeat.i(52601);
    boolean bool = isHeldExclusively();
    AppMethodBeat.o(52601);
    return bool;
  }

  public final void run()
  {
    AppMethodBeat.i(52597);
    this.xEp.b(this);
    AppMethodBeat.o(52597);
  }

  protected final boolean tryAcquire(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(52599);
    if (compareAndSetState(0, 1))
    {
      setExclusiveOwnerThread(Thread.currentThread());
      AppMethodBeat.o(52599);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(52599);
      bool = false;
    }
  }

  protected final boolean tryRelease(int paramInt)
  {
    AppMethodBeat.i(52600);
    setExclusiveOwnerThread(null);
    setState(0);
    AppMethodBeat.o(52600);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.b.c.c
 * JD-Core Version:    0.6.2
 */
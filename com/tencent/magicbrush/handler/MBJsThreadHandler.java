package com.tencent.magicbrush.handler;

import android.support.annotation.Keep;
import com.tencent.magicbrush.d.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MBJsThreadHandler
  implements a
{
  private a bSO;
  private final ReadWriteLock bSP;
  private volatile boolean mDestroyed;
  private long mNativeInst;

  public MBJsThreadHandler(a parama)
  {
    AppMethodBeat.i(115898);
    this.mDestroyed = false;
    this.bSP = new ReentrantReadWriteLock();
    this.bSO = parama;
    AppMethodBeat.o(115898);
  }

  private native long nativeCreate(long paramLong);

  private native void nativeHandleMessage(long paramLong, int paramInt);

  public final <T> T a(Callable<T> paramCallable)
  {
    AppMethodBeat.i(115902);
    paramCallable = new b(paramCallable);
    i(paramCallable);
    paramCallable = paramCallable.get();
    AppMethodBeat.o(115902);
    return paramCallable;
  }

  @Keep
  public void destroy()
  {
    AppMethodBeat.i(115899);
    this.bSP.writeLock().lock();
    try
    {
      this.mDestroyed = true;
      this.mNativeInst = 0L;
      return;
    }
    finally
    {
      this.bSP.writeLock().unlock();
      AppMethodBeat.o(115899);
    }
  }

  public final void f(Runnable paramRunnable)
  {
    AppMethodBeat.i(115900);
    this.bSO.f(paramRunnable);
    AppMethodBeat.o(115900);
  }

  public final void i(Runnable paramRunnable)
  {
    AppMethodBeat.i(115903);
    if (this.bSO.yE())
    {
      paramRunnable.run();
      AppMethodBeat.o(115903);
    }
    while (true)
    {
      return;
      this.bSO.f(paramRunnable);
      AppMethodBeat.o(115903);
    }
  }

  @Keep
  public void sendMessage(int paramInt)
  {
  }

  public final boolean yE()
  {
    AppMethodBeat.i(115901);
    boolean bool = this.bSO.yE();
    AppMethodBeat.o(115901);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.MBJsThreadHandler
 * JD-Core Version:    0.6.2
 */
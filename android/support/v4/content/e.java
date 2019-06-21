package android.support.v4.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class e<Params, Progress, Result>
{
  private static final BlockingQueue<Runnable> Gw;
  private static b Gx;
  private static volatile Executor Gy = localThreadPoolExecutor;
  public static final Executor THREAD_POOL_EXECUTOR;
  private static final ThreadFactory sThreadFactory = new e.1();
  final FutureTask<Result> GA = new e.3(this, this.Gz);
  volatile e.c GB = e.c.GI;
  final AtomicBoolean GC = new AtomicBoolean();
  private final AtomicBoolean GD = new AtomicBoolean();
  final e.d<Params, Result> Gz = new e.2(this);

  static
  {
    Gw = new LinkedBlockingQueue(10);
    ThreadPoolExecutor localThreadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, Gw, sThreadFactory);
    THREAD_POOL_EXECUTOR = localThreadPoolExecutor;
  }

  private static Handler getHandler()
  {
    try
    {
      if (Gx == null)
      {
        localb = new android/support/v4/content/e$b;
        localb.<init>();
        Gx = localb;
      }
      b localb = Gx;
      return localb;
    }
    finally
    {
    }
  }

  protected abstract Result dv();

  final void n(Result paramResult)
  {
    if (!this.GD.get())
      o(paramResult);
  }

  final Result o(Result paramResult)
  {
    getHandler().obtainMessage(1, new e.a(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }

  protected void onCancelled(Result paramResult)
  {
  }

  protected void onPostExecute(Result paramResult)
  {
  }

  final void p(Result paramResult)
  {
    if (this.GC.get())
      onCancelled(paramResult);
    while (true)
    {
      this.GB = e.c.GK;
      return;
      onPostExecute(paramResult);
    }
  }

  static final class b extends Handler
  {
    b()
    {
      super();
    }

    public final void handleMessage(Message paramMessage)
    {
      e.a locala = (e.a)paramMessage.obj;
      switch (paramMessage.what)
      {
      default:
      case 1:
      }
      while (true)
      {
        return;
        locala.GG.p(locala.GH[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.content.e
 * JD-Core Version:    0.6.2
 */
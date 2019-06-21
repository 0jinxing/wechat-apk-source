package android.arch.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class b extends c
{
  private ExecutorService bQ = Executors.newFixedThreadPool(2);
  private final Object mLock = new Object();
  private volatile Handler mMainHandler;

  public final void c(Runnable paramRunnable)
  {
    this.bQ.execute(paramRunnable);
  }

  public final void d(Runnable paramRunnable)
  {
    if (this.mMainHandler == null);
    synchronized (this.mLock)
    {
      if (this.mMainHandler == null)
      {
        Handler localHandler = new android/os/Handler;
        localHandler.<init>(Looper.getMainLooper());
        this.mMainHandler = localHandler;
      }
      this.mMainHandler.post(paramRunnable);
      return;
    }
  }

  public final boolean isMainThread()
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread());
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.arch.a.a.b
 * JD-Core Version:    0.6.2
 */
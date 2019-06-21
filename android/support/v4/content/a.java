package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.f.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a<D> extends c<D>
{
  static final boolean DEBUG = false;
  static final String TAG = "AsyncTaskLoader";
  volatile a<D>.a mCancellingTask;
  private final Executor mExecutor;
  Handler mHandler;
  long mLastLoadCompleteTime = -10000L;
  volatile a<D>.a mTask;
  long mUpdateThrottle;

  public a(Context paramContext)
  {
    this(paramContext, e.THREAD_POOL_EXECUTOR);
  }

  private a(Context paramContext, Executor paramExecutor)
  {
    super(paramContext);
    this.mExecutor = paramExecutor;
  }

  public void cancelLoadInBackground()
  {
  }

  void dispatchOnCancelled(a<D>.a parama, D paramD)
  {
    onCanceled(paramD);
    if (this.mCancellingTask == parama)
    {
      rollbackContentChanged();
      this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
      this.mCancellingTask = null;
      deliverCancellation();
      executePendingTask();
    }
  }

  void dispatchOnLoadComplete(a<D>.a parama, D paramD)
  {
    if (this.mTask != parama)
      dispatchOnCancelled(parama, paramD);
    while (true)
    {
      return;
      if (isAbandoned())
      {
        onCanceled(paramD);
      }
      else
      {
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(paramD);
      }
    }
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (this.mTask != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramPrintWriter.print(this.mTask);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.mTask.Gi);
    }
    if (this.mCancellingTask != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramPrintWriter.print(this.mCancellingTask);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.mCancellingTask.Gi);
    }
    if (this.mUpdateThrottle != 0L)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      o.b(this.mUpdateThrottle, paramPrintWriter);
      paramPrintWriter.print(" mLastLoadCompleteTime=");
      o.a(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), paramPrintWriter);
      paramPrintWriter.println();
    }
  }

  void executePendingTask()
  {
    if ((this.mCancellingTask == null) && (this.mTask != null))
    {
      if (this.mTask.Gi)
      {
        this.mTask.Gi = false;
        this.mHandler.removeCallbacks(this.mTask);
      }
      if ((this.mUpdateThrottle <= 0L) || (SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle))
        break label98;
      this.mTask.Gi = true;
      this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
    }
    while (true)
    {
      return;
      label98: a.a locala = this.mTask;
      Executor localExecutor = this.mExecutor;
      if (locala.GB != e.c.GI)
      {
        switch (e.4.GF[locala.GB.ordinal()])
        {
        default:
          throw new IllegalStateException("We should never reach this state");
        case 1:
          throw new IllegalStateException("Cannot execute task: the task is already running.");
        case 2:
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
      }
      locala.GB = e.c.GJ;
      locala.Gz.GM = null;
      localExecutor.execute(locala.GA);
    }
  }

  public boolean isLoadInBackgroundCanceled()
  {
    if (this.mCancellingTask != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract D loadInBackground();

  protected boolean onCancelLoad()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.mTask != null)
    {
      if (!this.mStarted)
        this.mContentChanged = true;
      if (this.mCancellingTask == null)
        break label68;
      if (this.mTask.Gi)
      {
        this.mTask.Gi = false;
        this.mHandler.removeCallbacks(this.mTask);
      }
      this.mTask = null;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label68: if (this.mTask.Gi)
      {
        this.mTask.Gi = false;
        this.mHandler.removeCallbacks(this.mTask);
        this.mTask = null;
        bool2 = bool1;
      }
      else
      {
        a.a locala = this.mTask;
        locala.GC.set(true);
        bool2 = locala.GA.cancel(false);
        if (bool2)
        {
          this.mCancellingTask = this.mTask;
          cancelLoadInBackground();
        }
        this.mTask = null;
      }
    }
  }

  public void onCanceled(D paramD)
  {
  }

  protected void onForceLoad()
  {
    super.onForceLoad();
    cancelLoad();
    this.mTask = new a.a(this);
    executePendingTask();
  }

  protected D onLoadInBackground()
  {
    return loadInBackground();
  }

  public void setUpdateThrottle(long paramLong)
  {
    this.mUpdateThrottle = paramLong;
    if (paramLong != 0L)
      this.mHandler = new Handler();
  }

  public void waitForLoader()
  {
    a.a locala = this.mTask;
    if (locala != null);
    try
    {
      locala.Gh.await();
      label16: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label16;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.content.a
 * JD-Core Version:    0.6.2
 */
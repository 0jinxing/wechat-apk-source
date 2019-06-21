package kotlinx.coroutines;

import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/TimeSource;", "", "currentTimeMillis", "", "nanoTime", "parkNanos", "", "blocker", "nanos", "registerTimeLoopThread", "trackTask", "unTrackTask", "unpark", "thread", "Ljava/lang/Thread;", "unregisterTimeLoopThread", "wrapTask", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "kotlinx-coroutines-core"})
public abstract interface br
{
  public abstract Runnable aD(Runnable paramRunnable);

  public abstract long nanoTime();

  public abstract void parkNanos(Object paramObject, long paramLong);

  public abstract void unpark(Thread paramThread);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.br
 * JD-Core Version:    0.6.2
 */
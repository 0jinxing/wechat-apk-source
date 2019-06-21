package kotlinx.coroutines;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.locks.LockSupport;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/DefaultTimeSource;", "Lkotlinx/coroutines/TimeSource;", "()V", "currentTimeMillis", "", "nanoTime", "parkNanos", "", "blocker", "", "nanos", "registerTimeLoopThread", "trackTask", "unTrackTask", "unpark", "thread", "Ljava/lang/Thread;", "unregisterTimeLoopThread", "wrapTask", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "kotlinx-coroutines-core"})
public final class ai
  implements br
{
  public static final ai BPY;

  static
  {
    AppMethodBeat.i(118522);
    BPY = new ai();
    AppMethodBeat.o(118522);
  }

  public final Runnable aD(Runnable paramRunnable)
  {
    AppMethodBeat.i(118519);
    j.p(paramRunnable, "block");
    AppMethodBeat.o(118519);
    return paramRunnable;
  }

  public final long nanoTime()
  {
    AppMethodBeat.i(118518);
    long l = System.nanoTime();
    AppMethodBeat.o(118518);
    return l;
  }

  public final void parkNanos(Object paramObject, long paramLong)
  {
    AppMethodBeat.i(118520);
    j.p(paramObject, "blocker");
    LockSupport.parkNanos(paramObject, paramLong);
    AppMethodBeat.o(118520);
  }

  public final void unpark(Thread paramThread)
  {
    AppMethodBeat.i(118521);
    j.p(paramThread, "thread");
    LockSupport.unpark(paramThread);
    AppMethodBeat.o(118521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.ai
 * JD-Core Version:    0.6.2
 */
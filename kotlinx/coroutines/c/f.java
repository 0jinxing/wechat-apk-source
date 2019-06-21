package kotlinx.coroutines.c;

import a.c.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.av;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/LimitingDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/scheduling/TaskContext;", "Ljava/util/concurrent/Executor;", "dispatcher", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "parallelism", "", "taskMode", "Lkotlinx/coroutines/scheduling/TaskMode;", "(Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;ILkotlinx/coroutines/scheduling/TaskMode;)V", "getDispatcher", "()Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "executor", "getExecutor", "()Ljava/util/concurrent/Executor;", "inFlightTasks", "Lkotlinx/atomicfu/AtomicInt;", "getParallelism", "()I", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getTaskMode", "()Lkotlinx/coroutines/scheduling/TaskMode;", "afterTask", "", "close", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "fair", "", "execute", "command", "toString", "", "kotlinx-coroutines-core"})
final class f extends av
  implements Executor, j
{
  private static final AtomicIntegerFieldUpdater BSG;
  private final ConcurrentLinkedQueue<Runnable> BSE;
  private volatile int BSF;
  private final d BSH;
  private final int BSI;
  private final l BSJ;

  static
  {
    AppMethodBeat.i(118364);
    BSG = AtomicIntegerFieldUpdater.newUpdater(f.class, "BSF");
    AppMethodBeat.o(118364);
  }

  public f(d paramd, int paramInt, l paraml)
  {
    AppMethodBeat.i(118363);
    this.BSH = paramd;
    this.BSI = paramInt;
    this.BSJ = paraml;
    this.BSE = new ConcurrentLinkedQueue();
    this.BSF = 0;
    AppMethodBeat.o(118363);
  }

  private final void b(Runnable paramRunnable, boolean paramBoolean)
  {
    AppMethodBeat.i(118360);
    while (true)
    {
      if (BSG.incrementAndGet(this) <= this.BSI)
      {
        this.BSH.b(paramRunnable, (j)this, paramBoolean);
        AppMethodBeat.o(118360);
      }
      while (true)
      {
        return;
        this.BSE.add(paramRunnable);
        if (BSG.decrementAndGet(this) >= this.BSI)
        {
          AppMethodBeat.o(118360);
        }
        else
        {
          paramRunnable = (Runnable)this.BSE.poll();
          if (paramRunnable != null)
            break;
          AppMethodBeat.o(118360);
        }
      }
    }
  }

  public final void a(e parame, Runnable paramRunnable)
  {
    AppMethodBeat.i(118359);
    a.f.b.j.p(parame, "context");
    a.f.b.j.p(paramRunnable, "block");
    b(paramRunnable, false);
    AppMethodBeat.o(118359);
  }

  public final void close()
  {
    AppMethodBeat.i(118358);
    Throwable localThrowable = (Throwable)new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    AppMethodBeat.o(118358);
    throw localThrowable;
  }

  public final void emj()
  {
    AppMethodBeat.i(118362);
    Runnable localRunnable = (Runnable)this.BSE.poll();
    if (localRunnable != null)
    {
      this.BSH.b(localRunnable, (j)this, true);
      AppMethodBeat.o(118362);
    }
    while (true)
    {
      return;
      BSG.decrementAndGet(this);
      localRunnable = (Runnable)this.BSE.poll();
      if (localRunnable == null)
      {
        AppMethodBeat.o(118362);
      }
      else
      {
        b(localRunnable, true);
        AppMethodBeat.o(118362);
      }
    }
  }

  public final l emk()
  {
    return this.BSJ;
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(118357);
    a.f.b.j.p(paramRunnable, "command");
    b(paramRunnable, false);
    AppMethodBeat.o(118357);
  }

  public final String toString()
  {
    AppMethodBeat.i(118361);
    String str = super.toString() + "[dispatcher = " + this.BSH + ']';
    AppMethodBeat.o(118361);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.f
 * JD-Core Version:    0.6.2
 */
package kotlinx.coroutines.c;

import a.c.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.av;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "corePoolSize", "", "maxPoolSize", "schedulerName", "", "(IILjava/lang/String;)V", "(II)V", "idleWorkerKeepAliveNs", "", "(IIJLjava/lang/String;)V", "coroutineScheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "blocking", "Lkotlinx/coroutines/CoroutineDispatcher;", "parallelism", "close", "", "createScheduler", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchWithContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "", "dispatchWithContext$kotlinx_coroutines_core", "dispatchYield", "limited", "restore", "restore$kotlinx_coroutines_core", "shutdown", "timeout", "shutdown$kotlinx_coroutines_core", "toString", "usePrivateScheduler", "usePrivateScheduler$kotlinx_coroutines_core", "kotlinx-coroutines-core"})
public class d extends av
{
  private a BSD;
  private final int BSc;
  private final long BSd;
  private final String BSe;
  private final int cml;

  private d(int paramInt1, int paramInt2, long paramLong, String paramString)
  {
    AppMethodBeat.i(118294);
    this.cml = paramInt1;
    this.BSc = paramInt2;
    this.BSd = paramLong;
    this.BSe = paramString;
    this.BSD = new a(this.cml, this.BSc, this.BSd, this.BSe);
    AppMethodBeat.o(118294);
  }

  private d(int paramInt1, int paramInt2, String paramString)
  {
    this(paramInt1, paramInt2, m.BSW, paramString);
    AppMethodBeat.i(118295);
    AppMethodBeat.o(118295);
  }

  public final void a(e parame, Runnable paramRunnable)
  {
    AppMethodBeat.i(118290);
    a.f.b.j.p(parame, "context");
    a.f.b.j.p(paramRunnable, "block");
    try
    {
      a.a(this.BSD, paramRunnable);
      AppMethodBeat.o(118290);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      while (true)
      {
        ag.BPW.a(parame, paramRunnable);
        AppMethodBeat.o(118290);
      }
    }
  }

  public final void b(Runnable paramRunnable, j paramj, boolean paramBoolean)
  {
    AppMethodBeat.i(118293);
    a.f.b.j.p(paramRunnable, "block");
    a.f.b.j.p(paramj, "context");
    try
    {
      this.BSD.a(paramRunnable, paramj, paramBoolean);
      AppMethodBeat.o(118293);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      while (true)
      {
        ag.BPW.aE((Runnable)a.a(paramRunnable, paramj));
        AppMethodBeat.o(118293);
      }
    }
  }

  public void close()
  {
    AppMethodBeat.i(118291);
    this.BSD.close();
    AppMethodBeat.o(118291);
  }

  public String toString()
  {
    AppMethodBeat.i(118292);
    String str = super.toString() + "[scheduler = " + this.BSD + ']';
    AppMethodBeat.o(118292);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.d
 * JD-Core Version:    0.6.2
 */
package kotlinx.coroutines.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.af;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "submissionTime", "", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/TaskContext;)V", "run", "", "toString", "", "kotlinx-coroutines-core"})
public final class k extends i
{
  public final Runnable BSO;

  public k(Runnable paramRunnable, long paramLong, j paramj)
  {
    super(paramLong, paramj);
    AppMethodBeat.i(118316);
    this.BSO = paramRunnable;
    AppMethodBeat.o(118316);
  }

  public final void run()
  {
    AppMethodBeat.i(118314);
    try
    {
      this.BSO.run();
      return;
    }
    finally
    {
      this.BSN.emj();
      AppMethodBeat.o(118314);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(118315);
    String str = "Task[" + af.ef(this.BSO) + '@' + af.ee(this.BSO) + ", " + this.BSM + ", " + this.BSN + ']';
    AppMethodBeat.o(118315);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.k
 * JD-Core Version:    0.6.2
 */
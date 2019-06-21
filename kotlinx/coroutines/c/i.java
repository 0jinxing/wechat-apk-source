package kotlinx.coroutines.c;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/Task;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "submissionTime", "", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "(JLkotlinx/coroutines/scheduling/TaskContext;)V", "mode", "Lkotlinx/coroutines/scheduling/TaskMode;", "getMode", "()Lkotlinx/coroutines/scheduling/TaskMode;", "kotlinx-coroutines-core"})
public abstract class i
  implements Runnable
{
  public long BSM;
  public j BSN;

  public i()
  {
    this(0L, (j)h.BSL);
  }

  public i(long paramLong, j paramj)
  {
    this.BSM = paramLong;
    this.BSN = paramj;
  }

  public final l eml()
  {
    return this.BSN.emk();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.i
 * JD-Core Version:    0.6.2
 */
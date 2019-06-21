package kotlinx.coroutines;

import a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobCancellingNode;", "Lkotlinx/coroutines/Job;", "parent", "child", "Lkotlinx/coroutines/AbstractContinuation;", "(Lkotlinx/coroutines/Job;Lkotlinx/coroutines/AbstractContinuation;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"})
public final class l extends be<bc>
{
  public final a<?> BPz;

  public l(bc parambc, a<?> parama)
  {
    super(parambc);
    AppMethodBeat.i(118542);
    this.BPz = parama;
    AppMethodBeat.o(118542);
  }

  public final String toString()
  {
    AppMethodBeat.i(118541);
    String str = "ChildContinuation[" + this.BPz + ']';
    AppMethodBeat.o(118541);
    return str;
  }

  public final void v(Throwable paramThrowable)
  {
    AppMethodBeat.i(118539);
    a locala = this.BPz;
    Throwable localThrowable = a.a(this.BQz);
    Object localObject;
    do
    {
      localObject = locala.BPs;
      if (!(localObject instanceof bm))
        break;
      paramThrowable = new k((c)locala, localThrowable);
    }
    while (!locala.a((bm)localObject, paramThrowable, 0));
    AppMethodBeat.o(118539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.l
 * JD-Core Version:    0.6.2
 */
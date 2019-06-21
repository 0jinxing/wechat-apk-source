package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"})
final class bg$a extends bf<bc>
{
  private final bg BQB;
  private final bg.b BQC;
  private final n BQD;
  private final Object BQE;

  public bg$a(bg parambg, bg.b paramb, n paramn, Object paramObject)
  {
    super((bc)paramn.BPA);
    AppMethodBeat.i(118573);
    this.BQB = parambg;
    this.BQC = paramb;
    this.BQD = paramn;
    this.BQE = paramObject;
    AppMethodBeat.o(118573);
  }

  public final String toString()
  {
    AppMethodBeat.i(118572);
    String str = "ChildCompletion[" + this.BQD + ", " + this.BQE + ']';
    AppMethodBeat.o(118572);
    return str;
  }

  public final void v(Throwable paramThrowable)
  {
    AppMethodBeat.i(118570);
    bg.a(this.BQB, this.BQC, this.BQD, this.BQE);
    AppMethodBeat.o(118570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bg.a
 * JD-Core Version:    0.6.2
 */
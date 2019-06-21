package kotlinx.coroutines;

import a.f.a.b;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/InvokeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/Job;", "job", "handler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function1;)V", "invoke", "toString", "", "kotlinx-coroutines-core"})
final class bb extends bf<bc>
{
  private final b<Throwable, y> BQu;

  public bb(bc parambc, b<? super Throwable, y> paramb)
  {
    super(parambc);
    AppMethodBeat.i(118381);
    this.BQu = paramb;
    AppMethodBeat.o(118381);
  }

  public final String toString()
  {
    AppMethodBeat.i(118380);
    String str = "InvokeOnCompletion[" + af.ef(this) + '@' + af.ee(this) + ']';
    AppMethodBeat.o(118380);
    return str;
  }

  public final void v(Throwable paramThrowable)
  {
    AppMethodBeat.i(118378);
    this.BQu.am(paramThrowable);
    AppMethodBeat.o(118378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bb
 * JD-Core Version:    0.6.2
 */
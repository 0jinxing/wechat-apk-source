package kotlinx.coroutines;

import a.c.e;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/Unconfined;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "isDispatchNeeded", "", "toString", "", "kotlinx-coroutines-core"})
public final class bt extends w
{
  public static final bt BQR;

  static
  {
    AppMethodBeat.i(118489);
    BQR = new bt();
    AppMethodBeat.o(118489);
  }

  public final void a(e parame, Runnable paramRunnable)
  {
    AppMethodBeat.i(118488);
    j.p(parame, "context");
    j.p(paramRunnable, "block");
    parame = (Throwable)new UnsupportedOperationException();
    AppMethodBeat.o(118488);
    throw parame;
  }

  public final boolean b(e parame)
  {
    AppMethodBeat.i(118487);
    j.p(parame, "context");
    AppMethodBeat.o(118487);
    return false;
  }

  public final String toString()
  {
    return "Unconfined";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bt
 * JD-Core Version:    0.6.2
 */
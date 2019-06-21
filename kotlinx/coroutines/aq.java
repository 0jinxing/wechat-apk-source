package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/DisposeOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "(Lkotlinx/coroutines/DisposableHandle;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"})
final class aq extends g
{
  private final ap BQi;

  public aq(ap paramap)
  {
    AppMethodBeat.i(118370);
    this.BQi = paramap;
    AppMethodBeat.o(118370);
  }

  public final String toString()
  {
    AppMethodBeat.i(118369);
    String str = "DisposeOnCancel[" + this.BQi + ']';
    AppMethodBeat.o(118369);
    return str;
  }

  public final void v(Throwable paramThrowable)
  {
    AppMethodBeat.i(118367);
    this.BQi.dispose();
    AppMethodBeat.o(118367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.aq
 * JD-Core Version:    0.6.2
 */
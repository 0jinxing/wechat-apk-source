package kotlinx.coroutines;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/NonDisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/ChildHandle;", "()V", "childCancelled", "", "cause", "", "dispose", "", "toString", "", "kotlinx-coroutines-core"})
public final class bl
  implements ap, m
{
  public static final bl BQP;

  static
  {
    AppMethodBeat.i(118506);
    BQP = new bl();
    AppMethodBeat.o(118506);
  }

  public final void dispose()
  {
  }

  public final String toString()
  {
    return "NonDisposableHandle";
  }

  public final boolean x(Throwable paramThrowable)
  {
    AppMethodBeat.i(118505);
    j.p(paramThrowable, "cause");
    AppMethodBeat.o(118505);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bl
 * JD-Core Version:    0.6.2
 */
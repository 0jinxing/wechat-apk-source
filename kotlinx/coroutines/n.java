package kotlinx.coroutines;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/ChildHandleNode;", "Lkotlinx/coroutines/JobCancellingNode;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/ChildHandle;", "parent", "childJob", "Lkotlinx/coroutines/ChildJob;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/ChildJob;)V", "childCancelled", "", "cause", "", "invoke", "", "toString", "", "kotlinx-coroutines-core"})
public final class n extends be<bg>
  implements m
{
  public final o BPA;

  public n(bg parambg, o paramo)
  {
    super((bc)parambg);
    AppMethodBeat.i(118512);
    this.BPA = paramo;
    AppMethodBeat.o(118512);
  }

  public final String toString()
  {
    AppMethodBeat.i(118511);
    String str = "ChildHandle[" + this.BPA + ']';
    AppMethodBeat.o(118511);
    return str;
  }

  public final void v(Throwable paramThrowable)
  {
    AppMethodBeat.i(118508);
    this.BPA.a((bn)this.BQz);
    AppMethodBeat.o(118508);
  }

  public final boolean x(Throwable paramThrowable)
  {
    AppMethodBeat.i(118510);
    j.p(paramThrowable, "cause");
    bg localbg = (bg)this.BQz;
    j.p(paramThrowable, "cause");
    boolean bool;
    if (localbg.ei(paramThrowable))
    {
      bool = true;
      AppMethodBeat.o(118510);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118510);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.n
 * JD-Core Version:    0.6.2
 */
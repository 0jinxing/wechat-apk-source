package kotlinx.coroutines;

import a.c.e;
import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/StandaloneCoroutine;", "Lkotlinx/coroutines/AbstractCoroutine;", "", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "active", "", "(Lkotlin/coroutines/CoroutineContext;Z)V", "cancelsParent", "getCancelsParent", "()Z", "handleJobException", "exception", "", "kotlinx-coroutines-core"})
class bp extends c<y>
{
  public bp(e parame, boolean paramBoolean)
  {
    super(parame, paramBoolean);
    AppMethodBeat.i(118463);
    AppMethodBeat.o(118463);
  }

  protected final boolean elw()
  {
    return true;
  }

  protected final void z(Throwable paramThrowable)
  {
    AppMethodBeat.i(118462);
    j.p(paramThrowable, "exception");
    z.b(this.BPy, paramThrowable);
    AppMethodBeat.o(118462);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bp
 * JD-Core Version:    0.6.2
 */
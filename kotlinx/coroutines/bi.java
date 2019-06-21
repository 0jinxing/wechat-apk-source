package kotlinx.coroutines;

import a.c.c;
import a.c.e;
import a.f.a.m;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/LazyStandaloneCoroutine;", "Lkotlinx/coroutines/StandaloneCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "onStart", "kotlinx-coroutines-core"})
final class bi extends bp
{
  private final m<ac, c<? super y>, Object> BQO;

  public bi(e parame, m<? super ac, ? super c<? super y>, ? extends Object> paramm)
  {
    super(parame, false);
    AppMethodBeat.i(118470);
    this.BQO = paramm;
    AppMethodBeat.o(118470);
  }

  protected final void onStart()
  {
    AppMethodBeat.i(118469);
    a.b(this.BQO, this, (c)this);
    AppMethodBeat.o(118469);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bi
 * JD-Core Version:    0.6.2
 */
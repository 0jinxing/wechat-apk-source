package kotlinx.coroutines.a;

import a.f.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;", "T", "Ljava/lang/ThreadLocal;", "supplier", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "initialValue", "()Ljava/lang/Object;", "kotlinx-coroutines-core"})
public final class p<T> extends ThreadLocal<T>
{
  private final a<T> BRR;

  public p(a<? extends T> parama)
  {
    AppMethodBeat.i(118383);
    this.BRR = parama;
    AppMethodBeat.o(118383);
  }

  protected final T initialValue()
  {
    AppMethodBeat.i(118382);
    Object localObject = this.BRR.invoke();
    AppMethodBeat.o(118382);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.p
 * JD-Core Version:    0.6.2
 */
package a.j;

import a.f.a.a;
import a.f.a.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"})
final class g<T>
  implements h<T>
{
  final a<T> BOD;
  final b<T, T> BOE;

  public g(a<? extends T> parama, b<? super T, ? extends T> paramb)
  {
    AppMethodBeat.i(55959);
    this.BOD = parama;
    this.BOE = paramb;
    AppMethodBeat.o(55959);
  }

  public final Iterator<T> iterator()
  {
    AppMethodBeat.i(55958);
    Iterator localIterator = (Iterator)new g.a(this);
    AppMethodBeat.o(55958);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.j.g
 * JD-Core Version:    0.6.2
 */
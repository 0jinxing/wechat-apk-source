package a.j;

import a.f.a.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"})
public final class o<T>
  implements h<T>
{
  final h<T> BOr;
  final b<T, Boolean> BOv;

  public o(h<? extends T> paramh, b<? super T, Boolean> paramb)
  {
    AppMethodBeat.i(55976);
    this.BOr = paramh;
    this.BOv = paramb;
    AppMethodBeat.o(55976);
  }

  public final Iterator<T> iterator()
  {
    AppMethodBeat.i(55975);
    Iterator localIterator = (Iterator)new o.a(this);
    AppMethodBeat.o(55975);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.j.o
 * JD-Core Version:    0.6.2
 */